import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Client {

    private static final String HOST = "127.0.0.1";
    private static final int PORT = 6000;

    public static void main(String[] args) {
        System.out.println("Cliente iniciando... conectando a " + HOST + ":" + PORT);

        try (Socket socket = new Socket(HOST, PORT);
             PrintWriter out = new PrintWriter(
                     new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8),
                     true // hacemos autoFlush
             )) {

            String mensaje = "Hola mundo";
            out.println(mensaje); // manda la línea (incluye \n)
            System.out.println("Mensaje enviado: " + mensaje);

        } catch (Exception e) {
            System.err.println("Error en cliente: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
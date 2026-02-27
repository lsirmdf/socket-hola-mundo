import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Server {

    private static final int PORT = 6000;

    public static void main(String[] args) {
        System.out.println("Servidor iniciado. Escuchando en puerto " + PORT + "...");

        try (ServerSocket serverSocket = new ServerSocket(PORT)) {

            // Aceptamos una conexión 
            try (Socket clientSocket = serverSocket.accept();
                 BufferedReader in = new BufferedReader(
                         new InputStreamReader(clientSocket.getInputStream(), StandardCharsets.UTF_8)
                 )) {

                System.out.println("Cliente conectado desde: " + clientSocket.getInetAddress());

                String mensaje = in.readLine(); // leemos una línea (hasta \n)
                System.out.println("Mensaje recibido: " + mensaje);

            }

            System.out.println("Servidor terminó (se aceptó 1 conexión).");

        } catch (Exception e) {
            System.err.println("Error en servidor: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
#Socket Hola Mundo Java TCP
Ejemplo simple de comunicación cliente-servidor utilizando sockets java

El cliente se conecta al servidor y envía el mensaje:

"Hola mundo"



#Requisitos

-Se testeó en java 25  
- Corre en java 17 o superior



##Ejecución del proyecto 


#Compilar los archivos

```bash
javac Server.java Client.java

### Ejecutar servidor en terminal 1
java Server

### Ejecutar servidor en terminal 2
java Client

### Funcionamiento general:
El servidor abre el puerto 6000 y queda en espera.

El cliente se conecta a esa dirección y puerto.

Se establece una conexión TCP.

El cliente envía el mensaje "Hola mundo".

El servidor recibe y muestra el mensaje.

La conexión se cierra automáticamente.




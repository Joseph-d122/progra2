package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped  //Le dice que esta clase sera manejada/gestionada por el contenedor. Haciendo inversion de control

public class NotificadorMail {

    public void enviar(String correo, String mensaje) {
        System.out.println("Se envia el mail al correo: " + correo + "\nCon el mensaje: " + mensaje);
    }
}


//Al dependency inyection: framework le delega la inyecta las instancias y creacion de objetos


package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class PedidoService {

    @Inject
    private NotificadorMail notificadorMail;
    public void registrar(Pedido pedido) {
        System.out.println("Registrando pedido...");
        System.out.println("cliente: "+ pedido.getCliente());
        System.out.println("Total: "+ pedido.getTotal());
        System.out.println("Guardando en la base de datos");

        //Sin inyeccion
        //NotificadorMail n1 = new NotificadorMail();
        //Con DI por el contenedor se encarga de crear la instancia y inyectarla
        notificadorMail.enviar(pedido.getCorreo(), "Su ha creado un pedido para ser atendido");
    }
}

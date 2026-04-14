package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class PedidoService {

    //@Inject
    // private NotificadorMail n1;
    
    //DI por Constructor
    
    //public PedidoService(NotificadorMail n1) {
    //    this.n1 = n1;

    // }

    //DI por Atributo

    //@Inject
    //private NotificadorMail n1;
    
    //DI por Metodo Setter

    private NotificadorMail n1;

    @Inject
    public void setN1(NotificadorMail n1) {
        this.n1 = n1;
    }

    public void registrar(Pedido pedido) {
        System.out.println("Registrando pedido...");
        System.out.println("cliente: "+ pedido.getCliente());
        System.out.println("Total: "+ pedido.getTotal());
        System.out.println("Guardando en la base de datos");

        //Sin inyeccion
        //NotificadorMail n1 = new NotificadorMail();
        n1 = new NotificadorMail(); //Con DI por el contenedor se encarga de crear la instancia y inyectarla
        n1.enviar(pedido.getCorreo(), "Su ha creado un pedido para ser atendido");
    }
}

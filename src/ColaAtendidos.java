import java.util.ArrayList;
import java.util.List;


public class ColaAtendidos {
	private List<Ticket> cola=new ArrayList<Ticket>();
	
	public void agregarTicket(Ticket ticket, String mensaje){
        ticket.agregarBitacora(mensaje, TipoEvento.SOLUCION);
        cola.add(ticket);
    }

}

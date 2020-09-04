import java.util.LinkedList;
import java.util.Queue;


public class ColaMesa extends ColaServicio {
	private Queue<Ticket> cola=new LinkedList<Ticket>();
	
	 public void agregarTicket(Ticket ticket, String mensaje){
	        ticket.agregarBitacora(mensaje, TipoEvento.MOVER_A_COLA);
	        cola.add(ticket);
	
	}

	@Override
	public Ticket quitar() {
		Ticket ticket=cola.peek();//devuelve el elemento que esta en la cima de la pila
		cola.remove(ticket); //borrar
		return ticket;
	}
	
	
	
	
}

import java.util.Stack;


public class ColaSoporte extends ColaServicio{
	private Stack<Ticket>cola=new Stack<Ticket>();
	
	public void agregarTicket(Ticket ticket, String mensaje){
        ticket.agregarBitacora(mensaje, TipoEvento.MOVER_A_COLA);
        cola.add(ticket);
    }

	@Override
	public Ticket quitar() {
		Ticket ticket=cola.peek();//devuelve el elemento que esta en la cima de la pila
		cola.pop();//retira el elemento que esta en la cima de la pila
		return ticket;
	}
	
}

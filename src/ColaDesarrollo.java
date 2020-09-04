import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class ColaDesarrollo extends ColaServicio {
	private Random random=new Random();
	private List<Ticket> cola=new ArrayList<Ticket>();
	
	public void agregar(Ticket ticket, String mensaje){
        ticket.agregarBitacora(mensaje, TipoEvento.MOVER_A_COLA);
        cola.add(ticket);
    }
	
	@Override
	public Ticket quitar() {
		Ticket ticket=cola.get(random.nextInt(cola.size()));
		cola.remove(ticket);
		return ticket;
	}
	
	

}

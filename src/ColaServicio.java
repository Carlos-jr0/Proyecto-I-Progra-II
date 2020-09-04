import java.util.ArrayList;
import java.util.List;


public class ColaServicio {
	private List<Ticket> cola=new ArrayList<Ticket>();
	private TipoCola tipo;

	
	public void agregarTicket(Ticket ticket){
		cola.add(ticket);
	}
	
	public void asignarTicket(String nitUsuario, String rol){
		Json json=new Json(nitUsuario, rol);
		cola.add(json);
		
	}
	
	public Ticket quitar(){
		Ticket ticket=cola.get(cola.size() -1);
		cola.remove(ticket);
		return ticket;
	}
		
}

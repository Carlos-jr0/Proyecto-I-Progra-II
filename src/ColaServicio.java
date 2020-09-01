import java.util.ArrayList;


public abstract class ColaServicio {
	private ArrayList<Ticket> cola;
	private TipoCola tipo;
	
	public ColaServicio(){
		cola=new ArrayList();
	}
	public TipoCola getTipo() {
		return tipo;
	}
	public void setTipo(TipoCola tipo) {
		this.tipo = tipo;
	}
	
	public void agregarTicket(Ticket ticket){
		cola.add(ticket);
	}
	
	abstract public void quitar();

}

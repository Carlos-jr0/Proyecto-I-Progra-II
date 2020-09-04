
import java.util.ArrayList;
import java.util.List;

public class Ticket {
	private String nitUsuario;
	private int id;
	private String problema;
	private String estado; //Creado
	private List <Bitacora> bitacora;
	
	
	public Ticket(String nitUsuario, int id, String problema, String estado, String mensaje) {
		bitacora=new ArrayList();
		this.nitUsuario = nitUsuario;
		this.id = id;
		this.problema=problema;
		this.estado = estado;
		bitacora.add(new Bitacora(nitUsuario, mensaje, TipoEvento.CREAR_TICKET));
	}
	public String getNitUsuario() {
		return nitUsuario;
	}
	public void setNitUsuario(String nitUsuario) {
		this.nitUsuario = nitUsuario;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public String getProblema() {
		return problema;
	}
	public void setProblema(String problema) {
		this.problema = problema;
	}
	
	public void agregarBitacora(String mensaje, TipoEvento evento){
		bitacora.add(new Bitacora(nitUsuario, mensaje, evento));
	}
		
	public String toString(){
		String temp= "Ticket{" + "NIT Usuario: " + nitUsuario + "ID: " + id +"Problema: " + problema + "Estado: " + estado;
		//Recorremos el arreglo Bitacora
		int i=1;
		for (Bitacora tempBitacora : bitacora) {
			temp+="\n  Bitacora: " + i++ + " " + tempBitacora.toString();
	}
		temp+= '}';
		return temp;
	}

}

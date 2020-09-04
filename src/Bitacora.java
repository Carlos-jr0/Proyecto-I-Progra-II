import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Bitacora {
	private String nitSoporte;
	private Date fechaHora;
	private String mensaje;
	private TipoEvento evento;
	
	//DateFormat dateFormat=new SimpleDateFormat("HH:mm:ss");
	//Date date=new Date();
	
	public Bitacora(String nitSoporte, String mensaje,TipoEvento evento) {
		this.nitSoporte = nitSoporte;
		this.fechaHora = new Date();
		this.mensaje = mensaje;
		this.evento = evento;
	}
	public String getNitSoporte() {
		return nitSoporte;
	}
	public void setNitSoporte(String nitSoporte) {
		this.nitSoporte = nitSoporte;
	}
	public Date getFechaHora() {
		return fechaHora;
	}
	public void setFechaHora(Date fechaHora) {
		this.fechaHora = fechaHora;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public TipoEvento getEvento() {
		return evento;
	}
	public void setEvento(TipoEvento evento) {
		this.evento = evento;
	}

}

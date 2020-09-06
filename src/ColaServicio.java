import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ColaServicio {
	private List<Ticket> cola=new ArrayList<Ticket>();
	private TipoCola tipo;
	private Scanner sc = new Scanner(System.in);
	
	public void agregarTicket(Ticket ticket){
		cola.add(ticket);
	}
	//Ingresar datos al arreglo
	public void crearTicket()throws Exception{
		Ticket tik=new Ticket();
		System.out.println("POR FAVOR INGRESE LOS DATOS");
		System.out.print("ingrese Nit usuario: ");
		tik.setNitUsuario(sc.next());
		System.out.print("ingrese id: ");
		tik.setId(sc.nextInt());
		System.out.print("ingrese el problema: ");
		tik.setProblema(sc.next());
		System.out.print("ingrese el estado: ");
		tik.setEstado(sc.next());
		cola.add(tik);
		
	}
	//Metodo mostrar el contendio del arreglo
	public void VerTicketsCreados(){
		System.out.println("LISTA DE TICKETS INGRESADOS");
		for(Ticket tik: cola){
		System.out.println("Nit Usuario: "+ tik.getNitUsuario());
		System.out.println("ID: "+ tik.getId());
		System.out.println("Problema: "+ tik.getProblema());
		System.out.println("Estado: "+ tik.getEstado());
		System.out.println("-------------------------");
	/*System.out.println("NIT USUARIO\t\tID\tPROBLEMA\t\t\tESTADO");
		for(Ticket tik : cola){
			System.out.format(tik.getNitUsuario(), tik.getId(),
					tik.getProblema(), tik.getEstado());*/
		}
	}
	/*public void asignarTicket(String nitUsuario, String rol){
		Ticket ticket=new Ticket();
		cola.add(ticket);
		
	}*/
	
	public Ticket quitar(){
		Ticket ticket=cola.get(cola.size() -1);
		cola.remove(ticket);
		return ticket;
	}
		
}

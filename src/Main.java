import java.io.IOException;
import java.util.Scanner;


public class Main {
	public static void main(String args[]) throws IOException{
		Scanner sc=new Scanner(System.in);
		Json informacionJson;
		ColaServicio cola;
		int opc=0;
		String opc2;
		do {
			System.out.println("SISTEMA DE SOLICITUD DE BOLETOS DE CODIGO ABIERTO (OTRS)");
			System.out.println("1.............Mostrar Listadado de Tickets");
			System.out.println("2.............Buscar Ticket");
			System.out.println("3.............Asignar Ticket");
			System.out.println("4.............Crear Ticket");
			System.out.println("5.............Agregar a Bitacora");
			System.out.println("6.............Mostrar Bitacora");
			System.out.println("7.............Salir");
			System.out.print("Ingrese su opcion: ");
			opc=sc.nextInt();
			switch (opc) {
			case 1:
				informacionJson=new Json();
				try {
					informacionJson.leerJson();
				} catch (Exception e) {
					System.out.println("No se encontro el archivo. ");
					e.printStackTrace();
				}
				break;
			case 2:
				informacionJson=new Json();
				try {
					informacionJson.buscarTicket();
				} catch (Exception e) {
					System.out.println("Error: No se ha encontrado el archivo.");
					e.printStackTrace();
				}
				break;
			case 3:
				cola=new ColaServicio();
				//cola.AsignarTicket();
				break;
			case 4:
				cola=new ColaServicio();
				//cola.agregarTicket(ticket);
			default:
				break;
			}
			
		} while (opc!=0);
	}

}

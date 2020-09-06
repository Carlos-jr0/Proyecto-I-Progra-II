
import java.util.Scanner;


public class Main {
	public static void main(String args[]) throws Exception{
		Scanner sc=new Scanner(System.in);
		/*Accedemos a la informacion de la clase Json*/
		Json informacionJson =new Json();
		/*Accedemos a la informacion y metodos de la clase ColaServicio*/
		ColaServicio cola=new ColaServicio();
		int opc=0;
		/*Menu de Opciones*/
		do {
			System.out.println("SISTEMA DE SOLICITUD DE BOLETOS DE CODIGO ABIERTO (OTRS)");
			System.out.println("1.............Mostrar Listadado de Tickets");
			System.out.println("2.............Buscar Ticket");
			System.out.println("3.............Asignar Ticket");
			System.out.println("4.............Crear Ticket");
			System.out.println("5.............Listar Tickets creados");
			System.out.println("5.............Agregar a Bitacora");
			System.out.println("6.............Mostrar Bitacora");
			System.out.println("7.............Salir");
			System.out.print("Ingrese su opcion: ");
			opc=sc.nextInt();
			System.out.println("-----------------------");
			switch (opc) {
			//caso 1
			case 1:
				try {
					informacionJson.leerJson();
				} catch (Exception e) {
					System.out.println("No se encontro el archivo. ");
					e.printStackTrace();
				}
				break;
				//caso 2
			case 2:
				try {
					informacionJson.buscarTicket();
				} catch (Exception e) {
					System.out.println("Error: No se ha encontrado el archivo.");
					e.printStackTrace();
				}
				break;
				//caso 3
			case 3:
				cola=new ColaServicio();
				//cola.AsignarTicket();
				break;
				//caso 4
			case 4:
				cola.crearTicket();
				break;
				//caso 5
			case 5:
				cola.VerTicketsCreados();
				break;
			default:
				break;
			}
			
		} while (opc!=0);
	}

}

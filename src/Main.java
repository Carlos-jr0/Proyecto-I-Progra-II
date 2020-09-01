import java.util.Scanner;


public class Main {
	public static void main(String[] args) throws Exception{
		Scanner entrada = new Scanner(System.in);
        Ticket ticket = new Ticket("4267",1,"resolver problema", "Crear ticket");
        ticket.leerJson();
        System.out.println(ticket.toString());
	}
}

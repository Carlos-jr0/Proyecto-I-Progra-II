import java.io.FileReader;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Json {
	public void leerJson()throws java.io.IOException{
		JSONParser parser=new JSONParser();
		
		try {
			Object object=parser.parse(new FileReader("informacion.json"));
			JSONArray array=(JSONArray)object;
			
			for (int i = 0; i < array.size(); i++) {
				JSONObject jsonObject=(JSONObject) array.get(i);
				String noTicket = jsonObject.get("ticket").toString();
				 System.out.println("Ticket No."+ noTicket);
				 
				 String nitUsuario = jsonObject.get("nitUsuario").toString();
		            System.out.println("Nit Usuario: " + nitUsuario);
		            
		            String problema = jsonObject.get("problema").toString();
		            	System.out.println("Problema: " +problema);
		            	
		            	String cola = jsonObject.get("cola").toString();
		                	System.out.println("Cola: " +cola);
		                	
		                	System.out.println("");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void buscarTicket() throws Exception{
		Scanner sc=new Scanner(System.in);
		String numTicket;
		
		System.out.println("Por favor ingrese el numero del ticket a buscar: ");
			numTicket=sc.nextLine();
			
			JSONParser parser=new JSONParser();
			
			try {
				Object object=parser.parse(new FileReader("informacion.json"));
				JSONArray array=(JSONArray) object;
				
				for (int i=0; i<array.size(); i++){
	                JSONObject jsonObject = (JSONObject)array.get(i);
	                JSONArray jsonArray = (JSONArray) jsonObject.get("ticket" +numTicket);
	                if(i<=array.size()){
	                    System.out.println("Ticket: " +jsonArray);
	                }
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		
	}

}

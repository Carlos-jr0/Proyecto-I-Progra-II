import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class Ticket {
	private String nitUsuario;
	private int id;
	private String problema;
	private String estado; //Creado
	ArrayList <Bitacora> bitacora;
	
	
	public Ticket(String nitUsuario, int id,String problema, String estado) {
		bitacora=new ArrayList();
		this.nitUsuario = nitUsuario;
		this.id = id;
		this.problema=problema;
		this.estado = estado;
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
	
	public static void leerJson()throws Exception{
		
		try {
			JSONParser parser=new JSONParser();
		    Object object = parser.parse(new FileReader("C:\\Users\\Alvarado Montes\\Desktop\\Progra II\\informacion.json"));
		  
		            
		            JSONObject config = (JSONObject) object;
		            String noTicket = (String)config.get("ticket");
		            System.out.println("Ticket No."+ noTicket);
		            
		            String nitUsuario =(String)config.get("nitUsuario");
		            System.out.println("Nit Usuario: " + nitUsuario);
		            
		            String problema = (String)config.get("problema");
		            System.out.println("Problema: " +problema);
		            
		            String cola = (String)config.get("cola");
		            System.out.println("Cola: " +cola);
		            System.out.println("\n\n");
		        
		            JSONArray longitud=(JSONArray) config.get("informacion json");
		            System.out.println("informacion json");
		            
		            Iterator iterator= longitud.iterator();
		            while(iterator.hasNext()){
		            	System.out.println(iterator.next());
		            }
		}catch(Exception e){      	
			System.err.println("Leyendo el fichero de informacion " + e.toString());
		}finally{
			
		}
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

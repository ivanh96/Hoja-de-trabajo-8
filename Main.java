import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {

		Vector<Paciente> listado = new Vector<Paciente>();
		File f = new File( "/Users/MacBookPro/Desktop/HDT8/pacientes.txt" );
	    BufferedReader input;

		try {
			input = new BufferedReader(new FileReader(f));
	    	String info;
	    	info = input.readLine();
	    
	    	while(input.ready()) {
	            info = input.readLine();
	            String vector[] = info.split(",");
	            Paciente paciente = new Paciente( vector[0], vector[1], vector[2]);
		        listado.add(paciente);
	        }
	    }

	    catch (IOException e) {
	    	e.printStackTrace();

	    }
	    System.out.println("LISTADO INICIAL\n");
	    System.out.println(listado);
	}
}

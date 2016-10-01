import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {

		ArrayList<Paciente> listado = new ArrayList();
		File f = new File( "src/pacientes.txt" );
	    BufferedReader input;

		try {
			input = new BufferedReader(new FileReader(f));
	    	String info;
	    	info = input.readLine();
	    
	    	while(input.ready()) {
	            info = input.readLine();
	            String vector[] = info.split(",");
	            Paciente paciente = new Paciente( vector[0].substring(0), vector[1].substring(0), vector[2].substring(0));
		        listado.add(paciente);
	        }
	    }

	    catch (IOException e) {
	    	e.printStackTrace();

	    }

	    System.out.println(listado);
	}
}
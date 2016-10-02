/**--------------------------------------
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos 
 * Seccion 10
 * -------------------------------------
 * Fredy España 15034
 * Marlon Hernandez 15177
 * -------------------------------------
 * Clase Main
 --------------------------------------*/
import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {

		Vector<Paciente> listado = new Vector<Paciente>();
		File f = new File( "src/pacientes.txt" );
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
        for(int i=0; i<listado.size(); i++){
            System.out.println(listado.get(i));
		}

		System.out.println("LISTADO ORDENADO\n");
		
		String ordenados="";
		Vector_Heap vheap = new Vector_Heap(listado);
		int size = vheap.size();
		
		for(int i=0; i<size; i++){
			Paciente paciente = (Paciente)vheap.remove();
			ordenados += paciente.toString()+"\n";
		}
		System.out.println(ordenados);

	}
}

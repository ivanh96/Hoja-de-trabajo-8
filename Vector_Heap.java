import java.util.PriorityQueue;
import java.util.Vector;

public class Vector_Heap <E extends Comparable <E> > extends PriorityQueue<E>{
	
	/* Atributos */
	private Vector<E> vectorheap;
	
	/* Constructor */
	public Vector_Heap(){
		vectorheap = new Vector<E>();
	}
	
	/* Constructor con parametro convierte un vector a VectorHeap */
	public Vector_Heap(Vector<E> vector){
		vectorheap = new Vector<E>(vector.size());
		for (int i = 0; i < vector.size(); i++){
			add(vector.get(i));
		}
	}
	
	/* 
	 * @param posicion 
	 * @return hijo izquierdo
	 */
	public int getSon_Left(int index){
		return (index*2)+1;
	}
	

	/* 
	 * @param posicion 
	 * @return hijo derecho
	 */
	
	public int getSon_Right(int index){
		return (index+1)*2;
	}
	

	/* 
	 * @param posicion 
	 * @return padre
	 */
	public int getParent(int index){
		return (index-1)/2;
	}
}
/**--------------------------------------
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos 
 * Seccion 10
 * -------------------------------------
 * Fredy España 15034
 * Marlon Hernandez 15177
 * -------------------------------------
 * Clase Vector_Heap
 --------------------------------------*/
import java.util.PriorityQueue;
import java.util.Vector;

public class Vector_Heap <E extends Comparable <E>> extends PriorityQueue<E>{
	
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

	/*  
	 * @return valor minimo
	 */

	protected void pushDownRoot(int root){
		int size = vectorheap.size();
		E value = vectorheap.get(root);
		while (root < size){
			int childpos = getSon_Left(root);
			if (childpos < size){
				if ((getSon_Right(root) < size) && ((vectorheap.get(childpos+1)).compareTo (vectorheap.get(childpos)) < 0)){
					childpos++;
				}
				if ((vectorheap.get(childpos)).compareTo (value) < 0){
					vectorheap.set(root,vectorheap.get(childpos));
					root = childpos; // keep moving down
			} else { // found right location
				vectorheap.set(root,value);
				return;
			}
			} else { // at a leaf! insert and halt
				vectorheap.set(root,value);
				return;
			}
		}
	}
}

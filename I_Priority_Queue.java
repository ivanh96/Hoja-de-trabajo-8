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
public interface I_Priority_Queue<E extends Comparable<E>> {
	
	public E getFirst();		// Devuelve el primer elemento
	public void addElement (E value);	// Agrega un valor a la priority queue
	public E removeFirst();		// Remueve el primer elemento
	public int size();			// Devuelve el tamanio de la fila
	public void removeAll();	// Borra todos los elementos de la fila
	public boolean isEmpty();	// Devuelve true si esta vacia
	
}


public interface I_Priority_Queue<E extends Comparable<E>> {
	
	public E getFirst();		// Devuelve el primer elemento
	public void addElement (E value);	// Agrega un valor a la priority queue
	public E removeFirst();		// Remueve el primer elemento
	public int Size();			// Devuelve el tamanio de la fila
	public void removeAll();	// Borra todos los elementos de la fila
	public boolean isEmpty();	// Devuelve true si esta vacia
	
}

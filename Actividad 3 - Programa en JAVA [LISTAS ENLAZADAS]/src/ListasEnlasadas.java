import java.util.LinkedList;

class Nodo{
	private int dato;
	private Nodo NodoSiguiente;
	
	public Nodo(){}
	public Nodo(int dato) {
		super();
		this.dato = dato;
	}
	public int getDato() {
		return dato;
	}
	public void setDato(int dato) {
		this.dato = dato;
	}
	public Nodo getNodoSiguiente() {
		return NodoSiguiente;
	}
	public void setNodoSiguiente(Nodo nodoSiguiente) {
		NodoSiguiente = nodoSiguiente;
	}
	@Override
	public String toString() {
		return "Nodo [dato=" + dato + ", NodoSiguiente=" + NodoSiguiente + "]";
	}
	
	
}
class ListaEnlasada{
	Nodo Nodoinicial;
	Nodo Nodofin;
	
	public ListaEnlasada (){
		Nodoinicial = Nodofin = null;
	}
	
	public void AgregarElementoAlInicio(int dato) {
		Nodo NuevoNodo = new Nodo(dato);
		if (Nodoinicial==null) {
			Nodoinicial = Nodofin = NuevoNodo;
		}else {
			NuevoNodo.setNodoSiguiente(Nodoinicial);
			Nodoinicial = NuevoNodo;
		}
	}
	public void AgregarElementoAlFin(int dato) {
		Nodo NuevoNodo= new Nodo(dato);
		if(Nodofin==null) {
			Nodofin = Nodoinicial = NuevoNodo;
		}else {
			NuevoNodo.setNodoSiguiente(Nodofin);
			Nodofin = NuevoNodo;
		}
	}
	public void EliminarElementoAlInicio(int dato) {
		Nodoinicial=-1;
	}
	public void EliminarElementoAlFin(int dato) {
		Nodofin=-1;
	}

	public void MostrarElementos() {
		Nodo NodoActual = Nodoinicial;
		
		while(NodoActual != null) {
			System.out.println("["+NodoActual.getDato()+"]");
			NodoActual = NodoActual.getNodoSiguiente(); 
	}
				
	}
}
public class ListasEnlasadas {
	
	public static void main(String[] args) {
		LinkedList<Integer> le = new LinkedList<Integer> ();
		
		ListaEnlasada milistaenlazada = new ListaEnlasada();
		
		milistaenlazada.AgregarElementoAlInicio(7);
	}

}

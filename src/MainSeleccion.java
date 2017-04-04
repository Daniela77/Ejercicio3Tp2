/**
 * @author Daniela
 * Implemente un algoritmo de ordenamiento por selección en un arreglo.
 *
 */
public class MainSeleccion {
	final static int MAX=10;
	final static int MAXNUM=20;

	public static void main(String[] args) {
		
			int arr[]= new int[MAX];
			int arrAleatorio[]= new int[MAXNUM];
			OrdenarPorSeleccion o = new OrdenarPorSeleccion();
			System.out.println("Ingrese de a un numero y presione enter");
			System.out.println("---------------------------------------");
			o.cargarArr(arr);
			System.out.println(" Se cargó el arreglo con 10 elementos  ");
			System.out.println("---------------------------------------");
			o.seleccion(arr);
			System.out.println("     Arreglo ordenado por seleccion    ");
			System.out.println("---------------------------------------");
			o.mostrarArreglo(arr);
			System.out.println(" Se cargó el arreglo con 20 elementos aleatorios ");
			System.out.println("---------------------------------------");
			o.cargarArrAleaorio(arrAleatorio);
			System.out.println(" Arreglo aleatorio ordenado por seleccion ");
			System.out.println("---------------------------------------");
			o.seleccion(arrAleatorio);
			o.mostrarArreglo(arrAleatorio);
			

	}

}

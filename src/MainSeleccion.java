/**
 * @author Daniela
 * Implemente un algoritmo de ordenamiento por selección en un arreglo.
 *
 */
public class MainSeleccion {
	final static int MAX=5;
	final static int MAXNUM=100000;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			
			long t_inicial, t_final, t_inicial2, t_final2;
			int arr[]= new int[MAX];
			int arrAleatorio[]= new int[MAXNUM];
			OrdenarPorSeleccion o = new OrdenarPorSeleccion();
			System.out.println("Ingrese de a un numero y presione enter");
			System.out.println("---------------------------------------");
			
			o.cargarArr(arr);
			
			System.out.println(" Se cargó el arreglo con 5 elementos  ");
			System.out.println("---------------------------------------");
			
			t_inicial = System.currentTimeMillis();
			System.out.println("El tiempo inicial es de : "+t_inicial);
			o.seleccion(arr);
			t_final = System.currentTimeMillis();
			System.out.println("El tiempo final es de : "+t_final);
			System.out.println("el ordenamiento de 10 elementos tardó: "+ (  t_final- t_inicial ) +" milliseconds");
			
			System.out.println("     Arreglo ordenado por seleccion    ");
			System.out.println("---------------------------------------");
			
			o.mostrarArreglo(arr);
			
			System.out.println(" Se cargó el arreglo con 20 elementos aleatorios ");
			System.out.println("---------------------------------------");
			
			o.cargarArrAleaorio(arrAleatorio);
			
			System.out.println(" Arreglo aleatorio ordenado por seleccion ");
			System.out.println("---------------------------------------");
			t_inicial2 = System.currentTimeMillis();
			System.out.println("El tiempo inicial es de : "+t_inicial2);
			o.seleccion(arrAleatorio);
			t_final2 = System.currentTimeMillis();
			System.out.println("El tiempo final es de : "+t_final2);
			System.out.println("el ordenamiento de 100 elementos tardó: "+ ( t_final2- t_inicial2 ) +" milliseconds");
			o.mostrarArreglo(arrAleatorio);
		
	}

}

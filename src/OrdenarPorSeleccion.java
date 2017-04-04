import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 * Algoritmo de ordenamiento por seleccion
 *
 */
public class OrdenarPorSeleccion {
	final static int MAX=5;
	final static int MAXNUM=100000;
	
	public void seleccion(int arr[]) {
		int i, j, menor, pos, tmp;
		for (i = 0; i < MAX; i++) { // tomamos como menor el primero
			menor = arr[i]; // de los elementos que quedan por ordenar
			pos = i; // y guardamos su posición
			for (j = i + 1; j < MAX; j++){ // buscamos en el resto
				if (arr[j] < menor) { // del array algún elemento
					menor = arr[j]; // menor que el actual
					pos = j;
				}
			}
			if (pos != i){ // si hay alguno menor se intercambia
				tmp = arr[i];
				arr[i] = arr[pos];
				arr[pos] = tmp;
			}
		}
	}
	
	public void cargarArrAleaorio(int arr[]) {
		for (int i = 0 ; i < MAX; i++)
			arr[i] = (int)(Math.random()*MAXNUM+1);
	}	
	
	public void cargarArr(int arr[]){
		for (int con=0;con<MAX;con++) {
			System.out.println ("Ingrese integer: "+ con);
			arr[con]=leerEntero();
		}
		for (int con=0;con<MAX;con++)
			System.out.println(arr[con]);
	}
	
	public int leerEntero(){
		int valor = 0;
		boolean bien = false;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		do {
			try {
				valor = new Integer(entrada.readLine());
				bien = true;
			}
			catch (Exception exc ) {bien = false;}
		} while (!bien);
		return valor;
		}

	
	public void mostrarArreglo(int[] arr) {
		for (int i=0;i<MAX;i++)
			System.out.println(arr[i]);
	}
}
	

package ejercicio1;

import java.util.List;

public class Ej2 {

	public static void main(String[] args) {
		
		//Ejemplo de STREAM: Son flujos para mostrar datos e interacturar con ellos. Es lo mismo que el Ej1.	
		//peek muestra todos los elementos
		//filter hace el filtro que queramos
		List<Integer> number = List.of(1, 12, 4, 15, 6, 17);
		
		Long count = number.stream().peek(num -> System.out.println("Imprimo elemento " + num + " ")).filter(num -> num > 10).count();
		
		System.out.println("Hay " +count + " mayores que diez");
	}

}

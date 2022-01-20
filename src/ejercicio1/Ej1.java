package ejercicio1;

import java.util.List;

public class Ej1 {

	public static void main(String[] args) {

		List<Integer> number = List.of(1, 12, 4, 15, 6, 17);
		int count = 0;
		for (Integer i : number) {

			if (i > 10) {
				count++;

			}

		}

		System.out.println(count);

	}

}

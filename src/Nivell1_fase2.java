
public class Nivell1_fase2 {

	public static void main(String[] args) {
		
		//constantes para el año bisiesto y mi año de nacimiento:
		final int ANY_TRASPAS = 1948;
		final int ANY_NAIXEMENT = 1993;
		
		//variable para almacenar el nº de años bisiestos entre ambas fiestas
		int num_anys_traspas = 0;

		//bucle for para mostrar los años entre las fechas y el nº total de años bisiestos
		for (int i = ANY_TRASPAS; i <= ANY_NAIXEMENT; i++) {

			if (i % 400 == 0) {
				num_anys_traspas++;
				System.out.println("El año " + i + " es bisiesto.");

			} else if (i % 4 == 0 && i % 100 != 0) {

				num_anys_traspas++;

				System.out.println("El año " + i + " es bisiesto.");
			}
		}

		System.out.println(num_anys_traspas + " años bisiestos entre 1993 y " + ANY_TRASPAS);
	}

}

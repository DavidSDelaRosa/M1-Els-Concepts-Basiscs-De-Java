
public class Nivell1_fase3 {

	public static void main(String[] args) {

		int fechaNacimiento = 1993;

		// variable bool para evaluar si el año es bisiesto o no
		boolean esBisiesto = false;

		// variables String con los mensajes
		String cierto = "El año es bisiesto";
		String falso = "El año NO es bisiesto";

		System.out.println("Año a evaluar: " + fechaNacimiento);

		if ((fechaNacimiento % 400 == 0) || (fechaNacimiento % 4 == 0 && fechaNacimiento % 100 != 0)) {

			esBisiesto = true;

			if (esBisiesto) {
				System.out.println(cierto);
			}

		} else {
			System.out.println(falso);
		}

		esBisiesto = false;

	}

}

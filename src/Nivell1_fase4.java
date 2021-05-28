
public class Nivell1_fase4 {

	public static void main(String[] args) {
		
		//Variables de las fases anteriores necesarias para esta:
		
		String nom = "David";
		String cognom1 = "Serrano";
		String cognom2 = "De la Rosa";

		int dia = 5;
		int mes = 2;
		int any = 1993;
		
		boolean es_traspas = false;
		
		String cierto = "El año es bisiesto";
		String falso = "El año NO es bisiesto";
		
		//variables para juntar la información: 
		String nombreCompleto = "Mi nombre es " + nom + " " + cognom1 + " " + cognom2;
		String fechaCompleta = "Nací el " + dia + "/" + mes + "/" + any;

		if ((any % 400 == 0) || (any % 4 == 0 && any % 100 != 0)) {

			es_traspas = true;

			if (es_traspas) {
				System.out.println(nombreCompleto);
				System.out.println(fechaCompleta);
				System.out.println(cierto);
			}

		} else {
			System.out.println(nombreCompleto);
			System.out.println(fechaCompleta);
			System.out.println(falso);
		}

		es_traspas = false;

	}

}

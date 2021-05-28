
public class Nivell3 {

	public static void main(String[] args) {
		
		int [] array = {1,2,3,4,5,6,7,8,9,10};
		int aux;
		
		System.out.println("Array inicial: ");
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		

		for (int i=0; i<array.length/2; i++) {
            aux = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = aux;
        }
		
		System.out.println("\nArray invertido: ");
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}

}

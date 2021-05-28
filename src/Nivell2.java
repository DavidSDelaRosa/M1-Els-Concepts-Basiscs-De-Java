
public class Nivell2 {

	public static void main(String[] args) {
		
		double pruebaDouble = 5.7654;
		
		int doubleToInt = (int)pruebaDouble;
		float doubleToFloat = (float)pruebaDouble;
		String doubleToString = String.valueOf(pruebaDouble);
		String doubleToString2 = Double.toString(pruebaDouble);
		
		System.out.println(doubleToInt + " --> de tipo int");
		System.out.println(doubleToFloat + " --> de tipo float");
		System.out.println(doubleToString + " --> de tipo String");
		System.out.println(doubleToString2 + " --> también de tipo String");

	}

}

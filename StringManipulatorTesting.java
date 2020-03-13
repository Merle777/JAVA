package Cadenas;

public class StringManipulatorTesting {

	public static void main(String[] args) {
		
	//	StringManipulator manipulator = new StringManipulator();
	//	String str = manipulator.trimAndConcat("    Hola     ","     Mundo    ");
	//	System.out.println(str); 
		
	//	StringManipulator manipulator = new StringManipulator();
	//	char letter = 'n';
	//	Integer a = manipulator.getIndexOrNull("Coding", letter);
	//	Integer b = manipulator.getIndexOrNull("Hola Mundo", letter);
	//	Integer c = manipulator.getIndexOrNull("Saludar", letter);
	//	System.out.println(a); // 4
	//	System.out.println(b); // 7
	//	System.out.println(c); // null
		
	//	StringManipulator manipulator = new StringManipulator();
	//	String word = "Hola";
	//	String subString = "la";
	//	String notSubString = "mundo";
	//	Integer a = manipulator.getIndexOrNull(word, subString);
	//	Integer b = manipulator.getIndexOrNull(word, notSubString);
	//	System.out.println(a); // 2
	//	System.out.println(b); // null

		StringManipulator manipulator = new StringManipulator();
		String word = manipulator.concatSubstring("Hola", 1, 3, "mundo");
		System.out.println(word); // omundo

	}
}
package def;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 100; //initialization and declaration only integer number with no float
		long y = 123155124123L; //to use long variable we also need to 
		//write an L at the end of the number
		byte z = 127; //a byte goes from -128 to +127
		float k = 1.234f; /*float can have decimals and other numbers has to follow
							with f if has more that 2 numbers after decimal */
		boolean b=true; //a boolean can be either true or false
		char letter='a'; //char displays 1 letter or symbol has to be between single quotes ''
		
		String name="Nicolai"; //reference data types have to start with capital letter
		
		System.out.println(y);
		System.out.println("My number is: "+x);
		System.out.println("Byte Test: "+z);
		System.out.println("Float Test: "+k);
		System.out.println("Boolean Test: " + b);
		System.out.println("Char Test: " + letter);
		System.out.println("String Test: " + name);
	}

}

public class task2 {
    public static void main(String[] args) {
        int number=Integer.parseInt(args[0]);

        System.out.println("Given Number: " + number);		
		System.out.println("Binary equivalent: " + Integer.toBinaryString(number));
		System.out.println("Octal equivalent: " + Integer.toOctalString(number));
		System.out.println("Hexadecimal equivalent: " + Integer.toHexString(number));
    }
}

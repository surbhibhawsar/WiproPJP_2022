public class task10 {
    public static void main(String[] args) {
        
        String str = "Wipro";
		int n = 3;
		
		String repeater = "";
		
		if (n < 2) 
        repeater = str;
		else 
        repeater = str.substring(str.length()-3, str.length());
		
		String output = "";
		
		for (int i = 0; i < n; i++) {
			output += repeater;
		}
		
		System.out.println(output);
    }
}

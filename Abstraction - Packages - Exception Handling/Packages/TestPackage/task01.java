package TestPackage;

public class task01 {
    
	public static void main(String[] args) {

		Foundation foundation = new Foundation();
		//foundation.Var1 = 1;	
		foundation.Var2 = 2;					//accessible
		foundation.Var3 = 3;					//accessible
		foundation.Var4 = 4;					//accessible
		
		//System.out.println(foundation.Var1);	
		System.out.println(foundation.Var2);
		System.out.println(foundation.Var3);
		System.out.println(foundation.Var4);
	}

}

public class task6 {
    public static void main(String args[]){
        String gender=args[0];
        int age=Integer.parseInt(args[1]);

        if(!gender.equals("female") && (!gender.equals("male"))){
            System.out.println("Invalid Gender");
        }
        

        if(age<1 && age>100){
            System.out.println("Invalid Age");
        }
        

        if((gender.equals("female")) && (age >=1 && age<=58 )){
            System.out.println("Percentage of interest is 8.2%");
        }
        else if((gender.equals("female")) && (age >=59 && age<=100)){
            System.out.println("Percentage of interest is 9.2%");
        }
        else if((gender.equals("male")) && (age >=1 && age<=58 )){
            System.out.println("Percentage of interest is 8.4%");
        }
        else if((gender.equals("male")) && (age >=59 && age<=100 )){
            System.out.println("Percentage of interest is 10.5%");
        }
        
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
      //Declare a variable

        //Initialize the variable
//        name="Phani";
//        Update the variable
//        name="Shivani";

//        System.out.println("Hi "+name+", Welcome to I.T Mastar!");
//        System.out.println("Hi "+"name"+", Welcome to I.T Mastar!");
//        System.out.println("Hi "+name+", Welcome to I.T Mastar!");
        //Scanner class
        String name;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your name : ");
        name=scan.next();
        System.out.println("Enter your age :");
        int age=scan.nextInt();
        System.out.println("Enter your CGPA :");
        double cgpa=scan.nextDouble();
        System.out.println("Are you working anywhere . Answer 'Y' or 'N' ");
        char workingSomeWhere=scan.next().charAt(0);
//        System.out.println("Describe your goal in a line");
//        String description=scan.nextLine();
        System.out.println("Please verify and confirm your details !!");
        System.out.println("Name :"+name);
        System.out.println("Entered age :"+age);
        System.out.println("Entered CGPA :"+cgpa);
        System.out.println("Are you working :"+workingSomeWhere);
//        System.out.println("Your goal :"+description);
        System.out.println("Please confirm your details !! Enter  Correct or Wrong ");
        String confirmation=scan.next();
        if(confirmation.equalsIgnoreCase("CORRECT")){
            System.out.println("Hi "+name+", Welcome to I.T Mastar!");
        }else{
            System.out.println("Please apply later !!");
        }


    }
}
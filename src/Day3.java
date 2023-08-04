import java.util.Scanner;

public class Day3 {

    public static void main(String[] args) {
        //Arithmetic Operators
        // +,-,*,/,%
//        System.out.println(2+3);
        int number1=10;
        int number2=20;
        int sum=number1+number2;
//        System.out.println("The sum of :"+number1+" and "+number2 +" is :"+sum);
//        System.out.println(10-5);
//        System.out.println(5*10);

        // "Division --> /" <--Quotient  and "modulo --> %  <--Remainder"
//        System.out.println(11/2);
//        System.out.println(11%2);
        // W.A.P to take radius as an input and print area of circle as output . Area = pi*r*r , pi=3.14

       /* Scanner input = new Scanner(System.in);
        System.out.println("Enter radius as an integer value :");
        int radius=input.nextInt();
        double pi=3.14;
        double area=pi*radius*radius;
        System.out.println("The area of circle with radius : "+radius +" is :"+(int)area);
        *
        */


        //Strings -- > concat , + , toUpperCase, toLowercase, subString, equals , equalsIgnoreCase, contains, length, charAt

//        System.out.print("Phani ");
//        System.out.println("Madiraju");

//        System.out.print("Madiraju");
        String firstName="Phani";
        String lastName="Madiraju";
//        System.out.println(firstName+" "+lastName);
//        System.out.println(firstName.concat(" ").concat(lastName));
        String course="jAvA";
        String myNumber="1";
        //length() and length
//        System.out.println(course);
//        System.out.println("Course :"+course);
//        System.out.println("Course :"+ course.toUpperCase());
//        System.out.println(myNumber.toUpperCase());
//        System.out.println("Course :"+course.toLowerCase());
//        System.out.println(course.length());
       /* if(course.equals("JAVA")){
            System.out.println("I want to learn "+course.toUpperCase());
        }else{
            System.out.println("I want to learn python");
        }*/
       /* if(course.equalsIgnoreCase("JAVA")){
            System.out.println("I want to learn "+course.toUpperCase());
        }else{
            System.out.println("I want to learn python");
        }*/

       /* String sentence="I want to be Full stack Developer";
        String checkSentence=sentence.toUpperCase();
        System.out.println(checkSentence);
        if(checkSentence.contains("DEVELOPER")){
            System.out.println("You are hired ");
        }else{
            System.out.println("Better luck next time");
        }*/
        //charAt
        /*
        String name="Phani M.K.MS";
        char initial=name.charAt(6);
        System.out.println("your initial is :"+initial);*/
        //substring
        String sentence="I want to learn java";
        String word=sentence.substring(0);
        String word1=sentence.substring(3);

        String word2=sentence.substring(2,6);
        String sentence1="learn java";
        String word3=sentence1.substring(0,5);
        String word4=sentence1.substring(0,7);
        String word5=sentence1.substring(6,10);
    System.out.println(word5);

    }

}

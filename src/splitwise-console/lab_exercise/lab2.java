package lab_exercise;

import java.util.Scanner;
class lab2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        //Arithmetic
        System.out.println("---Arithmetic---");
        System.out.println("Integer/Integer: "+17/5); // int/int -> int
        System.out.println("Double/Integer: "+17.0/5); // double/int -> double
        System.out.println("----Modulas operations----");
        System.out.println("Normal modulas: "+10%3);
        System.out.println("small value mod big value: "+3%7); // small value is result
        System.out.println("Neg value mod pos value: "+(-10%3)); // numerator sign will be the sign of result
        System.out.println("pos value mod neg value: "+(10%-3)); // numerator sign will be the sign of result

        System.out.println();

        //Relational and boolean
        System.out.println("Relational and boolean");
        int choice=2;
        System.out.println(choice==2); // check for equal
        System.out.println(choice!=3); // check for not equal
        System.out.println(choice>1 && choice<=3); // boolean operator to combine two relational expression

        System.out.println();

        //if / else if
        System.out.println("if / else if");
        System.out.println("---Menu---"); // displaying menu
        System.out.println("1. Add");
        System.out.println("2. View");
        System.out.println("3. Exit");
        System.out.print("Enter choice:");
        int choice1=sc.nextInt(); //get input from user
        if(choice1==1) // enter when input is 1
        {
            System.out.println("Add");
        }
        else if (choice1==2)  // enter when input is 2
        {
            System.out.println("View");
        }
        else if (choice1==3)  // enter when input is 3
        {
            System.out.println("Exit");
        }
        else // enter when no input matches
        {
            System.out.println("Invalid choice");
        }

        System.out.println();

        //switch expression
        System.out.println("switch expression");
        System.out.println("---Menu---"); // displaying menu
        System.out.println("1. Add");
        System.out.println("2. View");
        System.out.println("3. Exit");
        System.out.print("Enter choice:");

        int choice2 = sc.nextInt();

        String message = switch (choice2) { // return some value
            case 1 -> "Add";
            case 2 -> "View";
            case 3 -> "Exit";
            default -> "Invalid choice";
        };

        System.out.println(message); //  printing returned value


    }
}
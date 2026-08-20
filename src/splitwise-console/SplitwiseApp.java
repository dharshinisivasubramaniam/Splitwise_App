import java.util.Scanner;

public class SplitwiseApp
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in); //get input from user

        boolean running=true; //used to change false when user exits

        while(running) // execute until running = false
        {
            System.out.println("=== Splitwise Console Backend ===");
            //Displaying menu
            System.out.println("1. Add expense");
            System.out.println("2. View expenses");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt(); //get choice from user

            System.out.println(); // display choice blocks execution in next line

            switch (choice) //execute block based on user's choice
            {
                case 1 -> // when user enter 1
                {
                    System.out.println("expense was recorded using current sample data");
                }
                case 2 -> // when user enter 2
                {
                    System.out.println("--- Expense Summary ---");
                    String expname = "Dinner";  // expense name in string
                    double totAmt = 1200.0;  // total amount spend in double
                    int totmem = 4;  // total members count in integer
                    double eachshare = totAmt / totmem;  // split share
                    System.out.println("Expense name: " + expname);
                    System.out.println("Total amount: " + totAmt);
                    System.out.println("Number of people: " + totmem);
                    System.out.println("Each person should pay: " + eachshare);
                    System.out.println(); // to display message next line which looks nice
                    System.out.println("Feature status: Basic calculation completed.");
                }
                case 3 -> // when user enter 3
                {
                    running = false; // to stop the while loop from displaying menu
                    System.out.println("Goodbye! Thank you for using Splitwise Console Backend.");
                }
                default -> // if user give wrong input
                {
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                }
            }
            System.out.println(); // print menu after one line
        }
        sc.close();
    }
}
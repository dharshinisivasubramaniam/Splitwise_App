public class SplitwiseApp
{
    public static void main(String[] args)
    {
        System.out.println("=== Splitwise Console Backend ===");
        String expname="Dinner";
        double totAmt=1200.0;
        int totmem=4;
        double eachshare=totAmt/totmem;
        System.out.println("Expense name:"+expname);
        System.out.println("Total amount:"+totAmt);
        System.out.println("Number of people:"+totmem);
        System.out.println("Each person should pay:"+eachshare);
        System.out.println();
        System.out.println("Feature status: Basic calculation completed.");
    }
}
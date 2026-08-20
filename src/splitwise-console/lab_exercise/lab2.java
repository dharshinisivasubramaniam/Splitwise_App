package lab_exercise;

class lab2
{
    public static void main(String[] args)
    {
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

    }
}
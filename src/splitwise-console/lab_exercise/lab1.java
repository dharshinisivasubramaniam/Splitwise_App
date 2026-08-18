package lab_exercise;
class lab1{
    public static void main(String[] args)
    {
        //Types
        System.out.println("Types");
        int count=10;
        long long_num=1005l;//1005L
        float frac=10.5f;//10.5F
        double salary=10.54;
        boolean value=true;
        char letter='D';
        System.out.println("int: "+count);
        System.out.println("long: "+long_num);
        System.out.println("float: "+frac);
        System.out.println("double: "+salary);
        System.out.println("boolean: "+value);
        System.out.println("char: "+letter);

        System.out.println();

        //constants
        System.out.println("Constants");
        final double TAX_RATE = 0.18;
        double amount = 1000.0;
        System.out.println("const var: "+TAX_RATE);//cannot change -> compile-time error
        System.out.println("before change: "+amount);//before changing
        amount=1200.0;
        System.out.println("after change: "+amount);//after changing

        System.out.println();

        //Casting
        System.out.println("Casting");
        double value1 = 9.7;
        System.out.println("casting: "+(int) value1); //convert int into double then print (doesn't change original value)
        System.out.println("round off then casting: "+(int) Math.round(value1)); //round off -> convert -> print (doesn't change original value)

        System.out.println();

        //Division trap
        System.out.println("Division trap");
        System.out.println("int div: "+5/2); // int/int = int
        System.out.println("cast num: "+(double) 5/2); // double/int = double
        System.out.println("cast both num & denom: "+(double) (5/2)); // double/double = double (here 5/2 perform first no decimal part given to double so 2.0)
    }
}
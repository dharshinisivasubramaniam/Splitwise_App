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


    }
}
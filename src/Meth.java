public class Meth
{
    public void add(int a, int b)
    {
        System.out.println("Sum:"+(a+b));
    }
    public static void main(String[] args)
    {
        Meth obj = new Meth();
        obj.add(10,20);
    }
}

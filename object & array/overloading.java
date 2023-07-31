class person
{
    public String name(String name1, String name2)
    {
        String full = name1 + name2;
        return full;

    }
    
    public String name(String name1, String name2, String name3)
    {
        String full = name1 + name2 + name3;
        return full;

    }
}

public class overloading{
    public static void main(String[] args) {
       person obj = new person();
       String name = obj.name("Nizam", "uddin");
       System.out.println(name);
       String name1 = obj.name("Raja", "Rakesh", "Reddy");
       System.out.println(name1);

    }
}
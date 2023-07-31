class sum
{
    public int Sum(int a, int b)
    {
        int add = a + b;
        return add;
    }
}

public class obj_met {
    public static void main(String[] args) {
        sum obj = new sum();
        int sum = obj.Sum(7,7);
        System.out.println(sum);
    }
}

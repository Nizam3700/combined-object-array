class Array
{
    public int array (int arr[])
    {   
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        }
        return sum;
    }
}   
public class sum_array {
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        Array a = new Array();
        int sum = a.array(arr);
        System.out.println(sum);
    }
}

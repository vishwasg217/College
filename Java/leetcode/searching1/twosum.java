package searching1;

public class twosum
{

    public static int[] twoSum(int[] numbers, int target)
    {
        int a=0;
        int b=numbers.length-1;

        for(int i=0;i<numbers.length; i++)
        {
            if(numbers[a]+numbers[b]<target)
            {
                a++;
            }
            if(numbers[a]+numbers[b]>target)
            {
                b--;
            }
            if(numbers[a]+numbers[b]==target)
            {
                return new int[]{a,b};
            }

        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[] numbers={1,2,3,4,4,9,56,90};
        int[] ans=twoSum(numbers, 8);
        for(int i:ans)
            System.out.println(i);
    }

}

import java.util.Arrays;
import java.util.Scanner;

public class leetcode {

    public static int[] twoSum(int[] nums, int target) 
    {
        int[] soln = new int[2];
        for(int i = 0; i<nums.length; i++)
        {
            for(int j=i+1; j<nums.length; j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    soln[0]=i;
                    soln[1]=j;
                    return soln;
                }
            }
        }
        return soln;        
    }
    
    public static void main(String[] args)
    {
        int[] nums= new int[4];
        int target;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an array");
        for(int i=0; i<nums.length; i++)
        {
            nums[i]=in.nextInt();
        }
        
        System.out.println("enter the target: ");
        target = in.nextInt();
        
        int[] soln = twoSum(nums, target);
    
        System.out.println(Arrays.toString(soln));
        
    }
    
}

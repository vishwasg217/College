package searching1;

public class NextGreatestLetter
{

    public static char nextGreatestLetter(char[] letters, char target)
    {
        int low=0;
        int high=letters.length-1;
        if(target>letters[letters.length-1])
            return letters[0];
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(letters[mid]==target)
                return letters[mid+1];
            if(letters[mid]<target)
                low=mid+1;
            else
                high=mid-1;
        }
        return letters[low];
    }

    public static void main(String[] args) {
        char[] arr = {'c', 'f', 'j'};
        char ans=nextGreatestLetter(arr, 'c');
        System.out.println(ans);
    }

}

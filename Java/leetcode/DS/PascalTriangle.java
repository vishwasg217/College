package DS;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle
{
    public static List<List<Integer>> generate(int numRows)
    {
        List<List<Integer>> ol = new ArrayList<List<Integer>>();
        ol.add(new ArrayList<Integer>());
        ol.get(0).add(0, 1);
        ol.add(new ArrayList<Integer>());
        ol.get(1).add(0, 1);
        ol.get(1).add(1, 1);
        for(int i=2;i<numRows;i++)
        {
            ol.add(new ArrayList<Integer>());
            ol.get(i).add(0, 1);
            int j;
            for(j=1;j<i;j++)
            {
                int temp=ol.get(i-1).get(j-1)+ol.get(i-1).get(j);
                ol.get(i).add(j, temp);
            }
            ol.get(i).add(j, 1);

        }
        return ol;
    }

    public static void main(String[] args) {
        List<List<Integer>> ans = generate(5);
        System.out.println(ans);
    }
}

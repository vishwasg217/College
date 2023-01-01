public class waterTanker {
    public static void main(String[] args) {

        int[] h = {1,8,6,2,5,4,8,3,7};
        int m = maxArea(h);
        System.out.println(m);
        
    }

    
    public static int maxArea(int[] height) 
    {
        int cap=0, max=0;
        for(int i=0;i<height.length;i++)
        {
            
            
            for(int j=0;j<height.length;j++)
            {
                //System.out.print("j: "+j);
                cap=(j-i)*Math.min(height[i], height[j]);
                //System.out.println("\tmin: "+Math.min(height[i], height[j]));
                if(cap>max)
                {
                    max=cap;
                }
            }

            //System.out.println();
        }
        return max;
    }
}

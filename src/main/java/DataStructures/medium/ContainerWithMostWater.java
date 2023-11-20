package DataStructures.medium;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        ContainerWithMostWater c = new ContainerWithMostWater();
        c.mostWaterContainer(new int[]{7,1,2,3,9});
        c.optimizedContainer(new int[]{7,1,2,3,9});
    }
    public void mostWaterContainer(int[] heights){
        int maxArea = 0;
        // formaula = min(a,b) * (bth index-ath index)
        for(int p1=0;p1 < heights.length;p1++){
            for(int p2=p1+1;p2<heights.length;p2++){
                int i = Math.min(heights[p1], heights[p2]) * (p2 - p1);
               maxArea = Math.max(i,maxArea);

            }
        }
        System.out.println(maxArea);
    }
    public void optimizedContainer(int[] heights){
        int maxArea = 0;
        int p1=0;int p2= heights.length-1;
        while(p1 < p2){
            int area = Math.min(heights[p1],heights[p2]) * (p2-p1);
            maxArea = Math.max(maxArea,area);
            if(heights[p1] <= heights[p2]){
                p1++;
            }else{
                p2--;
            }
        }
        System.out.println(maxArea);
    }
}

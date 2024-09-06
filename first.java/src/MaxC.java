public class MaxC {
    public static void main(String[] args) {
        int[] arr={1,0,1,1,1,1,1,1,1,1,1,1,1,1};
        int count =0;
        int max=0;
        for(int c:arr){
            if(c==1){
                count++;
            }
            else{
                max=Math.max(count,max);
                count=0;
            }

        }
        max=Math.max(count,max);
        System.out.println(max);
    }
}

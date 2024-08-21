public class rotetion {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,6,7};
        int b=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<arr[i+1])
            {
                b++;
            }
            else
                break;
        }
        System.out.println(b+1);
    }
}

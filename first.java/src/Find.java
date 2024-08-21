import java.util.Arrays;

public class Find {
    public static void main(String[] args)
    {
        int i,j,d,sum=0;
        int[] arr={5,20,3,2,5,80};
        int n=78;
        Arrays.sort(arr);
        for(i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        for(i=0;i<arr.length;i++) {
            for (j = i+1; j < arr.length; j++) {
                d=(arr[j] - arr[i]);
                System.out.println(d);
                if (n == d) {
                    System.out.println(d);

                }

            }
        }
    }
}

public class linear {
    public static void main(String[] args) {
        int[] a={12,123,4324,123445};
        int[] j=new int[10000];
        int l=0;
        for(int i=0;i<a.length;i++)
        {
            int c=0;
            int b=a[i];
            int d=b;
            while(b!=0)
            {
                b=b/10;
                c++;
            }
            if(c%2==0)
            {
                l++;
            }
        }
        System.out.println(l);


    }
}

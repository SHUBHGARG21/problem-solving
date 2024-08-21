public class fac {
    public static void main(String[] args) {
        fir(51234);
        System.out.println(sum);
    }
    static int sum=0;
    static void fir(int n){

        if(n==0){
            return ;
        }
        int re=n%10;
        sum=re*10+sum;
        fir(n/10);
    }
}

public class rec1 {
    public static void main(String[] args) {
        for (int i=0;i<8;i++)
            System.out.print(print(i)+" ");
    }
    static int print(int n){
        if(n<=1){
            return n;
        }
        return print(n-1)+print(n-2);



    }
}

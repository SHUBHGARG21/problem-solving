import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the no");
        int n=in.nextInt();
        System.out.println(step(n,0));
    }
//    static int fac(int n,int c){
//        if(n==0){
//            return c;
//        }
//        int sum=n%10;
//        if(sum==0){
//           c=c+1;
//        }
//        return fac(n/10,c);
//
//    }
    static int step(int n,int c){
        if(n<1){
            return c;
        }
        if(n%2==0){
            c=c+1;
            return step(n/2,c);
        }
        else{
            c=c+1;
            return step(n-1,c);
        }
    }

}

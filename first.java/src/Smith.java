import java.util.Scanner;

public class Smith {
    public static int prime(int n){
        int ans=0;
        int count=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                count++;

            }
            if(count==2){
                ans=ans+i;
            }
        }
        return 1;
    }
    public static  void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n=input .nextInt();
        int ans= prime(n);
    }
}

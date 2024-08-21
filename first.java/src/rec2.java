import java.util.*;

public class rec2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr=new int[5];
        System.out.println("enter the ele");
        for (int i=0 ;i<arr.length;i++){
            arr[i]=in.nextInt();

        }
        System.out.println(Sorted(arr,0));
    }

    static boolean Sorted(int[] arr,int n){
        if(n==arr.length-1 ){
            return true;
        }
        else{
            return arr[n]<arr[n+1] && Sorted(arr,n+1);
        }

    }
}

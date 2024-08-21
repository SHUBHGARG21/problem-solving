
import java.util.*;
public class FindPivit {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        System.out.println(count(arr));

    }

    private static int count(int[] arr) {

        int add=findpiv(arr);
        if(add==-1){
            return 0;
        }
        else{
            return add;
        }
    }

    public static int findpiv(int[] arr) {

        int start=0;
        int end=arr.length-1;
        while(start<end){

            int mid=end+(start-end)/2;

            if(end>mid && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(start<mid && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]<=arr[start]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }

}

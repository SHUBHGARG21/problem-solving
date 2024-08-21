
import java.util.*;

public class BinaryQ {
    public static void main(String[] args) {

        int[]arr={1,3,5,7,8,6,4,2,0};
        int ar=BinarySearch(arr);
        System.out.println(ar);

    }
//    public static int search(int[] arr,int target){
//
//        int start=0;
//        int end =1;
//        while(target>arr[end]){
//            int temp=end+1;
//            end = end +(end-start)*2;
//            start=temp;
//
//        }
//        return BinarySearch(arr,target,start,end);
//
//    }

    static int BinarySearch(int[] arr){
        int start=0;
        int end =arr.length-1;


        while(start!=end){
            int mid= start + (end - start)/2;
            if(arr[mid]>arr[mid+1]){
                end =mid;

            } else  {
                start=mid+1;

            }
        }
        return arr[start];
    }
}

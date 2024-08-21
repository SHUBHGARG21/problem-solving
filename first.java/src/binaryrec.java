import java.util.*;


public class binaryrec {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        System.out.println(binary(arr,0,arr.length,9));

    }

    static int binary(int[] arr,int start,int end,int tar){


        if(start>end){
            return -1;
        }

        int mid=start+(end-start)/2;
        if(tar==arr[mid]){
            return mid;
        }
        else if(tar>arr[mid]){
            return binary(arr, mid+1,end,tar);
        }
        else{
            return binary(arr,start,mid-1,tar);
        }



    }
}

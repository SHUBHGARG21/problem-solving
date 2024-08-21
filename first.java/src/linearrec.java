import java.util.*;
import java.util.ArrayList;


public class linearrec {
    public static void main(String[] args) {
        int[] arr={1,2,3,3,4,4,5,6,7,8};
        System.out.println(allele(arr,3,0,new ArrayList<>()));

    }
//    static ArrayList<Integer> list=new ArrayList<>();
    static ArrayList<Integer> allele(int[] arr,int tar,int n,ArrayList list){
        if(n==arr.length){
            return list;
        }
        if(arr[n]==tar){
            list.add(n);

        }
        return allele(arr,tar,n+1,list);

    }

}

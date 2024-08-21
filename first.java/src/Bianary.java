public class Bianary {
    public static void main(strings[] args) {

        int[] arr={1,3,4,6,7,8,9,10,13};
        int target= 5;
        int aa=BinarySearch(arr,target);
        System.out.println(aa);


    }
    static int BinarySearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid= start + (end - start)/2;
            if(arr[mid]<target){
                start=mid+1;

            } else if (arr[mid]>target) {
                end =mid-1;
            }
            else {
                return mid;

            }
        }
        return arr[start];
    }
}

import java.util.Arrays;

class Cyclesort {

    static void sort(int[] arr){
        int i=0;
        while(i<arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) swap(arr, i, correct);
            else
                i++;

        }
    }
    static void swap(int[] arr,int i,int correct)
    {
        int alpha=arr[i];
        arr[i]=arr[correct];
        arr[correct]=alpha;
    }

    public static void main(String []args) {
        int[] arr={4,3,2,1};
        sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}


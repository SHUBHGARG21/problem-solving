import java.util.Arrays;
public class merge {
    public static void main(strings[] args) {
        int[] arr={5,7,3,10,9,1,33,44,55,66,765};
        arr=Merge(arr);
        System.out.println(Arrays.toString(arr));

    }

    static int[] Merge(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] first = Merge(Arrays.copyOfRange(arr, 0, mid));
        int[] last = Merge(Arrays.copyOfRange(arr, mid, arr.length));
        return sorted(first, last);

    }

    static int[] sorted(int[] start, int[] end) {
        int[] ready = new int[start.length + end.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < start.length && j < end.length) {
            if (start[i] < end[j]) {
                ready[k] = start[i];
                i++;
            } else {
                ready[k] = end[j];
                j++;
            }
            k++;
        }
        while (i < start.length) {
            ready[k] = start[i];
            i++;
            k++;
        }
        while (j < end.length) {
            ready[k] = end[j];
            j++;
            k++;
        }
        return ready;

    }
}

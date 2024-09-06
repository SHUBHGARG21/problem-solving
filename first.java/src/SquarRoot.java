public class SquarRoot {
    public static void main(String[] args) {
        int n=25;
        int low=0;
        int high=n;
        int result=0;

        while(low<=high){
            int mid=(high+low)/2;
            int mids=mid*mid;
            if(mids==n){
                result=mid;
                break;
            }
            else if (mids<n){
                low=mid+1;
                result=mid;
            }
            else{
                high=mid-1;
            }
        }
        System.out.println(result);
    }
}

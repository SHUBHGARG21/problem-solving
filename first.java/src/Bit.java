public class Bit {
    public static void main(String[] args) {
        int n = 6;
        int i=3;
        System.out.println(ans(n,i));
    }

    private static int ans(int n, int i) {
        int a=1<<i-1;
        return (n&a)==0 ? 0:1;
    }
}

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        System.out.println(PermutaList("", "123"));

    }
//    static void Permu(String p, String up) {
//        if (up.isEmpty()) {
//            System.out.println(p);
//            return;
//        }
//
//        char ch = up.charAt(0);
//
//        for (int i = 0; i < p.length(); i++) {
//            String f = p.substring(0, i);
//            String la = p.substring(i, p.length());
//            Permu(f + ch + la, up.substring(1));
//        }
//    }

//        static void Permuta(String p,String up){
//        if(up.isEmpty()){
//            System.out.println(p);
//            return;
//
//        }
//        char ch = up.charAt(0);
//        for(int i=0;i<p.length();i++) {
//            String left = p.substring(0, i);
//            String right = p.substring(i, p.length());
//            Permuta(left + ch + right, up.substring(1));
//        }

    static ArrayList<String> PermutaList(String p, String up) {

        if (up.isEmpty()) {
            ArrayList<String> arr = new ArrayList<>();
            arr.add(p);
            return arr;

        }
        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <=p.length(); i++) {
            String left = p.substring(0, i);
            String right = p.substring(i, p.length());
            ans.addAll(PermutaList(left + ch + right, up.substring(1)));
        }
        return (ans);

//        }

//    static int Permuta(String p,String up) {
//        if (up.isEmpty()) {
//            System.out.println(p);
//            return 1;
//
//        }
//        int count =0;
//
//        char ch = up.charAt(0);
//        for (int i = 0; i < p.length(); i++) {
//
//            String left = p.substring(0, i);
//            String right = p.substring(i, p.length());
//            count += Permuta(left + ch + right, up.substring(1));
//        }
//        return count;

    }
}
//}

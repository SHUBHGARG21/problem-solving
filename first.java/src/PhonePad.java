import java.util.ArrayList;

public class PhonePad {
    public static void main(String[] args) {
        System.out.println( pad("","7"));

    }

    static ArrayList<String> pad(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> arr = new ArrayList<>();
            arr.add(p);
            return arr;

        }
        int  a = up.charAt(0)-'0';
        ArrayList<String> arr = new ArrayList<>();
        for (int i=(a-1)*3 ; i<a*3;i++){
            char ch = (char)('a'+ i);
            arr.addAll(pad(p+ch,up.substring(1)));
        }
        return arr;



    }

}

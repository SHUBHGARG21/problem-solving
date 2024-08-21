
import java.util.*;
public class Palendrom {

    public static void main(String[] args) {
//        palen("shubh");
        System.out.println(palen("nitin"));

    }

    static boolean palen(String str){
        str=str.toLowerCase();
        int start=0;
        int end = str.length();
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(start)!=str.charAt(end-1)){
                return false;



            }
            start++;
            end--;

        }
        return true;
    }
}

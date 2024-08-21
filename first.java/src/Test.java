import java.util.HashMap;
import java.util.Map;

public class Test{
    public static void main(String[] args) {
        String input="This is sample string ";
        Map<Character,Integer> map=new HashMap<>();
        for(char ch : input.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        System.out.println(map);

    }
}

// [T,1]
//[h,1]
//[i,1], [s,1],[ ,1],[i,2],[s,2],[ ,2],[s,3],[a,1],[m,1],[p,1],[l,1],[e,1],[ ,3],[s,4],[t,1],[r,1],[i,3],[n,1],[g,1],[ ,4]


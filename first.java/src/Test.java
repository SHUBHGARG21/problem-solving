import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test{
    public static void main(String[] args) {
        int[] input={23,3,4,3,42,3,23,2,1,1,2,2,42,42};
        Map<Integer,Integer> map=new HashMap<>();
        for(int ch:input){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        System.out.println(map);
//        for(Map.Entry<Integer,Integer> map1:map.entrySet()){
//            System.out.println(map1.getKey()+" "+map1.getValue());
//        }
        Map<Integer,Integer> sortmap= new TreeMap<>(map);
        for(Map.Entry<Integer,Integer> map1 : sortmap.entrySet()){
            System.out.println(map1.getKey()+" "+map1.getValue());
        }
    }
}

// [T,1]
//[h,1]
//[i,1], [s,1],[ ,1],[i,2],[s,2],[ ,2],[s,3],[a,1],[m,1],[p,1],[l,1],[e,1],[ ,3],[s,4],[t,1],[r,1],[i,3],[n,1],[g,1],[ ,4]
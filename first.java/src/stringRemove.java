public class stringRemove {
    public static void main(String[] args) {
        System.out.println(removeapple("baccapplesh"));


    }
//    static void remove(String p,String n){
//        if(n.isEmpty()){
//            System.out.println(p);
//            return;
//        }
//        char a=n.charAt(0);
//        if(a=='a'){
//            remove(p, n.substring(1));
//
//        }
//        else{
//            remove(p+a,n.substring(1));
//        }
//    }
        static String remove(String n){
            if(n.isEmpty()){

                return "";
            }
            char a=n.charAt(0);
            if(a=='a'){
                return remove(n.substring(1));

            }
            else{
                return  a+remove(n.substring(1));
            }

        }

    static String removeapple(String n){
        if(n.isEmpty()){

            return "";
        }

        if(n.startsWith("apple")){
            return removeapple(n.substring(5));

        }
        else{
            return  n.charAt(0)+removeapple(n.substring(1));
        }

    }


}

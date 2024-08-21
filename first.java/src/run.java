//class GFG  extends Thread{
//    public void run(){
//        System.out.println("Welcome !!");
//    }
//
//    public static void main(String[] args) {
//        GFG myThread = new GFG();
//        myThread.start();
//    }
//}

class GFG implements Runnable{
    public static void main(String[] args) {
        GFG gfg = new GFG();
        Thread t = new Thread(gfg,"gfg");
        t.start();
        System.out.println(t.getName());
    }

    @Override
    public void run() {
        System.out.println("Inside run method");
    }
}
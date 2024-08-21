//import java.util.Scanner;
//
//class BinaryTree {
//    public BinaryTree(){
//
//    }
//    private static class Node{
//        int value;
//        Node right;
//        Node left;
//        public Node(int value){
//            this.value=value;
//        }
//    }
//    private Node root;
//    // insert element
//
//
//    public void populate(Scanner scanner) {
//        System.out.println("enter the root");
//        int value= scanner.nextInt();
//        root=new Node(value);
//        populate(scanner,root);
//
//    }
//    private void populate(Scanner scanner, Node node){
//        System.out.println("do you enter the value at the left"+ node.value);
//        boolean left= scanner.nextBoolean();
//        if (left){
//            int value= scanner.nextInt();
//            node.left=new Node(value);
//            populate(scanner,node.left);
//        }
//        System.out.println("do you enter the value at the right"+ node.value);
//        boolean right= scanner.nextBoolean();
//        if (right){
//            int value= scanner.nextInt();
//            node.right=new Node(value);
//            populate(scanner,node.right);
//        }
//    }
//
//    public void display(){
//        display(this.root," ");
//    }
//    private void display(Node node , strings indent){
//        if(node==null){
//            return;
//        }
//        System.out.println(indent+node.value);
//        display(node.left,indent+"/t");
//        display(node.right,indent+"/t");
//    }
//}
//
//
//
//
//
//
//
//
//
//
//
//

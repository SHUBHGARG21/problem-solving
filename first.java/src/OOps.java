class Vehicle {
    protected String bread="Ford";
    public void horn(){
        System.out.println("tttttttttt");
    }
}
class Car extends Vehicle{
    private String modalName="Mustang";

    public static void main(String[] args) {
        Car myCar= new Car();
        myCar.horn();
        System.out.println(myCar.bread+" "+myCar.modalName);
    }
}

class Main{
    public static void main(String[] args) {
        try{
            int[] myNu={1,23,3};
            System.out.println(myNu[10]);
        }
        catch (Exception e){
            System.out.println("Wrong Index !");
        }
        finally {
            System.out.println("try and catch is finished");
        }
    }
}

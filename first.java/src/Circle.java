class Circles {

        private final double pi = 3.14;

        public Circles(double radius) {
            if (radius <= 0) {
                System.out.println("Radius cannot negative or zero");
            } else {
                System.out.println("area = " + pi * radius * radius);
            }
        }
    }

    public class Circle {

        public static void main(String[] args) {
            Circles cir = new Circles(10);
            Circles cir1 = new Circles(8);
            Circles cir2 = new Circles(6);
            Circles cir3 = new Circles(4);
            Circles cir4 = new Circles(2);
        }
}

public class Sample2 {


    public static class BlueCar{
        int a;
        {        System.out.print("4");
        }
        BlueCar(int a) {
            this.a = a;
        }
        public BlueCar() {
//            super("blue");
            System.out.print("5");
        }
        public static void main(String[] gears) {
            BlueCar onj = new BlueCar(4);
            new BlueCar();
        }
    }
}

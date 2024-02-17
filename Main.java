public class Main {
    public static void main(String[] args) throws Exception {
        SUV forutner = new SUV("Fortuner",false);
        forutner.move(40,0);
        forutner.accelerate(20);
        System.out.println("Current Gear: " + forutner.getCurrentGear());
        System.out.println("Current Speed: " + forutner.getCurrentSpeed());
    }
}

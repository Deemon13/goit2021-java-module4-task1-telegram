public class Engine {
    private int power;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getFuelType() {
        return "A500";
    }

    public static void main(String[] args) {
        Engine engine = new Engine();

        System.out.println(engine.getFuelType()); //A500

        Engine xFuelEngine = new XFuelEngine();
        System.out.println(xFuelEngine.getFuelType()); //XFuel
    }
}

class XFuelEngine extends Engine {
    public String getFuelType() {
        return "XFuel";
    }
}
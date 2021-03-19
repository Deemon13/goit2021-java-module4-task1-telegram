public class Engine {
    private int power;
    private String fuelType = "A500";

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getFuelType() {
        return this.fuelType;
    }

    public static void main(String[] args) {
        Engine engine = new Engine();
        System.out.println(engine.getFuelType());
    }
}

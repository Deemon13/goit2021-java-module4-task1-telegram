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

        AdvancedXFuelEngine advEngine = new AdvancedXFuelEngine();
        advEngine.setPower(1000);
        advEngine.setSerialNumber("SN504030");
        advEngine.printInfo(); //Serial number is SN504030, power is 1000
    }
}

class XFuelEngine extends Engine {
    protected String serialNumber;

    public void setSerialNumber (String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getFuelType() {
        return "XFuel";
    }
}

class AdvancedXFuelEngine extends XFuelEngine {
    public void printInfo() {
        System.out.println("Serial number is " + this.serialNumber +", power is " + getPower());
    }
}
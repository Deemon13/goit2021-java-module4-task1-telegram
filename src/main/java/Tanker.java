public class Tanker {
    private String serialNumber;

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber (String serialNumber) {
        this.serialNumber = serialNumber;
    }

    protected String getFuelType() {
        return "A500";
    }

    public void refuel(int amount) {
        System.out.println("Add " + amount + " of " + getFuelType() + ", tanker serial number is " + serialNumber);
    }

    public static void main(String[] args) {
        Tanker tanker = new Tanker();
        //Should be Add 300 of A500, tanker serial number is SN504030
        tanker.setSerialNumber("SN504030");
        tanker.refuel(300);

        //Should be Add 300 of XFuel, tanker serial number is SN504030
        Tanker xTanker = new XFuelTanker();
        xTanker.setSerialNumber("SN504030");
        xTanker.refuel(300);

        //Should be Add 300 of MX200, tanker serial number is SN504030
        Tanker mxTanker = new MX200Tanker();
        mxTanker.setSerialNumber("SN504030");
        mxTanker.refuel(300);
    }
}

class XFuelTanker extends Tanker {
    protected String getFuelType() {
        return "XFuel";
    }
}

class MX200Tanker extends Tanker {
    protected String getFuelType() {
        return "MX200";
    }
}

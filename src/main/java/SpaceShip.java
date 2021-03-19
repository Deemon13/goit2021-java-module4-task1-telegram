public class SpaceShip {
    private String name;
    private String serialNumber;

    public String getName() {
        return name;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setName(String name) {
        if (!name.isBlank() && name.length() <= 100) {
            this.name = name;
        }
    }

    public void setSerialNumber(String serialNumber) {
        if (serialNumber.startsWith("SN") && serialNumber.length() == 8) {
            this.serialNumber = serialNumber;
        }
        return;
    }

    public void printInfo() {
        System.out.println("Name is " + getName() +", serial number is " + getSerialNumber());
    }

    //Test output
    public static void main(String[] args) {
        SpaceShip ship = new SpaceShip();
        System.out.println(ship.getName()); //Should be null
        ship.setName("Walker");
        System.out.println(ship.getName()); //Should be Walker

        ship.setName("Walker");
        System.out.println(ship.getName()); //Should be Walker
        ship.setName("");
        System.out.println(ship.getName()); //Should be Walker, empty value ignored
        ship.setName("Voyager ".repeat(100));
        System.out.println(ship.getName()); //Should be Walker, too long value

        ship.setSerialNumber("SN506788");
        System.out.println(ship.getSerialNumber()); //Should be SN506788
        ship.setSerialNumber("EE123456");
        System.out.println(ship.getSerialNumber()); //Should be SN506788 - old value

        //Name is Voyager, serial number is SN504030
        ship.printInfo();
    }
}
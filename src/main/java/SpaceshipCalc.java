class SpaceshipCalc {
    public final int calculateAirBalloons(int passengerCount) {
        return 10 * passengerCount;
    }

    public int calculateBookCount(int passengerCount) {
        return 2 * passengerCount;
    }

    public static void main(String[] args) {
        SpaceshipCalc calc = new SpaceshipCalc();
        System.out.println(calc.calculateAirBalloons(35)); // 350
        System.out.println(calc.calculateBookCount(50)); // 100
    }
}

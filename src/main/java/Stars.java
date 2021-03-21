class Stars {
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    /*@Override
    public String toString() {
        int starRepeater = 0;
        String tempStars = "";
        String guildianStars = "";
        String stringStars = "";
        int countStars = count;

        if (countStars >= 1000) {
            starRepeater = countStars / 1000;
            tempStars = "X".repeat(starRepeater);
            stringStars = guildianStars + tempStars;
            tempStars = "";
            countStars = count - 1000 * starRepeater;
            System.out.println("countStars1000:" + countStars);
        }

        if (countStars >= 100 && countStars < 1000) {
            starRepeater = countStars / 100;
            tempStars = "Y".repeat(starRepeater);
            stringStars = stringStars + tempStars;
            tempStars = "";
            countStars = count - 100 * starRepeater;
            System.out.println("countStars100:" + countStars);
        }

        if (countStars >= 10 && countStars < 100) {
            starRepeater = countStars / 10;
            tempStars = "Z".repeat(starRepeater);
            stringStars = guildianStars + tempStars;
            tempStars = "";
            countStars = count - 10 * starRepeater;
            System.out.println("countStars10:" + countStars);
        }

        if (countStars > 0 && countStars < 10) {
            starRepeater = countStars;
            tempStars = "*".repeat(starRepeater);
            stringStars = guildianStars + tempStars;
            tempStars = "";
            System.out.println("countStars1:" + countStars);
        }

        guildianStars += stringStars;

        return guildianStars;
    }

     */

    @Override
    public String toString() {
        String stringCount = String.valueOf(count);
        char[] arrCount = stringCount.toCharArray();
        String guildStars = "";

        if (arrCount.length == 1) {
            guildStars = guildStars + "*".repeat(Character.getNumericValue(arrCount[0]));
        }

        if (arrCount.length == 2) {
            String guildStarsOne = "Z".repeat(Character.getNumericValue(arrCount[0]));
            String guildStarsTwo = "*".repeat(Character.getNumericValue(arrCount[1]));
            guildStars = guildStars + guildStarsOne + guildStarsTwo;
        }

        if (arrCount.length == 3) {
            String guildStarsOne = "Y".repeat(Character.getNumericValue(arrCount[0]));
            String guildStarsTwo = "Z".repeat(Character.getNumericValue(arrCount[1]));
            String guildStarsThree = "*".repeat(Character.getNumericValue(arrCount[2]));
            guildStars = guildStars + guildStarsOne + guildStarsTwo + guildStarsThree;
        }

        if (arrCount.length == 4) {
            String guildStarsOne = "X".repeat(Character.getNumericValue(arrCount[0]));
            String guildStarsTwo = "Y".repeat(Character.getNumericValue(arrCount[1]));
            String guildStarsThree = "Z".repeat(Character.getNumericValue(arrCount[2]));
            String guildStarsFour = "*".repeat(Character.getNumericValue(arrCount[3]));
            guildStars = guildStars + guildStarsOne + guildStarsTwo + guildStarsThree + guildStarsFour;
        }
        return guildStars;
    }

    public static void main(String[] args) {
        Stars stars = new Stars();
        stars.setCount(153);
        System.out.println(stars);
        System.out.println(stars.getCount());

        stars.setCount(6247);
        System.out.println(stars);
        System.out.println(stars.getCount());
    }
}

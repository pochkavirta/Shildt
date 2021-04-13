public class DiumToMetr {
    public static void main(String[] args) {
        double dium, metr;
        int counter;

        counter = 0;
        for (dium = 1; dium <= 100; dium++) {
            metr = dium * 39.37;
            System.out.println(dium + " Дюймам соответствует " + metr + " метра.");

            counter++;
            if (counter == 12) {
                System.out.println();
                counter = 0;
            }
        }
    }
}

public class StringCalculator {

    public static void main(String[] args) {

        String str = "1. 2.";

        String[] strArray = str.split("-|\\.");

        int sum = sum(strArray);
    }

    public static int sum(String[] strArray) {

        int sum = 0;

        for (int i = 0; i < strArray.length; i++) {

            try {
                int a = Integer.parseInt(strArray[i]);
                if(a <= 1000) {
                    sum += a;
                }
            } catch (NumberFormatException ex) {
                // Do nothing
            }
        }
        return sum;
    }
}

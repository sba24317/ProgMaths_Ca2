import java.util.Scanner;

public class InputData {

    Scanner scanner = new Scanner(System.in);

    public double getNextDouble(String msg) throws Exception {
        double res = 0.00;
        boolean isValid = false;

        while (!isValid) {
            try {
                scanner = new Scanner(System.in);
                System.out.print(msg);
                res = this.scanner.nextDouble();
                isValid = true;

            } catch (Exception e) {
                System.out.println("A double value is expected.");
            }
        }
        return res;
    }

    /*
     * This private method prompts to The user input a new int value.
     */
    public int getNextInt(String msg) {
        int res = 0;
        boolean isValid = false;

        while (!isValid) {
            try {
                scanner = new Scanner(System.in);
                System.out.print(msg);
                res = this.scanner.nextInt();
                isValid = true;

            } catch (Exception e) {
                System.out.println("An integer value is expected.");
            }
        }
        return res;
    }
}

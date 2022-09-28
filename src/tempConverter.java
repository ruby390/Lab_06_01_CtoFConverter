import java.util.Scanner;
public class tempConverter {
        public static void main(String[]args) {
            Scanner in = new Scanner(System.in);
            // Variables
            String trash="";
            int celciusTemp = 0;
            double farenheightTemp = 0;
            // Getting Input
            System.out.println("Enter a temperature in Celcius:");
            if(in.hasNextInt()) {
                celciusTemp = in.nextInt();
            }
            else {
                trash = in.nextLine();
                System.out.println("You entered " + trash + ", please run the program again and enter a valid integer.");
                System.exit(0);
            }
            // Calculation + exit
            farenheightTemp = celciusTemp - 32 * 0.556;
            System.out.println(celciusTemp + "in Farenheight is " + farenheightTemp);
        }

}

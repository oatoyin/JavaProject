import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter length in feet (ft.)");

        double feet = input.nextDouble();
        double meters = feet * 0.305;

        System.out.println(feet + " feet is "+ meters + " meters.");
    }

}

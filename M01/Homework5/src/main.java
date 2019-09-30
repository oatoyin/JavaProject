import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of student: ");
        int studentCount = input.nextInt();
        input.nextLine();

        String topSName = null;
        double topSScore = 0;
        String secondSName = null;
        double secondSScore = 0;

        for (int i = 0; i < studentCount; i++) {
            System.out.print("Enter name for student #" + (i + 1) + ": ");
            String s = input.next();

            System.out.print("Enter score for student #" + (i + 1) + ": ");
            double score = input.nextDouble();

            if (score > topSScore) {
                if (topSName != null) {
                    secondSName = topSName;
                    secondSScore = topSScore;
                }
                topSName = s;
                topSScore = score;
            } else if (score > secondSScore) {
                secondSName = s;
                secondSScore = score;
            }

        }
        System.out.println("Top student " + topSName + "'s score is " + topSScore);
        System.out.println("Second top student " + secondSName + "'s score is " + secondSScore);
    }
}
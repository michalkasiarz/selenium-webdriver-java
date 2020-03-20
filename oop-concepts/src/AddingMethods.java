package src;

public class AddingMethods {

    public static void main(String[] args) {

        String studentName = "john";
        int score = 70;
        String grade;

        if (score >= 90 && score <= 100) {
            grade = "A";
        } else if (score >= 80 && score < 90) {
            grade = "B";
        } else if (score >= 70 && score < 80) {
            grade = "C";
        } else {
            grade = "D";
        }
        System.out.println("Grade of " + studentName + " is " + grade + ".");

    }
}

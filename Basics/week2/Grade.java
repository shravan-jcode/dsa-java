package week2;

public class Grade {

    public static void grade(int marks) {

        // Optional: Validate input
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks");
        }
        else if (marks >= 90) {
            System.out.println("Grade A");
        }
        else if (marks >= 75) {
            System.out.println("Grade B");
        }
        else if (marks >= 50) {
            System.out.println("Grade C");
        }
        else if (marks >= 35) {
            System.out.println("Grade D");
        }
        else {
            System.out.println("Fail");
        }
    }

    public static void main(String[] args) {

        grade(90);

    }

}
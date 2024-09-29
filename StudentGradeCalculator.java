import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {

        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter the number of subjects:");
        int numOfSubjects = scanobj.nextInt();
        int[] marks = new int[numOfSubjects];

        for (int i = 0; i < numOfSubjects; i++) {
            System.out.println("Enter marks out of 100 for subject " + (i + 1) + " :");
            marks[i] = scanobj.nextInt();
        }

        int totalMarks = 0;
		for (int i = 0; i < marks.length; i++) {
			totalMarks = totalMarks + marks[i];
		}

        double averagePercentage = totalMarks / numOfSubjects;

        String grade;
        if (averagePercentage >= 90) {
            grade = "A+";
        } else if (averagePercentage >= 80) {
            grade = "A";
        } else if (averagePercentage >= 70) {
            grade = "B";
        } else if (averagePercentage >= 60) {
            grade = "C";
        } else if (averagePercentage >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("Total Marks: " + totalMarks + "/"+(numOfSubjects * 100));
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        scanobj.close();
    }
}
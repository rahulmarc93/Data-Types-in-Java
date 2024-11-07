package interviewCodes;
import java.util.Scanner;

public class Student_Grade_Calculator {
	
	public static void main(String[]args) {
		
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter student's name: ");
    String studentName = sc.nextLine();

    // Array to store marks for 5 subjects
    int[] marks = new int[5];
    int total = 0;

    // Input marks for each subject
    for (int i = 0; i < 5; i++) {
        System.out.println("Enter marks for subject " + (i + 1) + ": ");
        marks[i] = sc.nextInt();
        total += marks[i];
    }

    // Calculating average
    double average = total / 5.0;

    // Average Grade
    char grade;
    if (average >= 90) {
        grade = 'A';
    } else if (average >= 80) {
        grade = 'B';
    } else if (average >= 70) {
        grade = 'C';
    } else if (average >= 60) {
        grade = 'D';
    } else {
        grade = 'F';
    }

    // Display results
    System.out.println("\nStudent Name: " + studentName);
    System.out.println("Total Marks: " + total);
    System.out.println("Average Marks: " + average);
    System.out.println("Grade: " + grade);

    sc.close();
}
}
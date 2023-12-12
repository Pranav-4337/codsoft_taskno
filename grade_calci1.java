import java.util.Scanner;

public class grade_calci1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numOfSubjects = scanner.nextInt();

        int totalMarks = 0;
        for (int i = 1; i <= numOfSubjects; i++) {
            System.out.print("Enter the marks obtained in respective subject " + i + ": ");
            int marks = scanner.nextInt();
            totalMarks += marks;
        }

        double averagePercentage = (double) totalMarks / numOfSubjects;

        String grade;
        if(averagePercentage>=90){
            grade="A";
        }else if(averagePercentage>=80 && averagePercentage<90){
            grade="AB";
        }else if(averagePercentage>=70 && averagePercentage<80){
            grade="B";
        }else if(averagePercentage>=60 && averagePercentage<70){
            grade="BC";
        }else if(averagePercentage>=50 && averagePercentage<60){
            grade="C";
        }else if(averagePercentage>=40 && averagePercentage<50){
            grade="D";
        }else if(averagePercentage>=35 && averagePercentage<40){
            grade="E";
        }
        else{
            grade="F";
        }

        System.out.println("\nTotal Marks obtained: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage );
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
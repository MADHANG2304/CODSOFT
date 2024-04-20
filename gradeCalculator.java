import java.util.*;
public class gradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----GRADE CALCULATOR-----");
        System.out.print("Enter the total number of subjects: ");
        int totalSubjects = scanner.nextInt();
        int[] studentMarks = new int[totalSubjects];
        System.out.println("Enter the marks out of 100");
        for(int i = 0; i < totalSubjects; i++)
        {
            System.out.printf("Enter the Mark %d:",i + 1);
            studentMarks[i] = scanner.nextInt();
        }
        int fail = 0;
        int total = 0;
        double average = 0;
        for(int i = 0;i < totalSubjects;i++)
        {
            total += studentMarks[i];
            average += studentMarks[i];
            if(studentMarks[i] < 50)
            {
                fail++;
            }
        }
        average = average / totalSubjects;
        System.out.println("The Total of 5 subject is " + total);
        System.out.printf("Average of 5 Subject is %.1f\n",average);
        
        if(average >=  90 && average <=100)
        {
            System.out.println("O Grade");
        }
        else if (average >= 80 && average < 90) {
            System.out.println("A+ Grade");
        }
        else if (average >= 70 && average < 80) {
            System.out.println("A Grade");
        }
        else if (average >= 60 && average < 70) {
            System.out.println("B+ Grade");
        }
        else if(average >=50 && average < 60)
        {
            System.out.println("C Grade");
        }
        else
        {
            System.out.println("FAIL");
        }
        if(fail > 0)
        {
            System.out.printf("You are fail in %d subjects",fail);
        }

    }

}




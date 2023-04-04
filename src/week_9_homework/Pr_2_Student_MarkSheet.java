package week_9_homework;
/**
 * 2. Rewrite the student mark sheet programme (From java-homework-week3
 * programmes) using if else and while loop.
 */

import java.util.Scanner;

public class Pr_2_Student_MarkSheet { //creating instance method studentMarkSheet
    public void studentMarkSheet() {
        Scanner input = new Scanner(System.in);
        String name;
        int rollNo, mathMarks, scienceMarks, englishMarks, totalMarks;
        double percentage;
        String result, grade;

        System.out.print("Enter student name: ");
        name = input.nextLine();

        System.out.print("Enter roll number: ");
        rollNo = input.nextInt();
        //using while loop
        while (true) {
            System.out.print("Enter Math marks (out of 100): ");
            mathMarks = input.nextInt();
            if (mathMarks >= 0 && mathMarks <= 100) {
                break;
            } else {
                System.out.println("Invalid Input, Marks should be between 0 to 100");
            }
        }

        while (true) {
            System.out.print("Enter Science marks (out of 100): ");
            scienceMarks = input.nextInt();
            if (scienceMarks >= 0 && scienceMarks <= 100) {
                break;
            } else {
                System.out.println("Invalid Input, Marks should be between 0 to 100");
            }
        }

        while (true) {
            System.out.print("Enter English marks (out of 100): ");
            englishMarks = input.nextInt();
            if (englishMarks >= 0 && englishMarks <= 100) {
                break;
            } else {
                System.out.println("Invalid Input, Marks should be between 0 to 100");
            }
        }

        totalMarks = mathMarks + scienceMarks + englishMarks;
        percentage = (double) totalMarks / 3;
        result = percentage >= 35 ? "Pass" : "Fail";
        //using if else
        if (percentage >= 80) {
            grade = "A+";
        } else if (percentage >= 60) {
            grade = "A";
        } else if (percentage >= 50) {
            grade = "B";
        } else if (percentage >= 35) {
            grade = "C";
        } else {
            grade = "Fail";
        }

        System.out.println("|------------------------------|");
        System.out.println("|             MARK SHEET       |");
        System.out.println("|------------------------------|");
        System.out.println("|Name: " + name + "                   |");
        System.out.println("|Roll No: " + rollNo + "                    |");
        System.out.println("|------------------------------|");
        System.out.println("|Subject      Marks            |");
        System.out.println("|------------------------------|");
        System.out.println("|Math         " + mathMarks + "               |");
        System.out.println("|Science      " + scienceMarks + "               |");
        System.out.println("|English      " + englishMarks + "               |");
        System.out.println("|------------------------------|");
        System.out.println("|Total Marks  " + totalMarks + "              |");
        System.out.println("|Percentage   " + percentage + "%"   +  "            |");
        System.out.println("|Result       " + result +  "             |");
        System.out.println("|Grade        " + grade + "               |");
        System.out.println("|------------------------------|");
    }


    public static void main(String[] args) {
        //calling instance method into main method
        Pr_2_Student_MarkSheet obj = new Pr_2_Student_MarkSheet();
        obj.studentMarkSheet();
    }


}
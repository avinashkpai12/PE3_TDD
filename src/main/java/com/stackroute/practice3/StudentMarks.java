package com.stackroute.practice3;

import java.util.Scanner;

public class StudentMarks {

    public static void main(String args[]){
        int numOfStudents = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of students : ");
        numOfStudents = scan.nextInt();
        int stuGrades[] = new int[numOfStudents];
        for(int i=0;i<numOfStudents;i++){
            stuGrades[i] = scan.nextInt();
        }
      String ret =   verifyGrade(stuGrades);
    }


     static String verifyGrade(int[] grades){


        String res = "";
        for(int i=0;i<grades.length;i++){
            if(grades[i] <0 || grades[i] > 100){
                res = "error";
            }
            else{
                res = "correct";
            }
        }
        return res;
    }
}


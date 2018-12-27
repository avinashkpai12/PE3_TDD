package com.stackroute.practice3;

import java.util.Scanner;

public class ExceptionTypes {

    public static void main(String args[]){
        /*try{

            int arr[] = new int[2];
            arr[1] = 5;

            Integer i = null;
            i.toString();


        }
        catch(NegativeArraySizeException e){
            System.out.println(e);
        }
        catch(IndexOutOfBoundsException e){
            System.out.println(e);
        }
        catch(NullPointerException e){
            System.out.println(e);
        }*/

        Scanner scan = new Scanner(System.in);

        String s[] = new String[3];
        for(int i=0;i<3;i++) {
            s[i] = scan.nextLine();
        }
        for(String str: s) {
            System.out.println(str);
        }

    }
}

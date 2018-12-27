package com.stackroute.practice3;

import java.awt.*;
import java.util.Scanner;

public class ConsecutiveNum {

    public static boolean checkForConsecutive(String s){
        String split[] = s.split(",");
        boolean ret = false;
        int arr[] = new int[split.length];

        for(int i=0;i<split.length;i++){
            arr[i] = Integer.parseInt(split[i]);
        }

        boolean flag = false;
        for(int i=0;i<arr.length-1;i++){
            if(Math.abs(arr[i] - arr[i+1]) == 1){
                flag = true;
            }
            else{
                flag = false;
                break;
            }

        }

        if(flag){
            ret = true;
        }
        else {
            ret = false;
        }
        return ret;
        }


    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();

        checkForConsecutive(s);


    }
}

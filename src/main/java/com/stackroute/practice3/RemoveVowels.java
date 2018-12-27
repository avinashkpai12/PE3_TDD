package com.stackroute.practice3;

import java.util.Scanner;

public class RemoveVowels {

    public static String[] withoutVowel(String places[]){
        for(int i=0;i<places.length;i++){
            places[i] = places[i].replaceAll("a|e|i|o|u", "");
        }

    return places;
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of places : ");
        int n = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the places");
        String places[] = new String[n];
        for(int i=0;i<n;i++){
            places[i] = scan.nextLine();
        }

        withoutVowel(places);

    }
}

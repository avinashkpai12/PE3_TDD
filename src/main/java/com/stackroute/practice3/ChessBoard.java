package com.stackroute.practice3;

public class ChessBoard {
    public static void main(String args[]){
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if(i%2==0){
                    if(j%2==0){
                        System.out.print("WW|");
                    }
                    else{
                        System.out.print("BB|");
                    }
                }
                else{
                    if(j%2 == 0){
                        System.out.print("BB|");
                    }
                    else{
                        System.out.print("WW|");
                    }
                }
            }
            System.out.println("\n");
        }
    }
}

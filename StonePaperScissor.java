package com.company;
//import java.util.Random;
import java.util.Scanner;

public class StonePaperScissor {
    public static void main(String[] args) {
        int min=1,max=3,matches=5,user_points=0,cpu_points=0;
        while(matches>0)
        {
        System.out.println("Enter any one choice given below:");
        System.out.println("1 for Stone");
        System.out.println("2 for Paper");
        System.out.println("3 for Scissor");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice)
        {
            case 1 -> System.out.println("Stone selected by user");
            case 2 -> System.out.println("Paper selected by user");
            case 3 -> System.out.println("Scissor selected by user");
        }

        System.out.println("Now its Computer's turn");

        int random = (int)Math.floor(Math.random()*(3)+1);
        switch (random)
        {
            case 1 -> System.out.println("Stone selected by CPU");
            case 2 -> System.out.println("Paper selected by CPU");
            case 3 -> System.out.println("Scissor selected by CPU");
        }

            if(choice ==1 && random==1)
            {
                System.out.println("Match tie");
            }
            else if(choice ==1 && random==2){
                System.out.println("CPU won");
                cpu_points++;
            }
            else if(choice ==1 && random==3){
                System.out.println("User won");
                user_points++;
            }
            else if(choice ==2 && random==1){
                System.out.println("User won");
                user_points++;
            }
            else if(choice ==2 && random==2){
                System.out.println("Match tie");
            }
            else if(choice ==2 && random==3){
                System.out.println("CPU won");
                cpu_points++;
            }
            else if(choice ==3 && random==1){
                System.out.println("CPU won");
                cpu_points++;
            }
            else if(choice ==3 && random==2){
                System.out.println("User won");
                user_points++;
            }
            else if(choice ==3 && random==3){
                System.out.println("Match Tie");
            }
            matches--;
        }

        if(user_points>cpu_points)
        {
            System.out.println("Final match User Won!!!");
        }
        else
        {
            System.out.println("Final match CPU Won!!!");
        }
    }
}

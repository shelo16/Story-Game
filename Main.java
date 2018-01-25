package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        setStory setstory = new setStory();
        Scanner scanner = new Scanner(System.in);
        boolean quit = true;
        System.out.println(setstory.getStartingOption());
        System.out.println("1." + setstory.getDrawHelp());
        System.out.println("2." + setstory.getGatherResources());
        while (quit) {
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(setstory.getWait());
                    System.out.println("1." + setstory.getTrySleep());
                    System.out.println("2." + setstory.getFindFood());
                    int choice2 = scanner.nextInt();
                    switch (choice2){
                        case 1:
                            System.out.println(setstory.getLose());
                            System.out.println("Thanks for playing");
                            quit = false;
                            break;
                        case 2 :
                            System.out.println(setstory.getFindFoodWithLighter());
                            System.out.println("1."+ setstory.litFire);
                            System.out.println("2."+ setstory.getTrySleep());
                            int choice3 = scanner.nextInt();
                            switch (choice3){
                                case 1:
                                    System.out.println(setstory.getWin());
                                    System.out.println("Thanks for playing");
                                    quit = false;
                                    break;
                                case 2:
                                    System.out.println(setstory.getLose());
                                    System.out.println("Thanks for playing");
                                    quit = false;
                            }
                            break;
                    }
                    break;
                case 2:
                    System.out.println(setstory.getAfterGatherResources());
                    System.out.println("1." + setstory.getTrySleep());
                    System.out.println("2." + setstory.getFindFood());
                    choice2 = scanner.nextInt();
                    switch (choice2) {
                        case 1:
                            System.out.println(setstory.getLose());
                            System.out.println("Thanks for playing!");
                            quit = false;
                            break;
                        case 2:
                            System.out.println(setstory.getAfterFindFood());
                            System.out.println("What next?");
                            System.out.println("1." + setstory.getLitFire());
                            System.out.println("2." + setstory.getTrySleep());
                            int choice3 = scanner.nextInt();
                            switch (choice3){
                                case 1:
                                    System.out.println(setstory.getWin());
                                    System.out.println("Thanks for playing");
                                    quit = true;
                                    break;
                                case 2:
                                    System.out.println(setstory.getLose());
                                    System.out.println("Thanks for playing");
                                    quit = true;
                                    break;
                            }
                            break;
                    }
                    break;
            }


        }
    }
}

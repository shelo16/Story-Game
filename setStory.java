package com.company;

public class setStory {
    String startingOption = "You wake up, you're stranded on an island, You remember that your ship got sunk in the ocean... You try to calm down, What is your first move ?";
    String drawHelp = "Draw help on the beach with stones and hope for best";
    String gatherResources ="Gather reasources and prepare for the worst";
    String wait = "Sit down , relax, try to calm down and think what to do next. You feel hungry but you're tired as well , its already getting dark , What you do?";
    String trySleep = "Sleep";
    String findFood = "find food";
    String lose = "you slept over a plane, there's no chance that second plane will ever come here, they didn't notice the sign because it was too dark . Now you'll live on the island for a long time. ";
    String afterFindFood = "You found food but you're still very tired, what you do next ?";
    String findFoodWithLighter = "you found food , wood and also a lighter in your pocket which suprisingly still works";
    String afterGatherResources = "You find some wood , you find lighter in your pocket which suprisingly still works , What's your next move ?";
    String litFire = "Lit fire";
    String win = "Whats that sound ? Is that plane ? YES , it's a plane, they see your fire , the pilot nods the wings which means they know you're there, YOU'RE SAVED!";
    Options options = new Options(startingOption, drawHelp, gatherResources, wait, trySleep, findFood, lose, afterFindFood, findFoodWithLighter, afterGatherResources, litFire, win);



    public String startStory(){
        System.out.print(startingOption);
        return startingOption;
    }

    public String getStartingOption() {
        return startingOption;
    }

    public String getDrawHelp() {
        return drawHelp;
    }

    public String getGatherResources() {
        return gatherResources;
    }

    public String getWait() {
        return wait;
    }

    public String getTrySleep() {
        return trySleep;
    }

    public String getFindFood() {
        return findFood;
    }

    public String getLose() {
        return lose;
    }

    public String getAfterFindFood() {
        return afterFindFood;
    }

    public String getFindFoodWithLighter() {
        return findFoodWithLighter;
    }

    public String getAfterGatherResources() {
        return afterGatherResources;
    }

    public String getLitFire() {
        return litFire;
    }

    public String getWin() {
        return win;
    }
}

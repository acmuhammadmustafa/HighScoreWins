package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        String nameScore = "Slytherin:Gryffindor|23:22";

        String[] scoreCodeParts = nameScore.split("\\|");

        String names = scoreCodeParts[0];
        String score = scoreCodeParts[1];
        System.out.println(names);
        System.out.println(score);

        String[] namesArray = names.split(":");
        String[] totalScore = score.split(":");
        int slyScore = Integer.parseInt(totalScore[0]);
        int gryfScore = Integer.parseInt(totalScore[1]);

        if (gryfScore>slyScore){
            System.out.println("Gryffindor wins!");
        }
        if (slyScore>gryfScore){
            System.out.println("Slytherin wins!");
        }
        if (slyScore == gryfScore){
            System.out.println("Tied");
        }

        }
    }

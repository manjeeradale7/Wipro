package com.Day8;
import java.util.*;
public class ScoreBoard {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Map<String, Integer> scores = new HashMap<>();
	        System.out.print("Number of players: ");
	        int count = sc.nextInt();
	        for (int i = 0; i < count; i++) {
	            System.out.println("\nPlayer " + (i + 1));
	            System.out.print("Name: ");
	            String name = sc.next();
	            System.out.print("Score: ");
	            int score = sc.nextInt();
	            scores.put(name, Integer.valueOf(score));
	        }
	        System.out.println("\nScoreboard");
	        for (String player : scores.keySet()) {
	            Integer playerScore = scores.get(player);
	            System.out.println("Player: " + player + ", Score: " + playerScore);
	        }
	        sc.close();
	    }
	}

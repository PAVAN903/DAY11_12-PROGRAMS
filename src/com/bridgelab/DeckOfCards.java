package com.bridgelab;

import java.util.Arrays;
import java.util.Random;

public class DeckOfCards {
	Random random = new Random();
	String[] suit = { "club", "diamond", "hearts", "spade" };
	int lengthOfsuit = suit.length;
	String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "j", "q", "k", "a" };
	int lengthOfrank = rank.length;
	int n = lengthOfsuit * lengthOfrank;
	String[][] cards = new String[lengthOfsuit][lengthOfrank];// storing cards

	public void DeckInitial() {
		for (int i = 0; i < lengthOfsuit; i++) {
			for (int j = 0; j < lengthOfrank; j++) {
				cards[i][j] = suit[i] + ":" + rank[j];

			}

		}
	}

	public void shuffle() {
		for (int i = 0; i < cards.length; i++) {
			for (int j = 0; j < cards[i].length; j++) {
				int a = (int) (Math.random() * 10 % lengthOfsuit);
				int b = (int) (Math.random() * 10 % lengthOfrank);
				String temp = cards[i][j];
				cards[i][j] = cards[a][b];
				cards[a][b] = temp;
			}
		}

	}

	int cardlimit = 9;
	String[] player1 = new String[cardlimit];
	String[] player2 = new String[cardlimit];
	String[] player3 = new String[cardlimit];
	String[] player4 = new String[cardlimit];
	String[] card = new String[n];// converting array

	public void Distrubute() {
		int indice = 0;
		for (int i = 0; i < lengthOfsuit; i++) {
			for (int j = 0; j < lengthOfrank; j++) {
				card[indice++] = cards[i][j];

			}
		}
		int j = 0;// odd position
		for (int i = 0; i < cardlimit; i++) {
			player1[i] = card[j++];// 0,4
			player2[i] = card[j++];// 1,5
			player3[i] = card[j++];// 2,6
			player4[i] = card[j++];// 3,7
		}
		System.out.println("player 1 is having " +Arrays.toString(player1));
		System.out.println("player 2 is having " +Arrays.toString(player2));
		System.out.println("player 3 is having " +Arrays.toString(player3));
		System.out.println("player 4 is having " +Arrays.toString(player4));

	}

}

package com.company;

import com.company.Card.Suit;
import com.company.Card.Rank;

import com.company.FiveCardHands.src.TwoPair;

public class Main {

    public static void main(String[] args) {
        Card[] fiveCardHand = new Card[5];
        fiveCardHand[0] = new Card(Rank.ACE, Suit.DIAMONDS);
        fiveCardHand[1] = new Card(Rank.ACE, Suit.SPADES);
        fiveCardHand[2] = new Card(Rank.JACK, Suit.DIAMONDS);
        fiveCardHand[3] = new Card(Rank.JACK, Suit.SPADES);
        fiveCardHand[4] = new Card(Rank.QUEEN, Suit.DIAMONDS);

        System.out.println(TwoPair.matches(fiveCardHand));
    }


}

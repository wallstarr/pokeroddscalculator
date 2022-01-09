package com.company;

import com.company.Card.Suit;
import com.company.Card.Rank;

import com.company.FiveCardHands.Flush;
import com.company.FiveCardHands.Straight;
import com.company.FiveCardHands.StraightFlush;

public class Main {

    public static void main(String[] args) {
        Card[] fiveCardHand = new Card[5];
        fiveCardHand[0] = new Card(Rank.ACE, Suit.DIAMONDS);
        fiveCardHand[1] = new Card(Rank.KING, Suit.DIAMONDS);
        fiveCardHand[2] = new Card(Rank.TEN, Suit.DIAMONDS);
        fiveCardHand[3] = new Card(Rank.JACK, Suit.DIAMONDS);
        fiveCardHand[4] = new Card(Rank.QUEEN, Suit.DIAMONDS);

        System.out.println(StraightFlush.isAStraightFlush(fiveCardHand));

    }


}

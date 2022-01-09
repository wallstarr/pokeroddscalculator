package com.company.FiveCardHands;

import com.company.Card;
import com.company.Card.*;

public class Flush {

    public static boolean isAFlush(Card[] fiveCardHand) {

        Suit suitToTrack = fiveCardHand[0].getSuit();
        for (int i = 0; i < fiveCardHand.length; i++) {
            Suit currentCardSuit = fiveCardHand[i].getSuit();
            if (currentCardSuit != suitToTrack) {
                return false;
            }
        }
        return true;
    }

}

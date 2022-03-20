package com.company.FiveCardHands.src;

import com.company.Card;
import com.company.Card.*;

public class Flush extends FiveCardHand {

    public static boolean isAFlush(Card[] fiveCardHand) {

        Suit suitToTrack = fiveCardHand[0].getSuit();
        for (int i = 1; i < fiveCardHand.length; i++) {
            Suit currentCardSuit = fiveCardHand[i].getSuit();
            if (currentCardSuit != suitToTrack) {
                return false;
            }
        }
        return true;
    }

}

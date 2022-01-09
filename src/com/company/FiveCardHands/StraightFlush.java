package com.company.FiveCardHands;

import com.company.Card;

public class StraightFlush {

    public static boolean isAStraightFlush(Card[] fiveCardHand) {
        return Straight.isAStraight(fiveCardHand) && Flush.isAFlush(fiveCardHand);
    }

}

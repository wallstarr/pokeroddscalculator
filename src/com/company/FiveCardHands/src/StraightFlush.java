package com.company.FiveCardHands.src;

import com.company.Card;

public class StraightFlush extends FiveCardHand {

    public static boolean isAStraightFlush(Card[] fiveCardHand) {
        return Straight.matches(fiveCardHand) && Flush.matches(fiveCardHand);
    }

}

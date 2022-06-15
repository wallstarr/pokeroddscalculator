package com.company.FiveCardHands.src;

import com.company.Card;
import com.company.Card.Rank;

public class FourOfAKind extends FiveCardHand {

    public static boolean matches(Card[] fiveCardHand) {

        Card[] sortedFiveCardHandAscending = getSortedFiveCardsAscending(fiveCardHand);

        boolean firstFourCardsAreSameRank = fiveCardHand[0].getRank() == fiveCardHand[3].getRank();
        boolean latterFourCardsAreSameRank = fiveCardHand[1].getRank() == fiveCardHand[4].getRank();
        return firstFourCardsAreSameRank || latterFourCardsAreSameRank;

    }
}

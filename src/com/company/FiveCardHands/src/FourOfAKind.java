package com.company.FiveCardHands.src;

import com.company.Card;
import com.company.Card.Rank;

public class FourOfAKind extends FiveCardHand {

    public static boolean matches(Card[] fiveCardHand) {

        Card[] sortedFiveCardHandAscending = getSortedFiveCardsAscending(fiveCardHand);

        boolean firstFourCardsAreSameRank = sortedFiveCardHandAscending[0].getRank() == sortedFiveCardHandAscending[3].getRank();
        boolean latterFourCardsAreSameRank = sortedFiveCardHandAscending[1].getRank() == sortedFiveCardHandAscending[4].getRank();
        return firstFourCardsAreSameRank || latterFourCardsAreSameRank;

    }
}

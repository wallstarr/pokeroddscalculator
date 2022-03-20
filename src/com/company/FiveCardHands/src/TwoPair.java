package com.company.FiveCardHands.src;

import com.company.Card;
import com.company.Card.Rank;

public class TwoPair extends FiveCardHand {

    public static boolean isATwoPair(Card[] fiveCardHand) {
        Card[] sortedFiveCardHandAscending = getSortedFiveCardsAscending(fiveCardHand);
        int numOfPairs = 0;
        Rank previousCardRank = sortedFiveCardHandAscending[0].getRank();
        for (int i = 1; i < sortedFiveCardHandAscending.length; i++) {
            Rank currentCardRank = sortedFiveCardHandAscending[i].getRank();
            if (previousCardRank == currentCardRank) {
                numOfPairs++;
            }
            previousCardRank = currentCardRank;
        }
        return numOfPairs == 2;
    }
}

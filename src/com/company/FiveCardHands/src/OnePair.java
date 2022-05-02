package com.company.FiveCardHands.src;

import com.company.Card;
import com.company.Card.Rank;

public class OnePair extends FiveCardHand {

    public static boolean matches(Card[] fiveCardHand) {
        Card[] sortedFiveCardHandAscending = getSortedFiveCardsAscending(fiveCardHand);
        Rank previousCardRank = sortedFiveCardHandAscending[0].getRank();
        int numOfPairs = 0;
        for (int i = 1; i < NUM_OF_CARDS; i++) {
            Rank currentCardRank = fiveCardHand[i].getRank();
            if (currentCardRank == previousCardRank) {
                numOfPairs++;
            }
            previousCardRank = currentCardRank;
        }
        return numOfPairs == 1;
    }

}

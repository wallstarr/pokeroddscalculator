package com.company.FiveCardHands.src;

import com.company.Card;
import com.company.Card.Rank;

public class ThreeOfAKind extends FiveCardHand {

    public static boolean matches(Card[] fiveCardHand) {
        Card[] sortedFiveCardHandAscending = getSortedFiveCardsAscending(fiveCardHand);
        boolean firstThreeAreSameRank = fiveCardHand[0].getRank() == fiveCardHand[1].getRank() &&
                fiveCardHand[1].getRank() == fiveCardHand[2].getRank() &&
                fiveCardHand[2].getRank() != fiveCardHand[3].getRank() &&
                fiveCardHand[3].getRank() != fiveCardHand[4].getRank();
        boolean middleThreeAreSameRank = fiveCardHand[1].getRank() == fiveCardHand[2].getRank() &&
                fiveCardHand[2].getRank() == fiveCardHand[3].getRank() &&
                fiveCardHand[3].getRank() != fiveCardHand[4].getRank() &&
                fiveCardHand[0].getRank() != fiveCardHand[1].getRank();
        boolean lastThreeAreSameRank = fiveCardHand[2].getRank() == fiveCardHand[3].getRank() &&
                fiveCardHand[3].getRank() == fiveCardHand[4].getRank() &&
                fiveCardHand[1].getRank() != fiveCardHand[2].getRank() &&
                fiveCardHand[0].getRank() != fiveCardHand[1].getRank();
        return firstThreeAreSameRank || middleThreeAreSameRank || lastThreeAreSameRank;
    }
}

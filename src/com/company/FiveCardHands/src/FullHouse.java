package com.company.FiveCardHands.src;

import com.company.Card;
import com.company.Card.Rank;

public class FullHouse extends FiveCardHand {

    public static boolean matches(Card[] fiveCardHand) {
        Card[] sortedFiveCardHandAscending = getSortedFiveCardsAscending(fiveCardHand);

        boolean firstTwoCardRanksMatch = sortedFiveCardHandAscending[0].getRank() == sortedFiveCardHandAscending[1].getRank();
        boolean lastTwoCardRanksMatch = sortedFiveCardHandAscending[3].getRank() == sortedFiveCardHandAscending[4].getRank();
        boolean firstThreeCardRanksMatch = firstTwoCardRanksMatch &&
                sortedFiveCardHandAscending[1].getRank() == sortedFiveCardHandAscending[2].getRank();
        boolean lastThreeCardRanksMatch = lastTwoCardRanksMatch &&
                sortedFiveCardHandAscending[2].getRank() == sortedFiveCardHandAscending[3].getRank();

        return (firstTwoCardRanksMatch && lastThreeCardRanksMatch) || (firstThreeCardRanksMatch && lastTwoCardRanksMatch);
    }

}

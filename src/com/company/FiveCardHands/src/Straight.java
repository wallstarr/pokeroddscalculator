package com.company.FiveCardHands.src;

import com.company.Card;

public class Straight extends FiveCardHand {

    public static boolean matches(Card[] fiveCardHand) {
        Card[] sortedFiveCardHandAscending = getSortedFiveCardsAscending(fiveCardHand);

        System.out.println("First card in sortedFiveCardHandAscending = " + sortedFiveCardHandAscending[0].getRank().getValue());
        System.out.println("Second card in sortedFiveCardHandAscending = " + sortedFiveCardHandAscending[1].getRank().getValue());
        System.out.println("Third card in sortedFiveCardHandAscending = " + sortedFiveCardHandAscending[2].getRank().getValue());
        System.out.println("Fourth card in sortedFiveCardHandAscending = " + sortedFiveCardHandAscending[3].getRank().getValue());
        System.out.println("Fifth card in sortedFiveCardHandAscending = " + sortedFiveCardHandAscending[4].getRank().getValue());

        Card lastCard = sortedFiveCardHandAscending[0];
        for (int i = 1; i < sortedFiveCardHandAscending.length; i++) {
            Card currentCard = sortedFiveCardHandAscending[i];
            if (currentCard.getRank().getValue() - lastCard.getRank().getValue() != 1) {
                return false;
            }
            lastCard = currentCard;
        }
        return true;
    }
    
}

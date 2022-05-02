package com.company.FiveCardHands.src;

import com.company.Card;

abstract class FiveCardHand {

    protected static final int NUM_OF_CARDS = 5;

    protected static boolean matches(Card[] fiveCardHand) throws Exception {
        // gosh darn static methods not being able to be abstract
        throw new Exception("This method should not be called from the FiveCardHand class!");
    }

    protected static Card[] getSortedFiveCardsAscending(Card[] fiveCardHand) {
        Card[] sortedCards = new Card[NUM_OF_CARDS];
        for (int i = 0; i < NUM_OF_CARDS; i++) {
            insertCardIntoSortedArrayAscending(sortedCards, fiveCardHand[i]);
        }
        return sortedCards;
    }

    private static void insertCardIntoSortedArrayAscending(Card[] toInsertInto, Card toInsert) {
        for (int i = 0; i < toInsertInto.length; i++) {
            if (toInsertInto[i] == null) {
                toInsertInto[i] = toInsert;
                break;
            }

            Card currentCard = toInsertInto[i];

            if (toInsert.getRank().getValue() < currentCard.getRank().getValue()) {
                pushCardsBackByOneFromIndex(toInsertInto, i);
                toInsertInto[i] = toInsert;
                break;
            }
        }
    }

    private static void pushCardsBackByOneFromIndex(Card[] toPushBack, int index) {
        for (int i = toPushBack.length - 1; i > index; i--) {
            toPushBack[i] = toPushBack[i - 1];
        }
    }
}

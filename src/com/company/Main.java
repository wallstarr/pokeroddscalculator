package com.company;

import com.company.Card.Suit;
import com.company.Card.Rank;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Card[] fiveCardHand = new Card[5];
        fiveCardHand[0] = new Card(Rank.ACE, Suit.DIAMONDS);
        fiveCardHand[1] = new Card(Rank.KING, Suit.DIAMONDS);
        fiveCardHand[2] = new Card(Rank.TEN, Suit.DIAMONDS);
        fiveCardHand[3] = new Card(Rank.JACK, Suit.DIAMONDS);
        fiveCardHand[4] = new Card(Rank.THREE, Suit.DIAMONDS);

        System.out.println(isAStraight(fiveCardHand));

    }

    private static boolean isAStraight(Card[] fiveCardHand) {
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

    private static Card[] getSortedFiveCardsAscending(Card[] fiveCardHand) {
        Card[] sortedCards = new Card[5];

        for (int i = 0; i < fiveCardHand.length; i++) {
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

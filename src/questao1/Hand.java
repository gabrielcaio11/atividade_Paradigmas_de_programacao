package questao1;

import java.util.ArrayList;
import java.util.List;

class Hand {
    private List<Card> cardsInHand = new ArrayList<>();
    private int maxHandSize = 5;

    public void addCardToHand(Card card) {
        if (cardsInHand.size() < maxHandSize) {
            cardsInHand.add(card);
        } else {
            System.out.println("A mão já está cheia.");
        }
    }

    public void removeCardFromHand(Card card) {
        cardsInHand.remove(card);
    }
}

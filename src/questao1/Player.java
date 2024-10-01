package questao1;

class Player {
    private Hand hand;

    public Player(Hand hand) {
        this.hand = hand;
    }

    public void receiveRandomCardsFromDeck() {
        for (int i = 0; i < 5; i++) {
            hand.addCardToHand(Deck.getRandomCard());
        }
    }
}

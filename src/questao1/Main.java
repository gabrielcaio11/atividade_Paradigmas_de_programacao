package questao1;


public class Main {
    public static void main(String[] args) {
        Deck.initializeDeck();

        Hand playerHand = new Hand();
        Player player = new Player(playerHand);

        player.receiveRandomCardsFromDeck();
    }
}
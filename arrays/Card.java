package arrays;

public class Card {
final String suit;
final String rank;

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }

    public String toString() {
        return String.format("%s of %s",rank, suit );
    }
}

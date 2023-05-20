package blackjack;

abstract class Blackjack_Deckfuntion{
	static final int CARDS = 312;
	protected static String[] deck;
	abstract public String GiveCards();
}

class Cards {
	private String[][] CardCount; // 모양 + 수가 일치하는 카드가 6장이상 안 나오도록 제어
	
	public String makeCards() {
		CardCount = new String[4][13]; // 0->스페이드, 1->클로버, 2->하트, 3->다이아
		for(int i=0; i<CardCount.length; i++) {
			
		}
	}
}

public class Blackjack_Deck extends Blackjack_Deckfuntion{

	public static void main(String[] args) {
		deck = new String[CARD]
	}
	
}

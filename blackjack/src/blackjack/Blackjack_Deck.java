package blackjack;

abstract class Blackjack_Deckfuntion{
	static final int CARDS = 312;
	protected static String[] deck;
	abstract public String GiveCards();
}

class Cards {
	private int[][] CardCount; // 모양 + 수가 일치하는 카드가 6장이상 안 나오도록 제어

	public String makeCards() {
		int CardType; //카드 종류
		int Random = (int)(Math.random()*13); // 카드 숫자
		String[] CardNum = {"A", "1", "2", "3", 
						   "4", "5", "6", "7", 
						   "8", "9", "10","K","Q", "J"};
		
		CardCount = new int[4][13]; // 0->스페이드, 1->클로버, 2->하트, 3->다이아
		CardType = (int)(Math.random()*4);
		String RandomNum = CardNum[Random];
		
		CardCount[CardType][Random+1]+=1;//CardCount 배열 내부 요소 전부 초기화해야댐
		
		return CardType+RandomNum;
	}
	
	
}

public class Blackjack_Deck extends Blackjack_Deckfuntion{

	public static void main(String[] args) {
		deck = new String[CARD];
	}
	
}

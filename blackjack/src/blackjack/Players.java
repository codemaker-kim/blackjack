package blackjack;

import java.util.*;
//베팅은 나중에 생각하자고
abstract class PlayerFuntion{ /**플레이어 클래스 추상*/
	protected String players; // 플레이어 이름
	protected String[][] hands; // 플레이어 패
	abstract public int getScore(); // 각 플레이어 점수 매기기
	abstract public String getCards(); // 덱 클래스에서 카드 받아오기
	abstract public void showCards(); // 저장된 카드 보여주기
}

public class Players extends PlayerFuntion {/**블랙잭 플레이어에 연관된 메소드*/
	
	public Players(String name) {
		players = name;
	}
	
	public void showPlayers() {/**플레이어 목록 보여주기*/
		System.out.println(players);
	}
	
	
	public String getCards() {/**카드를 플레이어에게 분배*/
		hands = new String[3][13];
		Blackjack_Deck deck = new Blackjack_Deck();
		deck.GiveCards();
		
		return s;
	}
	
	public void showCards() { // 얻은 손패 출력
		
	}
	
	public int getScore() { // 손패 바탕으로 점수 매기기
		
	}
	
}

package blackjack;

import java.util.*;
//베팅은 나중에 생각하자고
abstract class PlayerFuntion{ /**플레이어 클래스 추상*/
	protected int Number_of_Players; // 플레이어의 수
	protected String players[]; // 플레이어 이름
	protected String[][] hands; // 플레이어 패
	abstract public int getScore(); // 각 플레이어 점수 매기기
	abstract public String getCards(); // 덱 클래스에서 카드 받아오기
	abstract public void showCards(); // 저장된 카드 보여주기
}

public class Players extends PlayerFuntion {/**블랙잭 플레이어에 연관된 메소드*/
	
	public void getPlayers() {/**플레이어 수, 플레이어 이름 입력받는 놈*/
		Scanner sc = new Scanner(System.in);
		
		System.out.print("게임에 참여하는 플레이어의 수를 정해주세요! >>");
		System.out.println();
		Number_of_Players = sc.nextInt();
		
		for(int i=0; i<Number_of_Players; i++) {
			System.out.println((i+1) + " 번째 플레이어의 이름을 입력해주세요!");
			players[i] = sc.next();
			
		}
		
	}//end of getPlayers
	
	public void showPlayers() {/**플레이어 목록 보여주기*/
		System.out.println("/// 현재 플레이어 목록 ///");
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		for(int i=0; i<Number_of_Players; i++) {
			System.out.println((i+1) + "번째 플레이어 : " + players[i]);
		}
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
	}
	
	
	public String getCards() {/**카드를 플레이어에게 분배*/
		hand = new 
		Blackjack_Deck deck = new Blackjack_Deck();
		deck.GiveCards();
		for(int i=0; i<Number_of_Players; i++) {
			System.out.println(players[i]+"의 패 : ")
		}
	}

	public int getScore() {
		
	}
	
	
}

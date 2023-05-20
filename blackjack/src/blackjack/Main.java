package blackjack;

import java.util.*;
abstract class MainFunction{
}

public class Main {
	public static int checker;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("*** 블 - 랙 - 잭 ***");
		System.out.println();
		
		while(true) {
			System.out.println("게임을 시작하려면 1, 종료는 2");
			checker = sc.nextInt();
			if(checker == 2) {
				break;
			}
			else if(checker == 1) {
				Players p = new Players();
				p.getPlayers();
				p.showPlayers();
				p.getCards();
			}
			
		}
	}

}

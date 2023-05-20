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
				System.out.print("게임에 참여하는 플레이어의 수를 정해주세요! >>");
				System.out.println();
				int Playernumber= sc.nextInt();
				Players[] p = new Players[Playernumber];
				
				
				for(int i=0; i<Playernumber; i++) {// 객체 배열 내 요소에 객체생성
					System.out.println((i+1) + " 번째 플레이어의 이름을 입력해주세요!");
					String Playername = sc.nextLine();
					p[i] = new Players(Playername);
				}
				
				
				System.out.println("/// 현재 플레이어 목록 ///");
				System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
				for(int i=0; i<Playernumber; i++) {// 객체 배열 내 요소(플레이어)마다 저장된 이름 출력
					p[i].showPlayers();
				}
				System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

			}
			
		}
	}

}

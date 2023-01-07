package game1;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Cafe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Menu2 menu = new Menu2();
		System.out.println("게임을 시작합니다!");
		System.out.println("1. 시작하기!");
		System.out.println("2. 그만하기!");
		int start = sc.nextInt();
		
		menu.order(start);
		//		주문받을지 끝낼지 선택 , 주문받기를 선택하면 메뉴판이 나옴
//		start = sc.nextInt();
		
//		손님등장
		do{
			menu.choiceMenu(start);
	//		메뉴를 결정-
			System.out.println("메뉴를 결정해 주세요");
			int choiceNum = sc.nextInt();
	//		첫번째 들어갈 재료선택
			System.out.println("첫번째 들어갈 재료 결정해 주세요");
			menu.choiceRecipe1(1);
			int choiceRecipe1 = sc.nextInt();
	//		두번째 들어갈 재료 선택
			System.out.println("두번째 들어갈 재료 결정해 주세요");
			menu.choiceRecipe2(2);
			int choiceRecipe2 = sc.nextInt();
	//		확인 후 정답 출력
			menu.check(choiceNum, choiceRecipe1, choiceRecipe2);
			System.out.println("1.계속하기 2.그만하기");
			start = sc.nextInt();
			menu.continue1(start);
		}while(start==1);
		
	}
}


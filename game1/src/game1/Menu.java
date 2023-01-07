package game1;

import java.util.Arrays;
import java.util.LinkedHashSet;

import javax.swing.DefaultBoundedRangeModel;

public class Menu {
	
	/*스윙에서 실행될 메뉴클래스*/

//	레시피까지 적혀있는 전체메뉴 2차배열
	private String menu[][] = { { "차가운 아메리카노", "얼음물", "샷" }, 
								{ "뜨거운 아메리카노", "뜨거운물", "샷" }, 
								{ "차가운 라떼", "차가운 우유", "샷" },
								{ "뜨거운 라떼", "뜨거운 우유", "샷" }, 
								{ "차가운 초코우유", "차가운 우유", "초코시럽" }, 
								{ "뜨거운 초코우유", "뜨거운 우유", "초코시럽" },
								{ "차가운 캐모마일", "얼음물", "캐모마일" }, 
								{ "뜨거운 캐모마일", "뜨거운물", "캐모마일" } };

	//	손님의 주문 
	private String orderMsg[][] = { { "시원하고 쓴 커피가 먹고싶어요!", "차가운 아메리카노" }, 
									{ "따듯하고 쓴 커피가 먹고싶어요", "뜨거운 아메리카노" },
									{ "시원하고 부드러운 커피가 먹고싶어요!", "차가운 라떼" }, 
									{ "따듯하고 부드러운 커피가 먹고싶어요!", "뜨거운 라떼" },
									{ "시원하고 달달한 커피가 아닌 음료가 먹고싶어요!", "차가운 초코우유" }, 
									{ "따듯하고 달달안 커피가 아닌 음료가 먹고싶어요!", "뜨거운 초코우유" },
									{ "시원차고 향기나는 차가 마시고 싶어요!", "차가운 캐모마일" }, 
									{ "따듯하고 향기나는 차가 마시고 싶어요!", "뜨거운 캐모마일" } };

//	음료 완성시 출력될 손님 메세지 배열
	private String msg[] = { "너무 좋아요", "조금 더 고민해줘요!", "아까워요!", "장난해요?" };
	
//	출력될 메세지
	private String msgP;

	//	가격표
	private int price[] = { 4500, 4000, 5500, 5000, 5500, 5000, 4500, 4000 };

//	내가 번 돈
	private int money;
	
// 랜덤으로 주문할 주문번호
	private int num;
	
//	내가 선택한 정답
	private int choiceNum ;
	
//	내가 선택한 첫번째 메뉴
	private int choiceRecipe1;
	
//	내가 선택한 두번째 메뉴
	private int choiceRecipe2;
	
//	랜덤 값
	private int ranNum = (int) (Math.random() * menu.length);
	
//	랜덤으로 출력될 선택지 배열
	private String[] choiceMenu = new String[4];
	
// 	랜던값을 담을 배열
	private int[] ranNums = new int[choiceMenu.length];
	
//	출력될 레시피 종류
	private String[] choiceRecipeMenu1 = {"얼음물","뜨거운물","차가운 우유","뜨거운 우유"};
	private String[] choiceRecipeMenu2 = {"샷","초코시럽","캐모마일"};
	
public String[][] getMenu() {
		return menu;
	}



	public void setMenu(String[][] menu) {
		this.menu = menu;
	}



	public String[][] getOrderMsg() {
		return orderMsg;
	}



	public void setOrderMsg(String[][] orderMsg) {
		this.orderMsg = orderMsg;
	}



	public String[] getMsg() {
		return msg;
	}



	public void setMsg(String[] msg) {
		this.msg = msg;
	}

	public String getMsgP() {
		return msgP;
	}



	public void setMsgP(String msgP) {
		this.msgP = msgP;
	}


	public int[] getPrice() {
		return price;
	}



	public void setPrice(int[] price) {
		this.price = price;
	}



	public int getMoney() {
		return money;
	}



	public void setMoney(int money) {
		this.money = money;
	}



	public int getNum() {
		return num;
	}



	public void setNum(int num) {
		this.num = num;
	}



	public int getChoiceNum() {
		return choiceNum;
	}



	public void setChoiceNum(int choiceNum) {
		this.choiceNum = choiceNum;
	}



	public int getChoiceRecipe1() {
		return choiceRecipe1;
	}



	public void setChoiceRecipe1(int choiceRecipe1) {
		this.choiceRecipe1 = choiceRecipe1;
	}



	public int getChoiceRecipe2() {
		return choiceRecipe2;
	}



	public void setChoiceRecipe2(int choiceRecipe2) {
		this.choiceRecipe2 = choiceRecipe2;
	}



	public int getRanNum() {
		return ranNum;
	}



	public void setRanNum(int ranNum) {
		this.ranNum = ranNum;
	}



	public String[] getChoiceMenu() {
		return choiceMenu;
	}



	public void setChoiceMenu(String[] choiceMenu) {
		this.choiceMenu = choiceMenu;
	}



	public int[] getRanNums() {
		return ranNums;
	}



	public void setRanNums(int[] ranNums) {
		this.ranNums = ranNums;
	}



	public String[] getChoiceRecipeMenu1() {
		return choiceRecipeMenu1;
	}



	public void setChoiceRecipeMenu1(String[] choiceRecipeMenu1) {
		this.choiceRecipeMenu1 = choiceRecipeMenu1;
	}



	public String[] getChoiceRecipeMenu2() {
		return choiceRecipeMenu2;
	}



	public void setChoiceRecipeMenu2(String[] choiceRecipeMenu2) {
		this.choiceRecipeMenu2 = choiceRecipeMenu2;
	}



	// 	랜덤으로 주문 출력
	public String order() {
		num = (int) (Math.random() * this.orderMsg.length);
		String menu = this.orderMsg[num][0];
		return menu;
	}


// 선택지 출력
	public int choiceMenu(int a) {
		
		switch (a) {
		case 1 : System.out.println("음료를 선택해 주세요!");
				 {for(int i = 0 ; i < this.orderMsg.length;i++) {
					System.out.println((i+1) + ". " + this.orderMsg[i][1]);}
			break;}
		case 2 : {System.out.println("종료되었습니다");
			break;}
		}
		return choiceNum;
			
	}
	

	/*---------------------------------메뉴 선택--------------------------------------- */		
	public void choiceRecipe1(int x) {

		for (int i = 0; i < this.choiceRecipeMenu1.length; i++) {
			System.out.println((i + 1) + ". " + this.choiceRecipeMenu1[i]);
		}System.out.println(Arrays.toString(this.choiceRecipeMenu1));
	}
	public void choiceRecipe2(int x) {

		for (int i = 0; i < this.choiceRecipeMenu2.length; i++) {
			System.out.println((i + 1) + ". " + this.choiceRecipeMenu2[i]);
		}System.out.println(Arrays.toString(this.choiceRecipeMenu2));
	}
	
	/*---------------------------------점수계산--------------------------------------- */	
	public String check(int choiceNum, int choiceRecipe1,int choiceRecipe2) {
		int[] result = new int[3];
		int[] checkResult = new int[result.length];
		int lastResult = 0;
	
//		메뉴가 맞는지 비교
		if((choiceNum) == num){result[0] = 1;}
//		첫번째 재료가 맞는지 비교
		if(menu[num][1].equals(choiceRecipeMenu1[(choiceRecipe1)])){result[1] = 1;}
//		두번째 재료가 맞는지 비교
		if(menu[num][2].equals(choiceRecipeMenu2[(choiceRecipe2)])){result[2] = 1;}
//		맞으면 1 , 틀리면 0 을 배열에 넣고 점수를 냄
		for(int i = 0 ; i < result.length ; i++) {
			if(result[i] == 1) {lastResult++;}
		}
		
		switch (lastResult) {
//	음료도 틀리고 제조법도 틀린경우
		case 0: { this.msgP = this.msg[3];}
			break;
//	음료만 맞았을 경우
		case 1: { this.msgP = this.msg[1]; money += (price[num] - 3000 ); }
			break;
//	음료는 틀렸지만 제조법은 맞는경우
		case 2: { this.msgP = this.msg[2]; money += (price[num] - 2000 ); }
			break;
//		둘다 맞은 경우
		case 3: { this.msgP = this.msg[0]; money += price[num];}
		};
		
		return Integer.toString(this.money);

	}
	
	/*---------------------------------계속하기/그만하기--------------------------------------- */	
	public void  continue1(int a) {
		
		switch (a) {
		case 1 : order();
			break;
		case 2 : System.out.println("종료되었습니다.");
				 System.out.println("내가 번 돈은 " + money + "원 이예요:D");
				 break; }
		
		}


}




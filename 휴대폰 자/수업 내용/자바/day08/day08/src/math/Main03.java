package math;

public class Main03 {

	public static void main(String[] args) {
		// 5자리 인증번호를 생성하는 
		// 05597 / 13557
		// 내가 한거
//		Helper num = Helper.getInstance();
//		
//		for(int i= 0; i < 5 ; i++) {
//			int a = num.random(0, 9);
//			System.out.print(a);
//		}
//		
		// 강사님
		String authNum = "";
		
		for(int i=0; i<5; i++) {
			authNum += Helper.getInstance().random(0, 9);
		}

		System.out.println("인증번호 : " + authNum);
	}

}

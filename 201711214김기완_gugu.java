package Report01;

import java.util.Scanner;

public class Kimgiwan201711214_gugu {
	public static void main(String[] args) {
		while(true) {
		Scanner scan = new Scanner(System.in);
		System.out.println("원하는 단을 입력하세요 : ");
		
		int dan = scan.nextInt();
		
		System.out.println(dan + "단 실행");
		
		if (dan > 1) {
			for (int i = 1; i<10; i++)
				System.out.println(dan + "*" + i + "=" + dan * i + " ");
		}else{
			System.out.println("입력 에러!!");
			System.exit(0);
			}
		}
	}
}
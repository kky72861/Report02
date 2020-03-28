package Report01;

import java.util.Scanner;

public class kimgiwan201711214_leap_rep {
	public static void main(String[] args) {
	while(true) {
		System.out.println("연도를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println(year + "년은 윤년");
		} else if(year > 0){
			System.out.println(year + "년은 평년");
		} else {
			System.exit(0);
		}
	}
  }
}

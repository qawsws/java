package chapter6;

public class Ex02_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				// # 문제 1
				// # 점수가 90점 이상이면 A
				// # 점수가 80점 이상이면 B
				// # 점수가 70점 이상이면 C
				// # 점수가 60점 이상이면 D
				// # 점수가 60점 미만이라면 F
				// #를 출력하는 코드를 만들어보세요.
				int score = 90;
				if(score >= 90) {
					System.out.println("A");
				}else if(score >= 80) {
					System.out.println("B");
				}else if(score >= 70) {
					System.out.println("C");
				}else if(score >= 60) {
					System.out.println("D");
				}else {
					System.out.println("F");
				}
				// #문제 2
				// # 숫자가 짝수인지 홀수인지 구하는 if문을 작성하라
				// 숫자 = 11
				int number = 11;
				if(number % 2 == 0) {
					System.out.println("짝수");
				}else {
					System.out.println("홀수");
				}
				// #문제3
				// #숫자의값에 20을 더한 값을 출력하라. 단 숫자와 20더한 계산값이
				// # 255를 초과하는 경우 255를 출력한다. 0보다 작은 값일 경우 0을 출력한다.
				// 숫자 = -30
				 int number1 = -30;
			        int result = number1 + 20;

			        if (result > 255) {
			        	System.out.println("255");
			        } else if (result < 0) {
			        	System.out.println("0");
			        }

			       
			    }
			

		}

package chapter16;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex01_ExceptionCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 에러 Error : 예외가 아닌 심각한 문제, 코드로는 해결 불가능, 하드웨어나 자바의 설정 문제가 있을때 
// 컴파일 에러 : 컴파일할때 일어나는 문제, 이클립스(IDE)에서 알려주는 에러
//		in a = 0; 빨간색줄로 알려주는 에러들
//	런타임 에러 : 실행도중 발생하는 에러, 값을 잘못 설정하거나 0으로 나눈다거나 하는 에러
//	런타임 에러의 종류 : 시스템 에러, 예외
//		시스템 에러 : 메모리 부족, 운영체제에서 에러가 발생
//		예외(Exception) : 값을 잘못  설치하거나 0으로 나눈다거나 하는 에러
//		예외 처리 : try catch문을 이용하여 예외가 발생하더라도 프로그램이 꺼지지 않고 계속 진행되도록 코드를 잓성 
		Scanner sc = new Scanner(System.in);
//		try : 예외가 발생할 가능성이 있는 코드를 작성
		try {
		int num1 = sc.nextInt();	// 문자열을 입력하면 예외 발생
		int num2 = 10/num1; //num1에 0을 입력하면 예외 발생
		System.out.println(num2);
		System.out.println("try 부분 : 예외가 발생하면 실행되지 않음");
//		catch(예외클래스 예외의 데이터가 저장될 변수 이름)
//		예외의 내용에 맞게 각각 처리할 내용을 다르게 작성할 수 있음
		}catch(InputMismatchException e) {
			System.out.println("숫자만 입력해주세여.");
			
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
			
		
		}catch(Exception e) {
//			catch : 예외가 발생하면 실행할 코드 작성
			System.out.println("예외가 발생했습니다.");
		}finally {
//			정상실행이던 예외가 일어나던 상관없이 무조건 실행되는 코드를 작성
			System.out.println("finally 부분 : 무조건 실행되는 코드");
		}
//		예외처리시 프로그램이 계속 실행됨
		System.out.println("프로그램이 정상적으로 종료했습니다.");
//		MyBook book1 = new MyBook(); 컴파일 에러
		
	}

}

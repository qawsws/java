package chapter21;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class p3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		int sum =0;
		int count = 0;
		while(true) {
			System.out.println("강수량 입력(0 입력시 종료)>>");
			Integer rain = sc.nextInt();
			list.add(rain);
			if(rain==0) {
				break;
			}
			System.out.println(list);
			
			
			sum+= rain;
			count++;
			Integer result = sum /count;
			System.out.println("현재 평균 :"+ result);
			
		}
		
	}

}


//package practice2;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class Q3 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
////		3. ArrayList 컬렉션을 이용하여 강수량의 평균을 유지 관리하는 프로그램을 작성하라. 강수량을 입력
////		하면 List에 추가하고 현재 입력된 모든 강수량의 평균을 출력하라.
//		Scanner sc = new Scanner(System.in);
//		List<Integer> list = new ArrayList<>();
//		int sum = 0;
//		while(true) {
//			System.out.print("강수량 입력(0 입력시 종료)>>");
//			int num = sc.nextInt();
//			if(num==0) {
//				System.out.println("End");
//				break;
//			}
//			list.add(num);
//			sum += num;
//			System.out.println(list);
//			System.out.println("현재 평균 : "+(sum/list.size()));
//		}
////		---------------------------------------------- 
////		강수량 입력(0 입력시 종료)>>5 
////		5 
////		현재 평균 : 5 
////		강수량 입력(0 입력시 종료)>>80 
////		5 80 
////		현재 평균 : 42 
////		강수량 입력(0 입력시 종료)>>53 
////		5 80 53 
////		현재 평균 46 
////		강수량 입력(0 입력시 종료)>>22 
////		5 80 53 22 
////		현재 평균 40 
////		강수량 입력(0 입력시 종료)>>0 
////		End 
////		----------------------------------------------
//	}
//
//}

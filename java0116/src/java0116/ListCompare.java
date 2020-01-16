package java0116;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListCompare {

	public static void main(String[] args) {
		//10 과 30을 갖는 ArrayList 생성
		ArrayList<Integer> al = new ArrayList<>();
		
		//데이터 삽입
		al.add(10);
		al.add(30);
		//현재 시간 저장
		long start = System.currentTimeMillis();
		
		//20이라는 데이터를 10만번 2번째 칸에 삽입
		for(int i=0; i<100000; i=i+1) {
			al.add(1, 20);
		}
		
		//현재 시간 저장
		long end = System.currentTimeMillis();
		System.out.println("al:" + (end-start));
		
		//LinkedList 생성
		LinkedList<Integer> li = new LinkedList<>();
		li.add(10);
		li.add(30);
		
		//현재 시간 저장
		start = System.currentTimeMillis();
				
		//20이라는 데이터를 10만번 2번째 칸에 삽입
		for(int i=0; i<100000; i=i+1) {
			li.add(1, 20);
		}
				
		//현재 시간 저장
		end = System.currentTimeMillis();
		System.out.println("li:" + (end-start));
		
		//현재 시간 저장
		start = System.currentTimeMillis();
						
		//모든 데이터 읽어서 출력
		for(int i=0; i<li.size(); i=i+1) {
			System.out.println(li.get(i));
		}
						
		//현재 시간 저장
		end = System.currentTimeMillis();
		System.out.println("li:" + (end-start));
		
	}
}









package 비선형구조;

import java.util.HashMap;

public class HashMap테스트 {

	public static void main(String[] args) {
		String[] s = {"leo", "kiki", "eden", "leo"};
		String[] c = {"kiki", "eden"};
		
		//1. 참여자 목록을 만든다. 
		HashMap<String, Integer> list = new HashMap<>();
		for (int i = 0; i < s.length; i++) {
			list.put(s[i], list.getOrDefault(s[i], 0) + 1);
		}
		System.out.println(list);
		
		//2. 완주한 선수한 선수를 체크한다.
		for (int i = 0; i < c.length; i++) {
			list.put(c[i], list.get(c[i]) - 1);
		}
		System.out.println(list);
		
		//3. 완주하지 못한 선수를 답안으로 작성한다.
		String answer = "";
		for (int i = 0; i < s.length; i++) {
			if(list.get(s[i])==0) {
				answer = s[i];
				break;
			}
		}
		

	}

}
package day05;

import java.util.Arrays;

public class StringManipulation {

	public static void main(String[] args) {

		//문자열 다루기
		//		char[] arr = {'a', 'b', 'c'};
		//		String str = new String(arr);
		//		System.out.println(str);

		String str = "abc";

		//문자열을 다룰 수 있는 여러가지 함수를 제공해준다. 함수는 미리 만들어져 있는 기능
		//str에 .을 찍어서 사용함

		//문자열 한글자 자르기
		//		str.charAt(0); //소괄호 안에 인덱스 번호 해당 인덱스번호의 문자만 추출
		//		System.out.println(str.charAt(0));

		char c = str.charAt(2); // 문자열 하나 자르는 것이므로 char형 가능
		System.out.println(c);

		//문자열 길이 확인
		int len = str.length(); //길이를 반환하기에 int형 가능
		System.out.println("문자열의 길이:" + len);

		//문자열의 위치 찾기 indexOf(찾을 문자열)
		str = "안녕하세요? 문자열은 문자의 합 입니다"; //공백도 포함해서 문자의합은 12번째부터 시작된다

		int a = str.indexOf("문자의 합");
		System.out.println("'문자의 합'이 발견된 위치:" + a);

		int b = str.indexOf("adjaldja;lsdjalksd");
		System.out.println("찾을문자가 존재하지 않으면:" + b); // -1을 출력한다

		//문자열 변경하기 : replace(타겟문자열, 바꿀문자열) 스트링타입 저장가능
		String result = str.replace("문자", "word");
		System.out.println(result); //발견되는 모든 문자열을 바꿈
		System.out.println(str); // 원본에는 영향을 미치지 않는다

		//		str = str.replace("문자", "word"); //문자를 word로 바꿔서 원본에 저장한다.
		//모든 공백 제거
		str = str.replace(" ", ""); //공백을 전부 제거
		System.out.println(str);

		System.out.println("-------------------------------------------------------");

		//대소문자 변경
		str = "Hello World~!";

		String r2 = str.toUpperCase(); //전부 싹다 대문자로 변경
		String r3 = str.toLowerCase(); //전부 싹다 소문자로 변경
		

		System.out.println(r2);
		System.out.println(r3);

		//앞뒤 공백만 제거 trim()
		//replace(" ","")은 모든 공백을제거
		str = "          010-1234-5678             ";
		String r4 = str.trim(); //
		System.out.println(r4);

		//문자열 자르기(중요)
		//substring
		//split
		//toCharArray

		str = "010-1234-5678";
		String r5 = str.substring(3); // 세번째 인덱스 미만 제거 숫자 조절하면서 조율
		System.out.println(r5);
		System.out.println(str); // 원본 문자열에는 영향을 미치지 않는다

		String r6 = str.substring(4, 8); // 인덱스 4이상 인데스 8미만 추출
		System.out.println(r6);

		String[] arr = str.split("-"); // 구분자로 잘라서 String[] 반환
		System.out.println(Arrays.toString(arr)); // 하이픈을 제거해서 배열에 저장

		char[] arr2 = str.toCharArray(); //한글자씩 잘라서 char[] 반환
		System.out.println(Arrays.toString(arr2));

		//합치기 String.join(구분자, 배열or 문자열나열) 맨앞의 것을 문자열 사이에 전부 넣는다
		String r7 = String.join("!!", "링딩동", "링딩동", "링딩기리리리리", "딩딩딩");
		System.out.println(r7);

		// "서울 > 대구 > 대전 > 부산 > 찍고"
		String[] arr3 = {"서울", "대전", "대구", "부산", "찍고"};
		System.out.println(String.join(" > ", arr3));
		
		String sum = "";
		for(int i = 0; i < arr3.length; i++) {
			sum += arr3[i];
			if(i == arr3.length - 1) break;
			sum += " > ";
		}
		
		System.out.println(sum);
		
		
		
	}


}

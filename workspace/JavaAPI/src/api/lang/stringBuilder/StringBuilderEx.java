package api.lang.stringBuilder;

public class StringBuilderEx {
	
	public static void main(String[] args) {
		
		//빠른문자열
		String str = new String("java");
		StringBuilder sb = new StringBuilder("java");
		
		System.out.println(str);
		System.out.println(sb);
		
		//차이점
		str = str + " progrmming"; //완전 새로운 문자열을 만들어서 저장한다
		System.out.println(str);
		
		sb.append(" progrmming"); //하나의 객체를 계속 재사용한다
		System.out.println(sb);
		
		//문자열 중간에 추가 insert
		sb.insert(5, "book ");
		System.out.println(sb); //객체 재사용
		
		//문자열의 변경 replace
		sb.replace(5, 9, "책"); // 인덱스 5이상 9미만을 "책"으로 변경
		System.out.println(sb);
		
		//문자열 삭제 delete
		sb.delete(5, 7); //인덱스 5이상 7미만 삭제
		System.out.println(sb);
		
		//빠른 문자열을 문자열로 변환(스트링빌드 타입을 일반 스트링으로 변환)
		
		String result = sb.toString();
		System.out.println("문자열:" + result);
		
		//거꾸로 뒤집기
		System.out.println(sb.reverse());
		
		
		
		
	}

}

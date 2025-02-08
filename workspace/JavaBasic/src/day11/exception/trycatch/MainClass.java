package day11.exception.trycatch;

public class MainClass {
	
	public static void main(String[] args) {
		
//		//실행예외
//		int[] arr = {1,2,3};
//		System.out.println(arr[3]);
		
//		String s = "10ㄴㅇㅁㅇㅁ";
//		int r = Integer.parseInt(s);  //숫자 문자열을 숫자로 바꿔주는 기능
//		
		 
		//NullPointException
		String str =null;
		str.charAt(0);
		
		System.out.println("실행되냐!!!");
		
	}

}

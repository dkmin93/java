package quiz04;

/*
 * 1.접근제어자를 통해 외부에서 객체를 생성할 수 없도록 만들기
 * 2.메서드에는 public static을 붙여서 메인에서 호출
 */

private ToArray {
	
}

public class ToArray {
	

							//    0 1 2
	public static void toArray(int[] arr) { // {1,2,3}
		System.out.print("[");
		for(int i = 0; i < arr.length; i++) {
			if(i != arr.length -1) {
				System.out.print(arr[i] + ", ");
			} else if (i == arr.length -1) {
				System.out.print(arr[i]);
			}
		}
		System.out.println("]");
	}
	
	public static void toArray(char[] arr) { // {1,2,3}
		System.out.print("[");
		for(int i = 0; i < arr.length; i++) {
			if(i != arr.length -1) {
				System.out.print(arr[i] + ", ");
			} else if (i == arr.length -1) {
				System.out.print(arr[i]);
			}
		}
		System.out.println("]");
	}
	
	public static void toArray(String[] arr) { // {1,2,3}
		System.out.print("[");
		for(int i = 0; i < arr.length; i++) {
			if(i != arr.length -1) {
				System.out.print(arr[i] + ", ");
			} else if (i == arr.length -1) {
				System.out.print(arr[i]);
			}
		}
		System.out.println("]");
	}
	

}

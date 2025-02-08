package quiz04sol;

public class ArrayPrint {

	String toArray(int[] arr) {

		if(arr == null) {
			return "null";
		}
		if(arr.length <= 0) {
			return "[]";
		}
		
		String str = "[";
		for(int i = 0; i < arr.length; i++) {
			str += arr[i];
			if(i == arr.length - 1) {
				str += "]";
				return str;
			}
			str += ", ";
		}
		
		return str;
	}
	
	String toArray(char[] arr) {

		if(arr == null) {
			return "null";
		}
		if(arr.length <= 0) {
			return "[]";
		}
		
		String str = "[";
		for(int i = 0; i < arr.length; i++) {
			str += arr[i];
			if(i == arr.length - 1) {
				str += "]";
				return str;
			}
			str += ", ";
		}
		
		return str;
	}
	
	String toArray(String[] arr) {

		if(arr == null) {
			return "null";
		}
		if(arr.length <= 0) {
			return "[]";
		}
		
		String str = "[";
		for(int i = 0; i < arr.length; i++) {
			str += arr[i];
			if(i == arr.length - 1) {
				str += "]";
				return str;
			}
			str += ", ";
		}
		
		return str;
	}


}

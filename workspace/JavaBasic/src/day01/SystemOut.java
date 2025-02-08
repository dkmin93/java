package day01;

public class SystemOut {
	public static void main(String[] args) {
		//main을 쓰고 ctrl + space 누르면 빠르게 메인 실행 함수 자동생성
		System.out.println("곧 쉬는 시간이네");
		System.out.println("아 나는 집에 가야겠다. 나만 간다");
		//sysout를 쓰고 ctrl + space 누르면 마찬가지로 빠르게 출력문 생성 가능
		//1. println()- 개행(\n)을 마지막에 포함
		//2. print() - 개행 미포함
		System.out.print("줄바꿈 없다~\n");
		System.out.print("줄바꿈\t 없다~\n");
		
		//3. printf() - 형식 지정 출력문
		/*
		 * 서식문자
		 * \n - 줄바꿈
		 * \t - 탭버튼 정렬
		 * %d - 정수를 받음
		 * %s - 문자를 받음
		 * %f - 실수를 받음 소수 6번째까지 표기
		 */
		System.out.printf("맨 처음에 하고싶은 말을 적습니다. %s은 %d월 %d일 입니다", "오늘", 12, 30);
		System.out.printf("\n원주율은 %f입니다", 3.14);
		System.out.printf("\n원주율은 %.2f입니다", 3.14); //%.2f 소수 둘째까지 표기한다는 뜻
		
		//이 구문에서 숫자를 전부 %d로 표현해 보세요.
		
		System.out.printf("\n%dx%d=%d %dx%d=%d", 2, 1, 2, 2, 2, 4);
		
		/*
		 * 한줄 주석 - ctrl + /
		 * 코드 이동 - alt + 방향키
		 * shift + 방향키
		 * shift + home 행에서 커서 기준 앞부분을 잡아준다
		 * shift + end  행에서 커서 기준 뒷부분을 잡아준다
		 * 전체정렬 - ctrl + a , ctrl + i
		 * 행복사 - ctrl + alt + 방향
		 * 
		 * 프로젝트 export : general탭 archive file선택 체크확인 후 저장 경로 설정 후 추출
		 * 프로젝트 import : general탭 existing projects into workspace 선택 
		 * 윗 옵션은 최상위 폴더, 아랫 옵션은 알집 파일로부터 import
		 */
		
	}
	
	
	
	
}

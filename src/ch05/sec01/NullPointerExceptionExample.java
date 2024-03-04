package ch05.sec01;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
		int [] arr = null;
		String str = null;
		//arr[0] = 10; //NullPointException
		//System.out.println(str.length()); //NullPointException발생, str만 찍어보면 에러없이 null로 나오기는 함
		String hobby = "운동";
		hobby = "독서";
		System.out.println(hobby);
		
		//String클래스는 변경불가능한(immutable)클래스 --> 값을 바꿀 경우에 기존 번지가 아닌 새로운 번지를 갖는다.
		
		String a = "독서"; // a와 b는 동일한 리터럴로 같은 번지를 갖기 때문에 == 비교시 true
		String b = "독서";
		String c = b; //c도 b로 초기화해줬기 때문에 같은 번지를 갖음
		System.out.println(a == b); //true
		System.out.println(c == b); //true
		b = "영화"; //b의 값을 바꿔주면서 Heap 영역에 있는 객체와 번지수가 변경됨
		System.out.println(c == b); // false
	}

}

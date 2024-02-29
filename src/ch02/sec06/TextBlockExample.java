package ch02.sec06;

public class TextBlockExample {

	public static void main(String[] args) {
		/*
		{
			"id" : "winter",
			"name" "눈송이"
		}
		*/
		
		String str1 = "{\n\t\"id\": \"winter\",\n\t\"name\" : \"눈송이\"\n}";
		System.out.println(str1);
		String str2 = """
				{
					"id" : "winter",
					"name" : "눈송이"
				}
				""";  //"""안에는 이스케이프 문자를 사용할 필요가 없다. """
		System.out.println(str2);
	}

}

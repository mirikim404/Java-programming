package week5;

public class Book {

	String title;
	String author;
	
	public Book() {} //기본생성자
	
	public Book(String t) { // 제목으로 초기화하는 생성자
		this.title = t;
		this.author = "작자미상";
	}
	
	public Book(String t, String a) { // 제목과 저자이름으로 초기화하는 생성자
		this.title = t;
		author = a;
	}
	

}

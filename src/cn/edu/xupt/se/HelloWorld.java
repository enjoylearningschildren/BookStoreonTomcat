package cn.edu.xupt.se;

public class HelloWorld {
	public static void main(String[]args){
		System.out.println("hello");
		System.out.println("water");
		Book book1 = new Book();
		Book book2 = new Book("tomcat","tim");
		Book book3 = new Book("apache","steven");	
		Book book4 = new Book("distributed computing","stevenfather");	
	}

}
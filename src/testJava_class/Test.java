package testJava_class;
//public class A{public class B{public static final String _str;}} 非静态内部类可以定义静态常量属性
//public class A{public static class B{public static void method(){}}} 静态内部类可以定义静态方法
//public class A{public static class B{public  void method(){}}} 静态内部类可以定义非静态方法
//public class A{public static class B{public static String _str;}} 静态内部类可以定义静态属性
//public class A{public static class B{public class C(){}}} 静态内部类可以定义非静态内部类
//public class A{public static class B{public static class C(){}}} 静态内部类可以定义静态 内部类

//下面是错误的
//public class A{public class B{public static String _str;}} 非静态内部类不能定义静态属性
//public class A{public class B{public static void method(){}}} 非静态内部类不能定义静态方法
//public class A{public class B{public static class C{}}} 非静态内部类不能定义静态内部类

//java类属性和对象属性的初始化顺序如下：
//类属性（静态变量）定义时的初始化，如范例中的static String a="string-a"
// static 块中的初始化代码，如：static{}中的b="stirng-b"
//对象属性（非静态变量）定义时的初始化，如：String c="string-c"
// 构造方法（函数）中的初始化代码，如：d="string-d"
public class Test {

	static String a="sting-a";
	static String b;
	
	String c="string-c";
	String d;
	
	static{
		printStatic("before static");
		b="string-b";
		printStatic("after static");
	}
	public static void printStatic(String title){
		System.out.println("-------"+title+"--------");
		System.out.println("a=\""+a+"\"");
		System.out.println("b=\""+b+"\"");
	}
	
	public Test(){
		print("before constructor");
		d="string-d";
		print("after constructor");
	}
	
	public void print(String title){
		System.out.println("-------"+title+"--------");
		System.out.println("a=\""+a+"\"");
		System.out.println("b=\""+b+"\"");
		System.out.println("c=\""+c+"\"");
		System.out.println("d=\""+d+"\"");
	}
	
	public static void main(String[] args){
		new Test();	
		}
	
	
	
	
	
	
	
	
	
}

package testJava_class;
//public class A{public class B{public static final String _str;}} �Ǿ�̬�ڲ�����Զ��徲̬��������
//public class A{public static class B{public static void method(){}}} ��̬�ڲ�����Զ��徲̬����
//public class A{public static class B{public  void method(){}}} ��̬�ڲ�����Զ���Ǿ�̬����
//public class A{public static class B{public static String _str;}} ��̬�ڲ�����Զ��徲̬����
//public class A{public static class B{public class C(){}}} ��̬�ڲ�����Զ���Ǿ�̬�ڲ���
//public class A{public static class B{public static class C(){}}} ��̬�ڲ�����Զ��徲̬ �ڲ���

//�����Ǵ����
//public class A{public class B{public static String _str;}} �Ǿ�̬�ڲ��಻�ܶ��徲̬����
//public class A{public class B{public static void method(){}}} �Ǿ�̬�ڲ��಻�ܶ��徲̬����
//public class A{public class B{public static class C{}}} �Ǿ�̬�ڲ��಻�ܶ��徲̬�ڲ���

//java�����ԺͶ������Եĳ�ʼ��˳�����£�
//�����ԣ���̬����������ʱ�ĳ�ʼ�����緶���е�static String a="string-a"
// static ���еĳ�ʼ�����룬�磺static{}�е�b="stirng-b"
//�������ԣ��Ǿ�̬����������ʱ�ĳ�ʼ�����磺String c="string-c"
// ���췽�����������еĳ�ʼ�����룬�磺d="string-d"
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

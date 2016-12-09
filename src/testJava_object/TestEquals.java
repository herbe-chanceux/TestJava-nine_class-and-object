package testJava_object;

public class TestEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//==是比较两个对象的内存地址值是否相等
		//equal()方法是用于比较两个对象的内容是否一致
		String str1=new String("java");
		String str2=new String("java");
		String str3=str2;
		if(str1==str2)
			System.out.println("str1==str2");
		else
			System.out.println("str1!=str2");
		if(str2==str3)
			System.out.println("str2==str3");
		else
			System.out.println("str2!=str3");
	 
	}

}

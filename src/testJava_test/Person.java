package testJava_test;

public class Person {
	
	private String name;
	private int age;
	private String like;
	
	public void SetName(String str){
		name=str;
	}
	public void SetAge(int a){
		if(a>0){
			age=a;
		}
	}
	public void SetLike(String li){
		like=li;
	}
	public String GetName(){
		return name;
	}
	public int GetAge(){
		return age;
	}
	public String GetLike(){
		return like;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p=new Person();
		p.SetName("张三");
		p.SetAge(25);
		p.SetLike("眼睛很大");
		System.out.println("我是："+p.GetName()+",今年："+p.GetAge()+",我的"+p.GetLike()+"!");
	}

}

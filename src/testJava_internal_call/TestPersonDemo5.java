package testJava_internal_call;

class Person{
	private String name;
	private int age;
	private void talk(){
		System.out.println("我是："+name+",今年："+age+"岁！");
	}
	public void say(){
		this.talk();
	}
	public void setName(String str){
		name=str;
	}
	public void setAge(int a){
		if(a>0){
			age=a;
		}
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
}

public class TestPersonDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p=new Person();
		p.setName("张三");
		p.setAge(25);
		p.say();
	}

}

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
		p.SetName("����");
		p.SetAge(25);
		p.SetLike("�۾��ܴ�");
		System.out.println("���ǣ�"+p.GetName()+",���꣺"+p.GetAge()+",�ҵ�"+p.GetLike()+"!");
	}

}

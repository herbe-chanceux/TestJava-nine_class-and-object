package testJava_object;

  
public class TestObjectArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p[]={
				new Person("����",25),new Person("����",30),new Person("����",35)
		};
				for(int i=0;i<p.length;i++){
					System.out.println(p[i].talk());
				}
	}

}

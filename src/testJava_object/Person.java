package testJava_object;

public class Person {
	 
		String name;
		int age;
		public Person(){
			
		}
		public Person(String name,int age){
			this.name=name;
			this.age=age;
		}
		public String talk(){
			return "���ǣ�"+this.name+",���꣺"+this.age+"�꣡";
		}
	}


package testJava_Overload;

 class Person {

	 private String name;
	 private int age;
	 public Person(String n,int a){
		 name=n;
		 age=a;
		 System.out.println("public Person(String n,int a)");
	 }
	 public String talk(){
		 return"����:"+name+"���꣺"+age+"��";
	 }
	
}

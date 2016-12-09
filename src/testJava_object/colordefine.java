package testJava_object;

public class colordefine {
 
		String color="black";
		void getMes(){
			System.out.println("定义类");
		}
		public static void main(String args[]) {
			// TODO Auto-generated method stub

			 colordefine b=new colordefine();//对象的声明：类名 对象名=new 类名();
			System.out.println(b.color);
			b.getMes();
		 
		}
	}
	
 
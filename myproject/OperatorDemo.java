package myproject;


class newOne
{
	String myname;
	int cnt ;
	
	public void paragraph(){
		System.out.println("I am "+ myname + " and I have a bike which is obviously a " + cnt +" wheeler");
	}
}


public class OperatorDemo {
	public static void main(String[] args) {
		
		newOne obj = new newOne();
		obj.myname = "Srimanth";
		obj.cnt = 2;
		obj.paragraph();
		
	}
}
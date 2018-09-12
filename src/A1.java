//import java.lang.*;
class Animal{
	public void run(int a)
	{
		System.out.println(a);
	}
	public void run(int a,int b)
	{
		System.out.println(a+b);
	}
	public void run(int a,int b,int c)
	{
	System.out.println(a+b+c);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a=new Animal();
		a.run(10,20,30);

	}

}

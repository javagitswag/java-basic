package practices;

public class ObjectCreation 
{
	int a=10,b=20,result;
	public void add()
	{
		result=a+b;
		System.out.println("add of a & b :"+result);
	}
	public void sub()
	{
		result=a-b;
		System.out.println("sub of a & b :"+ result);
	}
	public static void main(String[] args)
	{
		System.out.println("hello");
		
		
		ObjectCreation obj=new ObjectCreation();
		obj.add();
		obj.sub();
	
	}


}

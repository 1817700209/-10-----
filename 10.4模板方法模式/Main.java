package day07_demo04;

public class Main
{
	public static void main(String[] args)
	{
		AbstractClass c;

		c = new ConcreteClassA();
		c.templateMethod();

		c = new ConcreteClassB();
		c.templateMethod();
	}
}

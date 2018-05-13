package com;

class  MyClass
{
	private String name;
	
	public MyClass(String name)
	{
		this.name = name;
	}
	void verify()
	{
		System.out.println("verify");
	}
}

public class Test
{
	public static void process(MyClass obj)
	{
		obj.verify();
	}
	public static void main(String[] args)
	{
		//参数类型是MyClass，这里创建了一个匿名类
		//该类是MyClass的子类，并创建了该类的实例
		process(new MyClass("Tom")
		{
			public void verify()
			{
				//执行代码，会输出object verify
				System.out.println("object verify");
			}
		});
	}
}


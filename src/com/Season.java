package com;

import java.util.Scanner;

public class Season
{
	public static void main(String[] args)
	{
		System.out.println("输入一个月份：");
		Scanner scanner=new Scanner(System.in);
		int month=scanner.nextInt();
		
		switch (month)
		{
			case 3:
			case 4:
			case 5:
				System.out.println(month+"是春天");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println(month+"是夏天");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println(month+"是秋天");
				break;
			case 1:
			case 2:
			case 12:
				System.out.println("是冬天");
				break;
				
			default:
				System.out.println("sorry,没有这个月份");
				break;
		}
	}
}

package com.epam_task;
import java.util.Scanner;
class App
{
	Scanner sc=new Scanner(System.in);
	Object[] a=new Object[100000000];
	int[] ar=new int[1];
	int ind=0;
	App()
	{
		a[0]=11;a[1]=332;a[2]=223;a[3]=33;a[4]=34;a[5]=634;a[6]=4375;a[7]=74;a[8]=24;a[9]=657;
	}
	void add(Object o)
	{
		a[ind++]=o;
	}
	void remove(Object o)
	{
		for(int i=0;i<=ind;i++)
		{
			if (a[i]==o)
			{
				int j=i;
				while(j<ind)
				{
					a[j]=ar[j+1];
					j++;
				}
				ind--;
			}
			else
			{
				System.out.println("object not found");
			}
		}
	}
	void fetch(int m)
	{
		if (m<index)
		{
			System.out.println(a[m]);
		}
		else
		{
			int l=ar[99];
		}
	}
	void display()
	{
		if (ind>10)
		{
			for(int i=0;i<ind;i++)
			{
				System.out.print(a[i]);
			}
		}
		else
		{
			for(int i=0;i<10;i++)
			{
				System.out.print(a[i]+" ");
			}
		}
	}
	public static void main(String args[])
	{
		App k=new App();
		Scanner sc=new Scanner(System.in);
		int p=0;
		while (p==0)
		{
			System.out.println("1.add\n2.remove\n3.fetch\n4.display\nselect option");
			int j=sc.nextInt();
			switch(j)
			{
				case 1:
						System.out.println("enter element");
						k.add(sc.next());
						break;
				case 2:
						System.out.println("enter element");
						k.remove(sc.next());
						break;
				case 3:
						System.out.println("enter index");
						k.fetch(sc.nextInt());
						break;
				case 4:
						k.display();
						break;
				default:
						p++;
						break;
			}
		}
	}
}

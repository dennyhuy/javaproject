package PTBAC2;

import java.util.Scanner;

public class Input {
	int a;
	int b;
	int c;
	double d,e;
	double delta;
	public void Nhap() {
		System.out.println("-------------------AX2 + BX + C = 0---------------------");
		Scanner key = new Scanner(System.in);
		System.out.println("\n Nhap vao A: ");
		this.a=key.nextInt();
		System.out.println("\n Nhap vao B: ");
		this.b=key.nextInt();
		System.out.println("\n Nhap vao C: ");
		this.c=key.nextInt();
		key.close();
	}
	public double tinhdelta() {
		return delta = b*b - 4*a*c;
	}
	public double dieukien() {
		if (delta<0) {
			System.out.println("\n Phuong trinh vo nghiem");
		} 
		if(delta==0) {
			d= -(b/(2*a));
			System.out.println("\n Phuong trinh co nghiem kep x1=x2="+d);
		}
		if(delta>0) {
			d=(-b+Math.sqrt(delta))/(2*a);
			System.out.println("\n Phuong trinh co hai nghiem phan biet: "+d);
		}
		if(a+b+c==0) {
			d=1;
			e=-(b/(2*a));
			System.out.println("\n Phuong trinh co nghiem x1= "+d+"x2= "+e);
		}
		if(a-b+c==0) {
			d=-1;
			e=-(c/a);
			System.out.println("\n Phuong trinh co nghiem x1= "+d+"x2= "+e);
		}
		return 0;
	}
	public void ketqua() {
		System.out.println("\n Delta= "+this.tinhdelta());
	}
	}


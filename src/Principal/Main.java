package Principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		int a,b,c;
		double x1,x2,d;
		Scanner sc = new Scanner (System.in);
		System.out.print("Introduzca coeficientes:");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if (a==0)
			System.out.println("La ecuación NO es de 2º");
		else
		{
			d = b*b - 4*a*c;
			if (d < 0)
				System.out.println("La ecuación tiene soluciones complejas");
			else
			{
				x1 = (double)(-b+Math.sqrt(d))/(2*a);
				x2 = (double)(-b-Math.sqrt(d))/(2*a);
				System.out.println("La solución es "+x1+" y "+x2);
			}
		}
	}
}

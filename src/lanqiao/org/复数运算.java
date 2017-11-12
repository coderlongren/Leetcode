package lanqiao.org;

import java.util.Scanner;

public class ∏¥ ˝‘ÀÀ„ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char s;
        s=sc.next().charAt(0);
        double a,b,c,d;
        a= sc.nextDouble();
        b= sc.nextDouble();
        c= sc.nextDouble();
        d= sc.nextDouble();
        
        if (s == '+'){
        	System.out.printf("%.2f+%.2fi",a + c,b + d);
        }
        if (s == '-'){
        	System.out.printf("%.2f+%.2fi",a - c,b - d);
        }
        if (s == '*'){
        	System.out.printf("%.2f+%.2fi",(a*c - b*d),(a*d + b*c));
        }
        if (s == '/'){
        	System.out.printf("%.2f+%.2fi",(a*c+b*d)/(c*c+d*d),(b*c-a*d)/(c*c+d*d));
        }
        System.out.println();
        
	}

}

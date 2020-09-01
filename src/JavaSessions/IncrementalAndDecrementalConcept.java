package JavaSessions;

public class IncrementalAndDecrementalConcept {

	public static void main(String[] args) {

		
		//1. post increment:
		int m = 1;
		int n = m++;//post increment
		System.out.println(m);//2
		System.out.println(n);//1
		
		int p = -1;
		int q = p++;
		System.out.println(p);//0
		System.out.println(q);//-1
		
		//2. pre increment:
		int h = 1;
		int g = ++h;//pre increment
		System.out.println(h);//2
		System.out.println(g);//2
		
		int k = -10;
		int l = ++k;
		System.out.println(k);//-9
		System.out.println(l);//-9
		
		//3. post decrement:
		int a = 2;
		int b = a--; //post decrement
		System.out.println(a);//1
		System.out.println(b);//2
		
		int x = -100;
		int y = x--;
		System.out.println(x);//-101
		System.out.println(y);//-100
		
		
		//4. pre decrement (--):
		int e = -1;
		int d = --e; //pre decrement
		System.out.println(e);//-2
		System.out.println(d);//-2
		
		int u = -89;
		int t = --u;
		System.out.println(u+1);
		System.out.println(t+1);
		
		int i = 9;
//		int div = i/0;
//		System.out.println(div);
		System.out.println(0/9);
		
		int i1 = 9/2; //4.5
		System.out.println(i1);
		
		System.out.println(9.0/2.0);
		
		
	}

}

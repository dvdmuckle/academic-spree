import java.util.Scanner;
public class fib {
	public static int fibonacci(int n, int a, int b) {
		if (n == 0)
			return a;
		else if (n == 1)
			return b;
		else
			return fibonacci((n-1), b, (a + b));
	}
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int in = s.nextInt();
		System.out.println(fibonacci(in, 0, 1));
	}
}

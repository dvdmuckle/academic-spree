import java.util.Scanner;
public class compare {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String x = s.next();
		String y = s.next();
		if(x == y){
			System.out.println("Inputs are the same");
		} else { 
			System.out.println("Inputs are not the same");
		}
	}
}

import javax.swing.JOptionPane;
import java.util.Scanner;

public class MyIO {
	
	public static void write(String message) {
//		System.out.println(message);
		JOptionPane.showMessageDialog(null, message);
	}
	

	public static double readDouble(String message) {
		String input = JOptionPane.showInputDialog(message);
		double value = Double.parseDouble(input);
//		Scanner input = new Scanner(System.in);
//		System.out.print(message+": ");
//		double value = input.nextDouble();
		return value;
	}
	
	public static int readInt(String message) {
		String input = JOptionPane.showInputDialog(message);
		int value = Integer.parseInt(input);
//		Scanner input = new Scanner(System.in);
//		System.out.print(message+": ");
//		double value = input.nextDouble();
		return value;
	}
}

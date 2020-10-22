import java.util.Scanner;
public class TrafficSignals {
	public static void main(String[] args) {
		System.out.println("Enter the button:");
		Scanner input=new Scanner(System.in);
		String button=input.nextLine();
		switch (button) {
		case "red": System.out.println("Stop");
		            break;
		case "yellow":System.out.println("Ready");
		              break;
		case "green":System.out.println("Go");
		             break;
		}
		}
	}
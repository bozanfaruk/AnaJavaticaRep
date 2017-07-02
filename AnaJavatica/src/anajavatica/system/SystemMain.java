package anajavatica.system;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

@SuppressWarnings("javadoc")
public class SystemMain {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);
		System.out.println(scanner.nextLine());
		scanner.close();

		System.setIn(new FileInputStream(new File("scanner.txt")));
		scanner = new Scanner(System.in);
		System.out.println(scanner.nextLine());
		scanner.close();

	}

}

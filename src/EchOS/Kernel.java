package EchOS;

import java.io.IOException;
import java.util.Scanner;

// DO NOT Import ALL (*) Or else it creates bloat
// Within the standalone debian system.

public class Kernel {
	// System objects
	
	static Scanner scan = new Scanner(System.in); // Our kernel input.
	public static String file;
	public static String filedelete;
	public static String directorycreate;
	public static String directorydelete;
	public static String fileread;
	public static String Orlov;
	public static String cdinto;

	public static String CmdBuffer;

	public static void main(String[] args) throws IOException, InterruptedException {
			BootMessage bm = new BootMessage();
	}
	
	public static void Run() throws InterruptedException, IOException {
		while (true) {
			System.out.print("[0:\\]: ");
			String input = scan.nextLine();

			Cmdman CheckInput = new Cmdman();
		}
	}
}

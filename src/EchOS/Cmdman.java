package EchOS;


import java.util.Scanner;
import java.io.*;

public class Cmdman {
	
		static Scanner scan = new Scanner(System.in);
		static String ErrorStart = "[Cmdman ERROR]: ";
		public Cmdman() {
			CheckEnd(); // Make sure there is a proper "();" at the end.
			CheckSpace(Kernel.CmdBuffer); // Make sure there is no space starting the command.
			ExecuteCommand(Kernel.CmdBuffer); // Execute our final command.
		}

		public static void CheckSpace(String command) {
			// If it starts with a Space
			if (command.startsWith(" ")) {
				System.out.println(ErrorStart + "Remove the Starting Space.");
				System.exit(0);
			}
		}

		public static void ExecuteCommand(String command) {
			switch (command) {
				case "System.Shutdown();":
					Shutdown();
					break;

				case "System.Reboot();":
					Reboot();
					break;

				default:
					break;
			}
		}

		public static void CheckEnd() {
			if (!Kernel.CmdBuffer.contains("();")) {
				System.out.println(ErrorStart + "Failed To Execute Command. [Missing \"();\" Perhaps?]");

				try {
					Kernel.Run();
				} catch (Exception err) {
					err.printStackTrace();
				}
			}
		}

		public void CmdCheck(String CMD) {
			if (CMD.contains("();")) {
				return;
			}
		}

		public static void clear() {
			System.out.print("\033[H\033[2J");  // "\033[H\033[2J" Clears the screen.
			System.out.flush();
			System.out.println("===============================================================================");
			System.out.println("||###########################################################################||");
			System.out.println("||                                 EchOS 1.6                                 ||");
			System.out.println("||###########################################################################||");
			System.out.println("===============================================================================");
		}
		
		public static void help() {
			    System.out.println("Note: Every command ends with a '();' ");
			    System.out.println("================================================================================");
			    System.out.println("Command List: ");
			    System.out.println("Disk.ListDir(); - List all the files in the 0:\\ directory");
			    System.out.println("File.create [file] - Creates a File. Takes two or more arguments.");
			    System.out.println("File.delete [file] - Deletes a File. Takes two or more arguments.");
			    System.out.println("File.read [file] - Reads and prints the contents of a text file. Takes two or more arguments.");
			    System.out.println("Directory.create [directory] - Creates a directory. Takes two or more arguments.");
			    System.out.println("Directory.delete [directory] - Deletes a directory. Takes two or more arguments.");
			    System.out.println("Open.TextPad(); - Allows you to type text and save it.");
			    System.out.println("Open.Tour(); - Take a tour and teaches you about how to use EchOS!");
			    System.out.println("System.Shutdown(); - Shuts the OS Down. (Please use this to properly shutdown the System.)");
			    System.out.println("System.Reboot(); - Reboots the OS.");
			    System.out.println("Open.Calculator(); - Opens the systems calculator.");
			    System.out.println("System.About(); - Tells more information about the OS");
			    System.out.println("CMD.Clear(); - Clears the console.");
			    System.out.println("Execute.Ticktacktoe();");
			    System.out.println("Orlov [file] - NOT Implemented yet.");
			    System.out.println("echo [string] - Echos anything back to you.");
			    System.out.println("================================================================================");
		}
		
		public static void About() {
			System.out.println("[EchOS] 1.6");
			System.out.println("Developer: audiotore341");
			System.out.println("Languages: Java");
		}
		
		public static void Shutdown() {
			boolean CommandIsRunning = true;

			System.out.println("Are you sure you want to Shutdown? [Yes/No]");
			System.out.println("Note: (Will not actually shutdown your computer only exit the Program)");
			System.out.println(); // Space.

			while (CommandIsRunning) {
				String input = scan.nextLine();

				if (input == "Yes") {
					System.exit(0);
				} else if (input == "No") {
					return;
				} else {
					System.out.println("Invaild response. [Yes/No]?");
				}
			}
		}
		
		public static void Reboot() throws IOException, InterruptedException {
			boolean CommandIsRunning = true;

			System.out.println("Are you sure you want to Reboot? [Yes/No]");
			System.out.println("Note: (Will not actually reboot your computer only exit the Program)");
			System.out.println(); // Space.

			while (CommandIsRunning) {
				String input = scan.nextLine();

				if (input == "Yes") {
					// TODO: Clear Console Here.
					// TODO: Reload to our BootLoader.
				} else if (input == "No") {
					return;
				} else {
					System.out.println("Invaild response. [Yes/No]?");
				}
			}
		}
		
		public static void Calculate() {
	        double num1 = 0;
	        double num2 = 0;
	        double result = 0;
	        while (true) {
	            System.out.println("*** WARNING: Strings will not work. ***");
	            System.out.print("Enter a number: ");
	            //  [
	            try {
	                num1 = Double.parseDouble(System.console().readLine());
	            }
	            catch (Exception e) {
	                System.out.println(e.getMessage());
	            }
	            
	            //  ]
	            System.out.print("Enter another number: ");
	            //  [
	            try {
	                num2 = Double.parseDouble(System.console().readLine());
	            }
	            catch (Exception e) {
	                System.out.println(e.getMessage());
	            }
	            
	            //  ]
	            System.out.println(">> 1. Addition.");
	            System.out.println(">> 2. Subtraction.");
	            System.out.println(">> 3. Multiplication. ");
	            System.out.println(">> 4. Division.");
	            System.out.print(">>>: ");
	            String operands = System.console().readLine();
	            
	            if ((operands.equals("1"))) {
	                result = (num1 + num2);
	                System.out.println(("answer: " + result));
	                break;
	            }
	            else if ((operands.equals("2"))) {
	                result = (num1 - num2);
	                System.out.println(("answer: " + result));
	                break;
	            }
	            else if ((operands.equals("3"))) {
	                result = (num1 * num2);
	                System.out.println(("answer: " + result));
	                break;
	            }
	            else if ((operands.equals("4"))) {
	                result = (num1 / num2);
	                System.out.println(("answer: " + result));
	                break;
	            }
	            else {
	                System.out.println("Not a vaild command..");
	            }
	        }
	    }	
}
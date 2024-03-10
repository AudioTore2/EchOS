package EchOS;

import java.io.IOException;

public class BootMessage {
    private static Sleep sleep = new Sleep();
    private static Clear ClearCMD = new Clear();

    public BootMessage() throws IOException, InterruptedException {
            Kernel kern = new Kernel();

			String buffer = "";

			for (int index = 0; index < 2; index += 1)
			{
				buffer += ".";
				System.out.println("Booting." + buffer);
				ClearCMD.ClearConsole();
			}
			
			System.out.println("EchOS has successfully booted!");
			sleep.Sleep(2000);
			Clear.ClearConsole();

			System.out.println("===============================================================================\n"
			+ "||###########################################################################||\n"
			+ "||                                 EchOS 1.6                                 ||\n"
			+ "||###########################################################################||\n"
			+ "||===============================================================================\n"
			+ "Type \"Help();\" to get a list of commands.\n"
			+ "Or type \"Open.Tour();\" to take a tour to learn how to use EchOS.\n");

			System.out.println(""); // Space.
				
			Kernel.Run();
				
	}
}


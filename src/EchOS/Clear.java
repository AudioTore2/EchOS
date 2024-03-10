package EchOS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Clear {

    // Function for Clearing (Linux)

    public static void LinClear() {
        // I have zero clue why this clears the console.
        // Java You are Strange sometimes.
        System.out.print("\033[H\033[2J");
		System.out.flush();
    }
    // Function for Clearing (Windows)

    public static void WinClear() throws IOException {
        ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", "cls");
        builder.redirectErrorStream(true);
        Process p = builder.start();
        BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
    }

    public static void ClearConsole() throws IOException {
        String operSys = System.getProperty("os.name").toLowerCase();

        if (operSys.contains("win")) {
            WinClear();
        } else if (operSys.contains("lin")) {
            LinClear();
        }
    }
}

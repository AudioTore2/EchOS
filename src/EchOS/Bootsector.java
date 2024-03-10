package EchOS;

import java.io.IOException;

public class Bootsector {
	private static BootMessage BootMSG;

    public void Boot() {
        try {
            BootMSG = new BootMessage();
        } catch (Exception err) {
            err.printStackTrace();
        }
    }
}

import View.LoginGui;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // use invokeLater to make updates to the GUI more thread-safe
        //working in progress not done yet
        SwingUtilities.invokeLater(() -> new LoginGui().setVisible(true));
    }
}

import javax.swing.*; // Import Swing components for dialogs

public class Loop {
    public static void main(String[] args) {
        // Show an input dialog to get the number of times to "shout"
        String input = JOptionPane.showInputDialog(
            null,                                // Parent component (null = center of screen)
            "How many times must I shout?",      // Prompt message
            "Input",                              // Dialog title
            JOptionPane.QUESTION_MESSAGE          // Message type (icon)
        );

        // Check if user didn't cancel or leave input empty
        if (input != null && !input.trim().isEmpty()) {
            try {
                // Try to convert the input string to an integer
                int num = Integer.parseInt(input);

                // Loop the specified number of times
                for (int count = 1; count <= num; count++) {
                    // Show a message dialog with "Wake up!" each time
                    JOptionPane.showMessageDialog(
                        null,                          // Parent component
                        "Wake up!",                    // Message
                        "Shout #" + count,             // Dialog title
                        JOptionPane.INFORMATION_MESSAGE // Message type
                    );
                }

            } catch (NumberFormatException e) {
                // Show error dialog if the input was not a valid number
                JOptionPane.showMessageDialog(
                    null,
                    "Please enter a valid number.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
                );
            }
        } else {
            // Show warning if input was canceled or left empty
            JOptionPane.showMessageDialog(
                null,
                "Input cancelled or empty.",
                "Warning",
                JOptionPane.WARNING_MESSAGE
            );
        }
    }
}
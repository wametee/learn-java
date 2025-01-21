import javax.microedition.midlet.*; // Importing MIDlet base class for J2ME applications
import javax.microedition.lcdui.*; // Importing classes for User Interface (UI) components

public class HelloWorldMidlet extends MIDlet {
    // This class extends MIDlet, the base class for all MIDP applications.
    // A MIDlet represents a single J2ME application lifecycle.

    private Display display; // Display object for managing screens
    private Form form;       // Form UI component for displaying text

    public HelloWorldMidlet() {
        // Constructor for the HelloWorldMidlet class. This is where
        // the initial setup for the MIDlet is performed.
        display = Display.getDisplay(this); // Get the Display instance specific to this MIDlet
        form = new Form("Hello J2ME");      // Create a form titled "Hello J2ME"
        form.append("Hello, World!");       // Append a message "Hello, World!" to the form
    }

    public void startApp() {
        // Called when the application starts or resumes from a paused state.
        display.setCurrent(form); // Set the current screen to the created form
    }

    public void pauseApp() {
        // Called when the application is paused (e.g., when the user switches away from it).
        // This implementation is empty as there is no special action needed.
    }

    public void destroyApp(boolean unconditional) {
        // Called when the application is destroyed.
        // The parameter `unconditional` indicates whether cleanup is mandatory.
        // This implementation is empty as there is no special action needed.
    }
}

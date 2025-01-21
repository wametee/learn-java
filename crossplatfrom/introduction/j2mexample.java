import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;

public class HelloWorldMidlet extends MIDlet {
    private Display display; // Display object for managing screens
    private Form form; // Form UI component for displaying text
    
    public HelloWorldMidlet() {
        display = Display.getDisplay(this); // Get display instance for the MIDlet
        form = new Form("Hello J2ME"); // Create a form titled "Hello J2ME"
        form.append("Hello, World!"); // Append text to the form
    }
    
    public void startApp() {
        display.setCurrent(form); // Set the current display to the created form
    }
    
    public void pauseApp() {}
    
    public void destroyApp(boolean unconditional) {}
}
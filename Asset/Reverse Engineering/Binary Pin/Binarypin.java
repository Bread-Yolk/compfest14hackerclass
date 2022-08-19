

import java.awt.LayoutManager;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JFrame;

// 
// Decompiled by Procyon v0.5.36
// 

public class Binarypin
{
    private JFrame frame;
    private JLabel output;
    
    Binarypin() {
        this.frame = new JFrame("Binary Pin");
        (this.output = new JLabel()).setBounds(20, 250, 360, 20);
        final JLabel comp = new JLabel("Your data:");
        comp.setBounds(20, 235, 100, 20);
        this.frame.add(comp);
        this.frame.add(this.output);
        this.frame.add(new PinButton(this, "0", 43, 10, 150, 150));
        this.frame.add(new PinButton(this, "1", 198, 10, 150, 150));
        this.frame.add(new ResetButton(this, 43, 165, 305, 50));
        this.frame.setSize(400, 350);
        this.frame.setLayout(null);
        this.frame.setVisible(true);
        this.frame.setDefaultCloseOperation(3);
    }
    
    public static void main(final String[] array) {
        new Binarypin();
    }
    
    public void clearOutput() {
        this.output.setText("");
    }
    
    public void updateOutput() {
        this.output.setText(Secret.getInstance().getData());
    }
}


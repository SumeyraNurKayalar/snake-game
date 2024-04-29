import javax.swing.JFrame;

public class gameframe extends JFrame {
    gameframe() {
        GamePanel panel = new GamePanel(); // Create an instance of GamePanel
        
        this.add(panel); // Add the panel instance to the frame
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        // Create an instance of GameFrame
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new gameframe(); 
            }
        });
    }
}

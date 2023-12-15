import javax.swing.JFrame;

public class frame extends JFrame {
	
	frame(){
		this.add(new panel());
		this.setTitle("snake ate em all");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
	}

}

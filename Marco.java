import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.awt.COLOR;

public class Marco{
	private JFrame frame;
	private JPanel panel;
	
	pubic Marco(){
		frame = new JFrame("Mi Marco");
		frame.setBound(700, 100, 300, 200);
		panel.setBackground(Color.BLUE);
		frame.add(panel);
	}
	public static void main(String[] args){
		Marco m = new Marco();
		m.frame.setDefaultCloseOperation(JFame.EXIT_ON_CLOSE);
		m.frame.setVisible(true);
		
	}
}
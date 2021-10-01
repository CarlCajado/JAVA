import javax.swing.JFrame;

public class InterfTest {
	public static void main(String[] args)
	 {
	 Interf panel = new Interf();
	 JFrame application = new JFrame();
	
	 application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 application.add(panel);
	 application.setSize(230, 250);
	 application.setVisible(true);
	 }

}

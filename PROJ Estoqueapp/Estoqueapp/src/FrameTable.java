import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

@SuppressWarnings("serial")
public class FrameTable extends JFrame {
	public FrameTable () {
		super("Estoque");
		EstoqueDAO dao = new EstoqueDAO();
		EstoqueTableModel tm = new EstoqueTableModel (dao);
		JTable t = new JTable (tm);
		JScrollPane scroll = new JScrollPane();
		scroll.setViewportView(t); 
		add(scroll);
		setSize(200,180);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
	}

}

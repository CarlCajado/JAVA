
import javax.swing.table.TableModel;

public class Test {
	public static void mostra (TableModel tm) {
		for (int i = 0; 1< tm.getRowCount(); i++) {
			for (int j=0; j< tm.getColumnCount(); j++) {
				System.out.print(tm.getValueAt(i, j)+" ");
				
			}
			System.out.println();
		}
		
	}

	
	public static void main(String[] args) {
		FrameTable frame = new FrameTable();
		frame.setVisible(true);
		
}
}
	
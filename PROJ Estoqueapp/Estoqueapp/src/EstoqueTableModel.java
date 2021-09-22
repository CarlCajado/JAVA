import java.util.List;

import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;


public class EstoqueTableModel extends AbstractTableModel
	implements TableModelListener{
	EstoqueDAO dao;
	List<Estoque> estoques;
	List<String> colunas = List.of("Produto", "Valor", "Quantidade");
	
	public EstoqueTableModel(EstoqueDAO dao) {
		
		this.dao = dao;
		estoques = dao.recupera();
		this.addTableModelListener(this);
	}
	
	
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return estoques.size() ;
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Estoque estoque = estoques.get(rowIndex);
		switch (columnIndex) {
		case 0:
			return estoque.getProduto();
		case 1:
			return estoque.getValor();
		case 2:
			return estoque.getQuantidade();
		}
		return null;
	}


	@Override
	public String getColumnName(int column) {
		// TODO Auto-generated method stub
		return colunas.get(column);
	}
public boolean isCellEditable(int rowIndex, int ColumnIndex) {
	return true;
	}

@Override
public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
	Estoque estoque = estoques.get(rowIndex);
	switch (columnIndex) {
	case 0:
		 estoque.setProduto((String)aValue);
		 break;
	case 1:
		estoque.setValor((String)aValue);
		 break;
	case 2:
		estoque.setQuantidade((String)aValue);
		 break;
		}
	fireTableCellUpdated(rowIndex, columnIndex);
	}


@Override
public void tableChanged(TableModelEvent event) {
	int i = event.getFirstRow();
	Estoque estoque = estoques.get(i);
	System.out.println(i);
	System.out.println("ATUALIZANDO");
	dao.update(estoque);
	
} 
}

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class EstoqueDAO {
	public  Connection conn;
	
	public EstoqueDAO(){
		String url = "jdbc:derby:estoque;create=true";
		 try {
			 conn = DriverManager.getConnection(url);
			 System.out.println("conectado");
		 }catch(SQLException e) {
			 e.printStackTrace();
		 	}	
}
	public void adiciona(Estoque c) {
	String sql = "INSERT INTO Estoque("+
	"produto,valor,quantidade) VALUES(?,?,?)";
		try {
		PreparedStatement stmt =
		 conn.prepareStatement(sql);
		stmt.setString(1, c.getProduto());
		stmt.setString(2, c.getValor());
		stmt.setString(3, c.getQuantidade());
		stmt.execute();
		stmt.close();
		System.out.print("inserido");
		}catch (SQLException e) {
			e.printStackTrace();
			}
		 }

		public List<Estoque> recupera() {
			List<Estoque> estoques = new LinkedList<Estoque>();
			String sql = "select * from estoque";
			 try {
			 PreparedStatement stmt =
			 conn.prepareStatement(sql);
			 ResultSet rs = stmt.executeQuery();
			 while (rs.next()) {
			String produto = rs.getString("produto");
			String valor = rs.getString("valor");
			String quantidade = rs.getString("quantidade");
			
			Estoque estoque = new Estoque(produto, valor, quantidade);
			estoques.add(estoque);
			
			
			 }
			 stmt.close();
			 } catch (SQLException u) {
			 throw new RuntimeException(u);
			 }
			 return estoques;
		}
		public void update (Estoque c) {
			String sql = "update estoque set produto =?, valor=? where quantidade=?";
			try {

				PreparedStatement stmt =
						conn.prepareStatement(sql);
				stmt.setString(1, c.getProduto());
				stmt.setString(2, c.getValor());
				stmt.setString(3, c.getQuantidade());
				stmt.execute();
				stmt.close();
			} catch (SQLException u) {
				throw new RuntimeException(u);
			}
				
		}
		}
		

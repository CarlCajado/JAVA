import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		EstoqueDAO dao = new EstoqueDAO();
		dao.adiciona(new Estoque("celuar", "2000","120"));
		List<Estoque> estoques = dao.recupera();
		for(Estoque estoque : estoques) {
		System.out.println(estoque);
			
		}		
	
}
}
	
package cap18;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Connection;

/*
 * Statement - consulta simples (o dev sempre que montar a string do comando inteira)
 * PreparedStatement - consultas pre-compiladas e parametrizavel (A mais utilizada)
 * CallableStatement - execução de functions ou stored pocedures
 */

public class TesteJdbc {
	
	public static void main(String[] args) {
		
		String urlConexao = "jdbc:mysql://localhost:3306/world?user=root&password=Imp@ct@";
		
		try {
		Connection conexao = (Connection) DriverManager.getConnection(urlConexao);
		System.out.println("Conexão estabelecida com sucesso!");
		
		String sql = "select * from city where countryCode = ? ";
		PreparedStatement stmt = conexao.prepareCall(sql);
		stmt.setString(1, "BRA");
		ResultSet result = stmt.executeQuery();
		
		while(result.next()) {
			
			int id = result.getInt("ID");
			String nome = result.getString("Name");
			String codigoPais = result.getString("CountryCode");
			String estado = result.getString("District");
			int populacao = result.getInt("Population");
			
			System.out.printf("%4d %-40s %-8s %-35s %8d \n", id, nome, codigoPais, estado, populacao);
		}
		
		conexao.close();
	}catch (SQLException e) {
		e.printStackTrace();
	}

	}
}

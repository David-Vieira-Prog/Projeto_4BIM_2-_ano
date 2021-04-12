package É_10_essa_porra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class bd {
	private String url;
	private String usuario;
	private String senha;
	public bd() {
		url="jdbc:postgresql://localhost:5432/cliente";
		usuario="postgres";
		senha="marcia45";
	}
	private Connection getConnection() throws SQLException  {
		try {
			Class.forName("org.postgresql.Driver");
			Connection con=DriverManager.getConnection(url,usuario,senha);
			return con;
		
	}catch(SQLException ex){
		 JOptionPane.showMessageDialog(null, "Problemas com a conexão\n"+ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
		return null;
		
		
	} catch (ClassNotFoundException e) {
		 JOptionPane.showMessageDialog(null, "O driver não foi encontrado", "Erro", JOptionPane.ERROR_MESSAGE);
		 return null;
	}
		

}
	public int executeUpdate(String sql){
        try{
            Connection con = getConnection();
            Statement stm = con.createStatement();
            System.out.println(sql);
            int res=stm.executeUpdate(sql);
            con.close();
            return res;
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Problemas com a conexão\n"+ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            return 0;
        }
    }
	public ResultSet executeQuery(String sql){
        try{
            Connection con = getConnection();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            //con.close();
            return rs;
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Problemas com a conexão\n"+ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
}
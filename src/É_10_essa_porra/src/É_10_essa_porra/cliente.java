package É_10_essa_porra;

import java.sql.ResultSet;
import java.sql.SQLException;

public class cliente extends pessoa {
	bd bd=new bd();

public cliente(String nome, String data_nasc, String cpf, String endereco, String cep, String rg, String login, String senha,String cidade,String estado,
		String email,String sexo){
	super(nome,  cpf, endereco, cep, rg,sexo,data_nasc,cidade,estado);
	this.login = login;
	this.senha = senha;
	this.email = email;
}
public cliente() {
	// TODO Auto-generated constructor stub
}
private String login;
private String senha;
private String email;
private String telefone;

public String getTelefone() {
	return telefone;
}
public void setTelefone(String telefone) {
	this.telefone = telefone;
}

public String getLogin() {
	return login;
}
public void setLogin(String login) {
	this.login = login;
}
public String getSenha() {
	return senha;
}
public void setSenha(String senha) {
	this.senha = senha;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public void incluir() throws SQLException {
	String sql ;
	bd bd =new bd();
	 sql=String.format("INSERT INTO cliente1 values('%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s');",
			this.getNome(),
			this.getData_nasc(),
			this.getCpf(),
			this.getRg(),
			this.getEndereco(),
			this.getCep(),	
			this.getSexo(),
			this.getEmail(),
			this.getTelefone(),
			this.getLogin(),
			this.getLogin(),
	 		this.getEstado(),
	 		this.getCidade());
		int res=bd.executeUpdate(sql);
	
	
}
public boolean entrar(String login, String senha) {
	String sql;
	bd bd =new bd();
	sql=String.format("SELECT * FROM cliente1 where login = '%s' and senha = '%s'",login,senha);
	try {
		ResultSet consulta=bd.executeQuery(sql);
		while(consulta.next()) {
			String login1=consulta.getString("login");
			String senha1=consulta.getString("senha");
			if(login.equalsIgnoreCase(login1) && senha.equalsIgnoreCase(senha1)) {
				return true;
			}
		}
		
	}
	
	catch(Exception e){
		e.printStackTrace();
		
	}
	return false;
	
}
public ResultSet consultar(String login,String senha) {
	String sql;
	ResultSet dados=null;
	sql=String.format("SELECT * FROM cliente1 where login = '%s' and senha = '%s'",login,senha);
	try {
		dados =bd.executeQuery(sql);
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	return dados;
}

}






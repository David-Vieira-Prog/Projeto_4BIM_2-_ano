package É_10_essa_porra;

public class admin extends pessoa {
public admin(String nome, String data_nasc, String cpf, String endereco, String cep, String rg,String cidade,String estado, String login, String senha,
		String email,String sexo) {
	super(nome, data_nasc, cpf, endereco, cep, rg,sexo,cidade,estado);
	this.login = login;
	this.senha = senha;
	this.email = email;
}
private String login;
private String senha;
private String email;
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
}

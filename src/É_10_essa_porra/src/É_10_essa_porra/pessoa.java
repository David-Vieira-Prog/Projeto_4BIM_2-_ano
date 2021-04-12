package É_10_essa_porra;

public class pessoa {
private String nome;
private String  data_nasc;
private String cpf;
private String endereco;
private String cep;
private String rg;
private String sexo;
private String estado;
private String cidade;

public String getEstado() {
	return estado;
}
public void setEstado(String estado) {
	this.estado = estado;
}
public String getCidade() {
	return cidade;
}
public void setCidade(String cidade) {
	this.cidade = cidade;
}
public pessoa(String nome, String data_nasc, String cpf, String endereco, String cep, String rg,String sexo,String estado,String cidade) {
	super();
	this.cidade=cidade;
	this.estado=estado;
	this.nome = nome;
	this.data_nasc = data_nasc;
	this.cpf = cpf;
	this.endereco = endereco;
	this.cep = cep;
	this.rg = rg;
	this.sexo=sexo;
	this.cidade=cidade;
	this.estado=estado;
}
public String getData_nasc() {
	return data_nasc;
}
public void setData_nasc(String data_nasc) {
	this.data_nasc = data_nasc;
}
public pessoa() {
	// TODO Auto-generated constructor stub
}
public String getSexo() {
	return sexo;
}
public void setSexo(String sexo) {
	this.sexo = sexo;
}
public String getRg() {
	return rg;
}
public void setRg(String rg) {
	this.rg = rg;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getCpf() {
	return cpf;
}
public void setCpf(String cpf) {
	this.cpf = cpf;
}
public String getEndereco() {
	return endereco;
}	
public void setEndereco(String endereco) {
	this.endereco = endereco;
}
public String getCep() {
	return cep;
}
public void setCep(String cep) {
	this.cep = cep;
}
public boolean validar_cpf(String cpf) {

	int c1=Integer.parseInt( cpf.substring(0,1));
	int c2=Integer.parseInt( cpf.substring(1,2));
	int c3=Integer.parseInt( cpf.substring(2,3));
	int c4=Integer.parseInt( cpf.substring(3,4));
	int c5=Integer.parseInt( cpf.substring(4,5));
	int c6=Integer.parseInt( cpf.substring(5,6));
	int c7=Integer.parseInt( cpf.substring(6,7));
	int c8=Integer.parseInt( cpf.substring(7,8));
	int c9=Integer.parseInt( cpf.substring(8,9));
	int d1=Integer.parseInt( cpf.substring(9,10));
	int d2=Integer.parseInt( cpf.substring(10,11));
	int n1=(c1*10 + c2*9 + c3*8 + c4*7 + c5*6 + c6*5 + c7*4 + c8*3 + c9*2)*10;
	int n2=(c1*11 + c2*10 + c3*9 + c4*8 + c5*7 + c6*6 + c7*5 + c8*4 + c9*3 + d1*2)*10;
	if(n1%11==d1 && n2%11==d2) {
		return true;
	}else {
	return false;
	}
	
	
	
}
}


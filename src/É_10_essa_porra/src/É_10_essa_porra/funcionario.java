package É_10_essa_porra;

public class funcionario extends pessoa {
private float salario;
private String cargo;
public funcionario(String nome, String data_nasc, String cpf, String endereco, String cep, String rg,String estado,String cidade, float salario,
		String cargo,String sexo) {
	super(nome, data_nasc, cpf, endereco, cep, rg,sexo,estado,cidade);
	this.salario = salario;
	this.cargo = cargo;
}
public float getSalario() {
	return salario;
}
public void setSalario(float salario) {
	this.salario = salario;
}
public String getCargo() {
	return cargo;
}
public void setCargo(String cargo) {
	this.cargo = cargo;
}

}

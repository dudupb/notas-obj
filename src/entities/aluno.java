package entities;

public class aluno {

	public String name;
	public double nota1;
	public double nota2;
	public double nota3;

	public double media() {
		return nota1 + nota2 + nota3;
	}

	public double resto() {
		if (media() < 60.00) {
			return 60.0 - media();
		}else {
			return 0.0;
		}
	}
}



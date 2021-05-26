package application;

import java.util.Locale;
import java.util.Scanner;

import entities.aluno;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		aluno student = new aluno();
		
		student.name = sc.nextLine();
		student.nota1 = sc.nextDouble();
		student.nota2 = sc.nextDouble();
		student.nota3 = sc.nextDouble();
		
		
		System.out.printf("FINAL GRADE = %.2f%n",student.media());
		
		if (student.media() < 60.00) {
			System.out.println("FAILED");
			System.out.printf("Falta = %.2f%n",student.resto());
		}else 
			System.out.println("PASS");
		
		sc.close();
	}

}

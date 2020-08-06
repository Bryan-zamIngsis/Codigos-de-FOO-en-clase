import java.util.Scanner;

public class cuentapart2 {

	public static void main(String[] args) {
		cuentaCorriente cta1 = new cuentaCorriente();
		cuentaCorriente cta2 = new cuentaCorriente();
		cta1.depositar(100);
		cta1.depositar(200);
		System.out.println(cta1.getSaldo());
		
	
		Scanner in = new Scanner(System.in);
		System.out.println("Ingrese cantidad de deposito para cta1");
		double dinero = in.nextDouble();
		cta1.depositar(dinero);
		
		System.out.println("Ingrese cantidad de deposito para cta2");
		dinero = in.nextDouble();
		cta1.depositar(dinero);
		
		System.out.println("Saldo cta1: " + cta1.getSaldo());
		System.out.println("Saldo cta2: " + cta2.getSaldo());

	}

}


public class Main5 {
	void sumarContadorMain() {
		cuentaCorriente.contador += 100;
		sumarContadorMain();
	}
	
	static void sumarContadorMain1() {
		cuentaCorriente.contador += 100;
		Main5 main = new Main5();
		main.sumarContadorMain();

	}

	public static void main(String[] args) {
		
		Main5 main = new Main5();
		main.sumarContadorMain();
		
		Main5.sumarContadorMain1();
		sumarContadorMain1();
		
		cuentaCorriente.sumarContador();
		System.out.println(cuentaCorriente.contador();
		//cuentaCorriente.saldo=100;
		
		
		cuentaCorriente cta = new cuentaCorriente();
		cta.saldo = 100;
		
		cuentaCorriente cta1 = new cuentaCorriente();
		cta.saldo = 1000;

	}

}

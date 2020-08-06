
public class cuentaCorriente {
	
	    public static int contador;
		double saldo;
	    
	    public double getSaldo() {
	    	return saldo;
	    }
	    
	   public void retirar(double dinero) {
		   saldo -=dinero;
	   }
	   public void depositar(double dinero) {
		   saldo +=dinero;
		

	}

	public void depositar(int dinero) {
		// TODO Auto-generated method stub
		
	}

	public static void sumarContador() {
		// TODO Auto-generated method stub
		
	}

}


public class cuentaCorriente {
	
	    private double saldo;
	    
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

}

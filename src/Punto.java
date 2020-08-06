

public class Punto {
	
	 public void man(){
	        
	        double x1 =1,y1 =2,x2=10,y2=5;
	        
	        double distancia = Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2));
	        System.out.println(distancia);
	    }
	    
	    public double x,y;
	    
	    public double distancia(Punto punto){
	        double distancia = Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2));
	        return distancia;
	    }
	    
	    public double x1,y1,x2,y2;
	    
	    public double distancia(double x1,double y1,double x2, double y2){
	        double distancia = Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2));
	        return distancia;
	    }
	    
	    //(1,2)+(3,2)=(4,4)
	    
	    public Punto suma(Punto punto){
	        Punto result = new Punto();
	        result.x = x + punto.x;
	        result.y = y + punto.y;
	        return result;
	    }
	    
	    public Punto escalar(Punto punto){
	        Punto vector = new Punto();
	        Punto resultante = new Punto();
	        vector.x = x * punto.x;
	        vector.y = y * punto.y;
	        return vector;
	    }

}

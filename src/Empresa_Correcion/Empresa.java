
package Empresa_Correcion;

import java.util.ArrayList;


public class Empresa {
    
    private ArrayList<Empleado> empleados = new ArrayList<>();
    
    public void contratar(Empleado empleado){
        empleados.add(empleado);
    }
    
    public double diaDePago(){
        double salarioTotal = 0;
        
        for(int i=0;i<empleados.size();i++){
            Empleado emp = empleados.get(i);
            System.out.println(emp.getClass());
            salarioTotal += emp.getSalario();
        }
        
        return salarioTotal;
    }
    
    public int totalEmpleados(){
        return empleados.size();
    }
}

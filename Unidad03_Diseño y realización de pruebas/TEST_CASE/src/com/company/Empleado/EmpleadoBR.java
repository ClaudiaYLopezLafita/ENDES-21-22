package com.company;

public class EmpleadoBR {
	
	public enum TipoEmpleado { vendedor, encargado }
	
	static float calculaSalarioBruto(TipoEmpleado tipo, float ventasMes, float horasExtra){
		float salary = 1000.00f;
		
		if(tipo==null || ventasMes<0 || horasExtra < 0)
			try {
				throw new BRException("Exception in 'tipo', 'ventasMes' or 'horasExtra' values");
			} catch (BRException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		if(tipo.equals(TipoEmpleado.encargado))
			salary += 500.00f;
		else {
			if(ventasMes >= 1000.00f && ventasMes < 1500.00f)
				salary += 100.00f;
			else if(ventasMes >= 1500.00f)
				salary += 200.00f;
		}
		
		salary += horasExtra*20;
		
		return salary;
	}
	
	static float calculaSalarioNeto(float salarioBruto) {
		float salary = salarioBruto;
		
		if(salarioBruto < 0)
			try {
				throw new BRException("Exception in 'salarioBruto' value");
			} catch (BRException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		if(salarioBruto>1000.00f && salarioBruto<1500.00f)
			salary = salarioBruto - salarioBruto*.16f;
		else if(salarioBruto>=1500.00f)
			salary = salarioBruto - salarioBruto*.18f;
		
		return salary;
	}

}

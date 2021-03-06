package com.company;

import com.company.EmpleadoBR.TipoEmpleado;
import org.junit.Test;

import static org.testng.Assert.assertEquals;

public class EmpleadoBRTest {

	@Test
	public void testCalculaSalarioBruto1() {
		//fail("Not yet implemented");
		float resultadoReal = EmpleadoBR.calculaSalarioBruto
				(EmpleadoBR.TipoEmpleado.vendedor, 2000.0f, 8.0f);
		float resultadoEsperado = 1360.0f;
		assertEquals(resultadoEsperado, resultadoReal, 0.01);
	}

	@Test
	public void testCalculaSalarioBruto2() {
		//fail("Not yet implemented");
		float resultadoReal = EmpleadoBR.calculaSalarioBruto(TipoEmpleado.vendedor,
				1500.0f, 3.0f);
		float resultadoEsperado = 1260.0f;
		assertEquals(resultadoEsperado, resultadoReal, 0.01);
	}
	
	@Test
	public void testCalculaSalarioNeto1() {
		float resultadoReal = EmpleadoBR.calculaSalarioNeto(2000.0f);
		float resultadoEsperado = 1640.0f;
		assertEquals(resultadoEsperado, resultadoReal, 0.01);
	}
	
	@Test
	public void testCalculaSalarioNeto2() {
		float resultadoReal = EmpleadoBR.calculaSalarioNeto(1500.0f);
		float resultadoEsperado = 1230.0f;
		assertEquals(resultadoEsperado, resultadoReal, 0.01);
	}

	@Test
	public void calculaSalarioBruto() {
	}

	@Test
	public void calculaSalarioNeto() {
	}
}

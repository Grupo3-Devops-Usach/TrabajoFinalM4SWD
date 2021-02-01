package com.devops.dxc.devops;

import com.devops.dxc.devops.model.Dxc;
import com.devops.dxc.devops.model.Util;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static com.devops.dxc.devops.model.Util.getUf;
import static org.springframework.test.util.AssertionErrors.assertEquals;
import static org.springframework.test.util.AssertionErrors.assertTrue;

@SpringBootTest
class DevopsApplicationTests {

	@Test
	void testSinAhorro() {
		Dxc diezxciento = new Dxc(0, 0);
		assertEquals("Sin ahorro", 0, diezxciento.getDxc());
	}

	@Test
	void testRetiroMaximo(){
		Dxc diezxciento = new Dxc(70000000, 0);
		int uf = getUf();
		assertEquals("Retiro máximo", (uf * 150), diezxciento.getDxc());
	}

	@Test

	void testSaldoRetiroMaximo(){
		Dxc diezxciento = new Dxc(70000000, 0);
		diezxciento.getDxc();
		int uf = getUf();

		assertEquals("Saldo retiro máximo", (70000000-(uf * 150)), diezxciento.getSaldo());
	}

	@Test
	void testRetiroUnMillon(){
		Dxc diezxciento = new Dxc(2000000, 0);

		assertEquals("Retiro total ahorro", 1000000, diezxciento.getDxc());
	}

	@Test
	void testSaldoRetiroUnMillon(){
		Dxc diezxciento = new Dxc(2000000, 0);
		diezxciento.getDxc();

		assertEquals("Saldo setiro total ahorro", (2000000-1000000), diezxciento.getSaldo());
	}

	@Test
	void testRetiroTotalAhorro(){
		Dxc diezxciento = new Dxc(900000, 0);

		assertEquals("Retiro total ahorro", 900000, diezxciento.getDxc());
	}

	@Test
	void testSaldoRetiroTotalAhorro(){
		Dxc diezxciento = new Dxc(900000, 0);
		diezxciento.getDxc();

		assertEquals("Saldo retiro total ahorro", 0, diezxciento.getSaldo());
	}

	@Test
	void testRetiroDiezPorciento(){
		Dxc diezxciento = new Dxc(15000000, 0);

		assertEquals("Retiro 10% ahorro", 1500000, diezxciento.getDxc());
	}

	@Test
	void testSaldoRetiroDiezPorciento(){
		Dxc diezxciento = new Dxc(15000000, 0);
		diezxciento.getDxc();

		assertEquals("Saldo retiro 10% ahorro", (int)(15000000-(15000000*0.1)), diezxciento.getSaldo());
	}

	@Test
	void testUFValida() {
		int uf = getUf();
		assertTrue("UF mayor a 29000", uf > 29000);
	}

	@Test
	void testImpuesto1() {	// < 1,488,690
		Dxc diezxciento = new Dxc(5000000,1200000);
		assertEquals("Impuesto 0.08 primer rango de sueldos",(0), diezxciento.getImpuesto());
	}

	@Test
	void testImpuesto2() {	// 1,488,690 - 2,481,150
		Dxc diezxciento = new Dxc(50000000,1700000);
		assertEquals("Impuesto 0.08 primer rango de sueldos",(int)(0.08*150*getUf()), diezxciento.getImpuesto());
	}

	@Test
	void testImpuesto3() {	// 2,481,151 - 3,466,667
		Dxc diezxciento = new Dxc(50000000,2500000);
		assertEquals("Impuesto 0.08 primer rango de sueldos",(int)(0.135*150*getUf()), diezxciento.getImpuesto());
	}

	@Test
	void testImpuesto4() {	// 3,466,667 - 4,458,334
		Dxc diezxciento = new Dxc(50000000,4200000);
		assertEquals("Impuesto 0.08 primer rango de sueldos",(int)(0.23*150*getUf()), diezxciento.getImpuesto());
	}

	@Test
	void testImpuesto5() {	// 4,458,333.4 - 5,950,000
		Dxc diezxciento = new Dxc(50000000,4700000);
		assertEquals("Impuesto 0.08 primer rango de sueldos",(int)(0.304*150*getUf()), diezxciento.getImpuesto());
	}

	@Test
	void testImpuesto6() {	// > 5,950,000
		Dxc diezxciento = new Dxc(50000000,6500000);
		assertEquals("Impuesto 0.08 primer rango de sueldos",(int)(0.35*150*getUf()), diezxciento.getImpuesto());
	}
}

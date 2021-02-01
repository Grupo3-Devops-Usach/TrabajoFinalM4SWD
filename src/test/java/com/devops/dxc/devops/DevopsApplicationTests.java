package com.devops.dxc.devops;

import com.devops.dxc.devops.model.Dxc;
import com.devops.dxc.devops.model.Util;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.springframework.test.util.AssertionErrors.assertEquals;

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
		int uf = Util.getUf();

		assertEquals("Retiro máximo", (uf * 150), diezxciento.getDxc());
	}

	@Test
	void testSaldoRetiroMaximo(){
		Dxc diezxciento = new Dxc(70000000, 0);
		diezxciento.getDxc();
		int uf = Util.getUf();

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

}

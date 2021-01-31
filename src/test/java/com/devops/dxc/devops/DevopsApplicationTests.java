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

}

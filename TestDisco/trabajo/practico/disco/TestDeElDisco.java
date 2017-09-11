package trabajo.practico.disco;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDeElDisco {

	
	@Test
	public void testQueUtilizaPorDefectoUnConstructor() {
		Disco midisco= new Disco();
		Double radioDelDiscoInterior=midisco.getRadioDelDiscoInterior();
		assertEquals(0.00,radioDelDiscoInterior, 0.0);
	}

	@Test
	public void testQueUtilizaConstructor() {
		Disco midisco= new Disco(2.00, 3.00);
		Double radioDelDiscoInterior=midisco.getRadioDelDiscoInterior();
		assertEquals(3.00,radioDelDiscoInterior, 0.0);
	}
	
	@Test
	public void testQueModificaLosValoresDeLRadioInterior() {
		Disco midisco= new Disco(2.00, 3.00);
		midisco.setRadioDelDiscoInterior(5.00);
		Double radioDelDiscoInterior=midisco.getRadioDelDiscoInterior();
		assertEquals(5.00,radioDelDiscoInterior, 0.0);
	}
	
	@Test
	public void testQueModificaLosValoresDeLRadioExterior() {
		Disco midisco= new Disco(2.00, 3.00);
		midisco.setRadioDelDiscoExterior(7.00);
		Double radioDelDiscoExterior=midisco.getRadioDelDiscoExterior();
		assertEquals(7.00,radioDelDiscoExterior, 0.0);
	}
	
	@Test
	public void testQueCalculaElPerimetroInterior() {
		Disco midisco= new Disco(4.00, 6.00);
		Double perimetroDelDiscoInterior=midisco.PerimetroInteriorDelDisco();
		assertEquals(37.69,perimetroDelDiscoInterior, 0.01);
	}
	
	@Test
	public void testQueCalculaElPerimetroExterior() {
		Disco midisco= new Disco(2.00, 8.00);
		Double perimetroDelDiscoExterior=midisco.PerimetroExteriorDelDisco();
		assertEquals(12.56,perimetroDelDiscoExterior, 0.01);
	}
	
	@Test
	public void testQueCalculaLaSuperficieTotalDelDisco() {
		Disco midisco= new Disco(12.00, 9.00);
		Double superficieDelDiscoTotal=midisco.SuperficieDelDisco();
		assertEquals(706.85,superficieDelDiscoTotal, 0.01);
	}
	
	
}

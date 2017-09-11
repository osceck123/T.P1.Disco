package trabajo.practico.disco;

public class Disco {

	private Double radioDelDiscoInterior;
	private Double radioDelDiscoExterior;
	
	public Disco()
	{
		radioDelDiscoExterior=0.00;
		radioDelDiscoInterior=0.00;
	}
	
	public Disco(Double radioExterior, Double radioInterior)
	{
		this.radioDelDiscoExterior=radioExterior;
		this.radioDelDiscoInterior=radioInterior;
	}

	public Double getRadioDelDiscoInterior() {
		return radioDelDiscoInterior;
	}

	public void setRadioDelDiscoInterior(Double radioDelDiscoInterior) {
		this.radioDelDiscoInterior = radioDelDiscoInterior;
	}

	public Double getRadioDelDiscoExterior() {
		return radioDelDiscoExterior;
	}

	public void setRadioDelDiscoExterior(Double radioDelDiscoExterior) {
		this.radioDelDiscoExterior = radioDelDiscoExterior;
	}
	
	public Double PerimetroInteriorDelDisco()
	{
		Double perimetroInterior=Math.PI*2*radioDelDiscoInterior;
		System.out.println("resultado es  " +perimetroInterior);
		return perimetroInterior;
	}
	
	public Double PerimetroExteriorDelDisco()
	{
		Double perimetroExterior=Math.PI*2*radioDelDiscoExterior;
		System.out.println("resultado es  " +perimetroExterior);
		return perimetroExterior;
	}
	
	public Double SuperficieDelDisco()
	{
		
		Double SuperficieInterior=Math.PI*Math.pow(radioDelDiscoInterior, 2);
		Double SuperficieExterior=Math.PI*Math.pow(radioDelDiscoExterior, 2);
		Double SuperficieTotalDelDisco=(SuperficieExterior+SuperficieInterior);
		System.out.println("superficie Total Del Disco " +SuperficieTotalDelDisco);
		return SuperficieTotalDelDisco;
	}
	
	
	
	
	
	

}

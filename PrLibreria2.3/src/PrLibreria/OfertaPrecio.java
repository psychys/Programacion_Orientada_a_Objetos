package PrLibreria;

public class OfertaPrecio implements OfertaFlex {

	private double porcDescuento;
	private double umbralPrecio;
	
	public OfertaPrecio(double porcDescuento, double umbralPrecio) {
		this.porcDescuento = porcDescuento;
		this.umbralPrecio = umbralPrecio;
	}
	
	public String toString() {
		return this.porcDescuento + "%(" + this.umbralPrecio + ")";
	}
	
	@Override
	public double getDescuento(Libro lib) {
		// TODO Auto-generated method stub
		double descuento = 0;
		if(lib.getPrecioBase() >= this.umbralPrecio) {
			descuento = this.porcDescuento;
		}
		return descuento;
	}

}

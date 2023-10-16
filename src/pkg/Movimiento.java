package pkg;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Movimiento {

	public Double importe;
	public enum Signo{D, H};
	public String detalle;
	
	public Movimiento(Double importe, Signo a, String d) {
		this.importe = importe;
		this.detalle = d;
		this.Signo = a;
	}
	
	
	public Double getImporte() {
		return importe;
	}
	public void setImporte(Double importe) {
		this.importe = importe;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	
	public void Reintegro(Double r) {
		this.importe += r;
		assertEquals(-150, aux.getSaldo());
	}
	
}

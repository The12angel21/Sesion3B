package pkg;

public class Cuenta {

	int saldo;
	public Movimiento movimiento;
	

	public Cuenta(String numero, String titular, int saldo) {
		super();
		this.saldo = saldo;
		movimiento = new movimiento();
	}
	
	public int getSaldo() {
		return this.saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public void ingresar(int i) {
		this.setSaldo(this.getSaldo()+i);
	}

	public void retirar(int i) {
		if(i <= this.getSaldo())
			this.setSaldo(this.getSaldo()-i);
	}
	
}

package Model;

public class CuentaBancaria {
	private String numCuenta;
	private int saldo;
	private Cliente cliente;
	
	public CuentaBancaria(String numCuenta, int saldo, Cliente cliente) {
		this.numCuenta = numCuenta;
		this.saldo = saldo;
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "CuentaBancaria [numCuenta=" + numCuenta + ", saldo=" + saldo + ", cliente=" + cliente + "]\n";
	}

	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}

package Interface;

import Model.CuentaBancaria;

public interface AccionesCuenta {
	public String crearCuenta(String numCuenta, CuentaBancaria cuenta);
	public String consultarSaldo(String numCuenta);
	public String depositar(String numCuenta, int monto);
	public String retirar(String numCuenta, int monto);
	public boolean buscarCuenta(String numCuenta);
}

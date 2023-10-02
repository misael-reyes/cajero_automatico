package Implementacion;

import java.util.HashMap;

import Interface.AccionesCuenta;
import Model.CuentaBancaria;

public class Implementacion implements AccionesCuenta {
	
	HashMap<String, CuentaBancaria> hm = new HashMap<String, CuentaBancaria>();
	
	@Override
	public String crearCuenta(String numCuenta, CuentaBancaria cuenta) {
		// TODO Auto-generated method stub
		hm.put(numCuenta, cuenta);
		return "Registro exitoso, su numero de cuenta es " + numCuenta;
	}

	@Override
	public String consultarSaldo(String numCuenta) {
		// TODO Auto-generated method stub
		int saldo = hm.get(numCuenta).getSaldo();
		return "Su saldo actual es de " + saldo + " pesos";
	}

	@Override
	public String depositar(String numCuenta, int monto) {
		// TODO Auto-generated method stub
		int saldoA = hm.get(numCuenta).getSaldo();
		saldoA += monto;
		hm.get(numCuenta).setSaldo(saldoA);
		return "Deposito exitoso, su saldo actual es de " + saldoA + " pesos";
	}

	@Override
	public String retirar(String numCuenta, int monto) {
		// TODO Auto-generated method stub
		int saldoA = hm.get(numCuenta).getSaldo();
		if(monto <= saldoA) {
				saldoA -= monto;
			hm.get(numCuenta).setSaldo(saldoA);
			return "Retiro exitoso, su saldo actual es de " + saldoA + " pesos";
		}
		return "Saldo insuficiente, su saldo actual es de " + saldoA;
	}

	@Override
	public boolean buscarCuenta(String numCuenta) {
		if(hm.get(numCuenta) == null)
			return false;
		else 
			return true;
		
	}

}

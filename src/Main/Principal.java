package Main;

import java.util.Scanner;

import Implementacion.Implementacion;
import Model.Cliente;
import Model.CuentaBancaria;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String numCuenta;
		int saldo;
		int monto;
		Cliente cliente;
		String nombreC, appC, apmC;
		int terminacion = 1; // esto es para generar la cuenta bancaria
		CuentaBancaria cuenta;

		Scanner lectura = null;
		int menu = 0;
		boolean bandera = true;

		Implementacion imp = new Implementacion();

		do {
			bandera = true;
			while (bandera) {
				try {
					System.out.println("MENU BANCOMER BIENVENIDO");
					System.out.println("1----------ALTA CLIENTE");
					System.out.println("2----------CONSULTAR SALDO");
					System.out.println("3----------DEPOSITO EN EFECTIVO");
					System.out.println("4----------RETIRO EN EFECTIVO");
					System.out.println("5----------SALIR");
					lectura = new Scanner(System.in);
					menu = lectura.nextInt();
					bandera = false;
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Error al ingresar la opcion del menu");
				}
			}

			switch (menu) {
			case 1:
				System.out.println("Ingrese el nombre del cliente");
				lectura = new Scanner(System.in);
				nombreC = lectura.nextLine();

				System.out.println("Ingrese el apellido paterno del cliente");
				lectura = new Scanner(System.in);
				appC = lectura.nextLine();

				System.out.println("Ingrese el apellido materno del cliente");
				lectura = new Scanner(System.in);
				apmC = lectura.nextLine();

				cliente = new Cliente(nombreC, appC, apmC);
				// genero su cuenta
				numCuenta = nombreC.charAt(0) + "" + appC.charAt(0) + "" + apmC.charAt(0) + terminacion;
				terminacion++;
				cuenta = new CuentaBancaria(numCuenta, 0, cliente);
				System.out.println(imp.crearCuenta(numCuenta, cuenta));
				break;
			case 2:
				bandera = true;
				while (bandera) {
					try {
						System.out.println("Ingrese su numero de cuenta");
						lectura = new Scanner(System.in);
						numCuenta = lectura.nextLine();
						System.out.println(imp.consultarSaldo(numCuenta));
						bandera = false;
					} catch (Exception e) {
						// TODO: handle exception
						System.out.println("Numero de cuenta no encontrada, intente de nuevo");
					}
				}
				break;
			case 3:

				try {
					System.out.println("Ingrese su numero de cuenta");
					lectura = new Scanner(System.in);
					numCuenta = lectura.nextLine();

					System.out.println("Ingrese el monto a depositar");
					lectura = new Scanner(System.in);
					monto = lectura.nextInt();

					if (monto > 10000) {
						System.out.println("No puede depositar mas de 10,000 pesos");
					} else if (monto < 0) {
						System.out.println("No puede depositar cantidades negativas");
					} else if (monto % 1000 == 0 || monto % 500 == 0 || monto % 200 == 0 || monto % 100 == 0
							|| monto % 50 == 0 || monto % 20 == 0) {

						System.out.println(imp.depositar(numCuenta, monto));
					} else {
						System.out.println("Solo se aceptan billetes de 1000, 500, 200, 100, 50 y 20 pesos");
					}

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Error");
				}

				break;
			case 4:
				try {
					System.out.println("Ingrese su numero de cuenta");
					lectura = new Scanner(System.in);
					numCuenta = lectura.nextLine();

					System.out.println("Ingrese el monto a retirar");
					lectura = new Scanner(System.in);
					monto = lectura.nextInt();

					if (monto > 10000) {
						System.out.println("No puede depositar mas de 10,000 pesos");
					} else if (monto < 0) {
						System.out.println("No puede depositar cantidades negativas");
					} else if (monto % 1000 == 0 || monto % 500 == 0 || monto % 200 == 0 || monto % 100 == 0
							|| monto % 50 == 0 || monto % 20 == 0) {
						System.out.println(imp.retirar(numCuenta, monto));
						
					} else {
						System.out.println("Solo se aceptan billetes de 1000, 500, 200, 100, 50 y 20 pesos");
					}

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Error");
				}

				break;
			case 5:
				break;
			}
		} while (menu < 5);
	}

}

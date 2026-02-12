package Actividad_2;

import java.util.Scanner;

public class CajeroAutomatico {

	public static void main(String[] args) {
		
		CUENTA cuenta = null;
		
		Scanner sm = new Scanner (System.in);
		
		System.out.println("<<< Ingrese sus datos de Usuario >>>");
		
		System.out.print("Numero de cuenta: ");
		String numero = sm.nextLine();
		
		System.out.print("Nombre del titular: ");
		String nombre = sm.nextLine();
		
		System.out.print("Saldo inicial: ");
		double saldo = sm.nextDouble();
		
		System.out.println("<<< Bienvenido " + nombre + " >>>");
		System.out.println("Seleccione una opcion de cuneta:");
		System.out.println("1. Cuenta Corriente");
		System.out.println("2. Cuenta de Ahorro ");
		System.out.print("Ingrese una opcion: ");
		int opcion = sm.nextInt();
		
		if (opcion == 1) {
			int op;
			System.out.print("Ingrese el limite de sobregiro: ");
			double sobregiro = sm.nextDouble();
			cuenta = new Cuenta_Corriente_ (numero, nombre, saldo, sobregiro);
			
			do {
				System.out.println("--- Cuenta Corriente ---");
				System.out.println("1. Retirar efectivo");
				System.out.println("2. Depositar");
				System.out.println("3. Consulta de Saldo");
				System.out.println("4. Salir");
				System.out.print("Ingrese una opcion: ");
				op = sm.nextInt();
				
				switch (op){
					case 1: {
						System.out.print("Ingrese la cantidad que desea retirar: ");
						double retiro = sm.nextDouble();
						cuenta.retirar(retiro);
					}break;
					
					case 2: {
						System.out.print("Ingrese la cantidad ha dedpositar: ");
						double depo = sm.nextDouble();
						cuenta.depositar(depo);
					} break;
					
					case 3: {
						System.out.println("Saldo actual: " + cuenta.consultaSaldo());
						cuenta.consultaSaldo();
					}  break;
					
					case 4: {
						System.out.println("Saliendo... Gracias por elegirnos...");
					} break; 
					
					default: 
						System.out.println("Opcion invalida");
				}
			} while (op != 4);
				
		} else if (opcion == 2) {
			int opc;
			
			System.out.print("Ingrese la taza de intere (Ejemplo: 0.05 para 5%): ");
			double inte = sm.nextDouble();
			cuenta = new CuentaAhorro (numero, nombre, saldo, inte);
			
			do {
				System.out.println("--- Cuenta de Ahorro ---");
				System.out.println("1. Retirar efectivo");
				System.out.println("2. Depositar");
				System.out.println("3. Consulta de Saldo");
				System.out.println("4. Aplicar interes");
				System.out.println("5. Salir");
				System.out.print("Ingrese una opcion: ");
				opc = sm.nextInt();
				
				switch (opc) {
					case 1: {
						System.out.print("Ingrese la cantidad que desea retirar: ");
						double retiro = sm.nextDouble();
						cuenta.retirar(retiro);
					}break;
				
					case 2: {
						System.out.print("Ingrese el monto ha depositar: ");
						double depo = sm.nextDouble();
						cuenta.depositar(depo);
						} break;
				
					case 3: {
						System.out.println("Saldo actual: " + cuenta.consultaSaldo());	
						} break;
					
					case 4: {
						((CuentaAhorro) cuenta).aplicarIntereses();
						System.out.println("Nuevo Saldo: " + cuenta.consultaSaldo());
						} break;
					
					case 5: {
						System.out.println("Saliendo... Gracias por elegirnos...");
						} break;
					
					default:
						System.out.println("Opcion invalida");
				}
		} while (opc != 5);
		}else {
			System.out.println("Ha ingresado una opcion incorrecta.");
		}sm.close();
	}
}

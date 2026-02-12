package Actividad_2;

public class CuentaAhorro extends CUENTA {
	
	private double tasaInteres;
	
	public CuentaAhorro (String numeroCuenta, String titular, double saldo, double tasaInteres) 
	{
		super(numeroCuenta, titular, saldo);
		this.tasaInteres = tasaInteres;
	}
	
	public double getTasaInteres() {
		return tasaInteres;
	}
	
	public void setTasaInteres(double tasaInteres) {
		this.tasaInteres = tasaInteres;
	}
	
	//Metodo
	@Override  
	public boolean retirar (double monto) {
		if (monto <= 0) {
			return false;
		}
		
		if (getSaldo() >= monto) {
			setSaldo(getSaldo() - monto);
			System.out.println("Retiro Exitoso");
			return true;
		}else {
			System.out.println("Saldo Insuficiente");
			return false;
		}
	}
	
	public void aplicarIntereses () {
		double NuevoSaldo = getSaldo() + (getSaldo() * tasaInteres);
		setSaldo(NuevoSaldo);
	}
	
	
}

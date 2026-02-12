package Actividad_2;

public class Cuenta_Corriente_ extends CUENTA {
	
	private double limiteSobregiro;
	
	public Cuenta_Corriente_ (String numeroCuenta, String titular, double saldo, double limiteSobregiro) 
	{
		super (numeroCuenta, titular, saldo);
		this.limiteSobregiro = limiteSobregiro;
		
	}
	
	public double getLimiteSobregrio() {
		return limiteSobregiro;
	}
	
	public void setLimiteSobregiro(double limiteSobregiro) {
		this.limiteSobregiro = limiteSobregiro;
	}

	//Metodos 
	
	@Override
	
	public boolean retirar (double monto) {
		if (monto <= 0) {
			return false;
		}  
		
		double SaldoDisponible = getSaldo() + limiteSobregiro;

		if (monto <= SaldoDisponible) {
			setSaldo (getSaldo() - monto);
			System.out.println("Retiro Exitoso.");
			return true;
		} else {
			System.out.println("Saldo Insuficiente");
			return false;
		}
		
		
	}
	
	
	
	
	
}

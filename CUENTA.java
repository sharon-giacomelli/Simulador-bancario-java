package Actividad_2;

/* ○ Métodos: 
■ retirar(double monto): abstract, retorna boolean si pudo o no. 
■ depositar(double monto): aumenta saldo. 
■ consultarSaldo(): retorna saldo actual.*/

public abstract class CUENTA {
	
	private String numeroCuenta;
	private String titular;
	private double saldo;
	
	// Atributos: 
	
	public CUENTA (String numeroCuenta, String titular, double saldo) 
	{
		this.numeroCuenta = numeroCuenta;
		this.titular = titular;
		this.saldo = saldo;
			
	}
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	
	public String getTitular() {
		return titular;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	
	public void setTitular (String titular) {
		this.titular = titular;
	}
	
	public void setSaldo (double saldo) {
		this.saldo = saldo;
	}
	
	
	//Metodos: 
	
	public abstract boolean retirar (double monto);
	
	public void depositar (double monto) {
		if (monto > 0) {
			saldo += monto;
			System.out.println("Deposito exitoso.");
		} else {
			System.out.println("Fallo. El deposito debe ser mayor a 0.");
		}
	}
	
	public double consultaSaldo()
	{
		return saldo;
	}
	
	
	
	
	
	
	
	
	
}

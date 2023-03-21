package Main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CuentaBancaria cb = new CuentaBancaria();
		try {
			cb.agregarSaldo(3000);
			cb.agregarSaldo(500);
			
			cb.retirarSaldo(1000);
			cb.agregarSaldo(800);
			cb.solicitarPrestamo(10000);
			cb.obtenerPrestamo();//debe retornar 450
			//cb.modificarCredito(1000);
			
			
		} catch (Exception e) {
		}
	}

}

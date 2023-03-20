package Main;
import java.util.ArrayList;
import java.util.List;

public class CuentaBancaria {
	private List<Double> saldo;
	private double credito;
	private double prestamo;
	private boolean tienePrestamo;

	public CuentaBancaria() {
		saldo = new ArrayList<Double>();
		credito = 0;
		prestamo = 0;
		tienePrestamo = false;
	}

	public void agregarSaldo(double cantidad) {
		if (prestamo > 0) {
			prestamo -= cantidad;
			if (prestamo < 0) {
				saldo.add(saldo.get(saldo.size() - 1) + Math.abs(prestamo));
				prestamo = 0;
				tienePrestamo = false;
			}
		} else {
			saldo.add(saldo.get(saldo.size() - 1) + cantidad);
		}
	}

	public void retirarSaldo(double cantidad) throws Exception {
		if (cantidad > saldo.get(saldo.size() - 1) + credito) {
			throw new Exception("No hay suficiente saldo disponible");
		}
		saldo.add(saldo.get(saldo.size() - 1) - cantidad);
	}

	public double obtenerSaldo() {
		return saldo.get(saldo.size() - 1);
	}

	public void modificarCredito(double cantidad) throws Exception {
		if (saldo.get(saldo.size() - 1) + cantidad < 0) {
			throw new Exception("El nuevo credito no puede ser aplicado");
		}
		credito = cantidad;
	}

	public double obtenerPrestamo() {
		return prestamo;
	}

	public void solicitarPrestamo(double cantidad) throws Exception {
		if (tienePrestamo) {
			throw new Exception("Ya tienes un préstamo en curso");
		}
		for (Double monto : saldo) {
			if (cantidad / 3 > monto) {
				cantidad = monto * 3;
			}
		}
		prestamo = cantidad;
		tienePrestamo = true;
		saldo.add(saldo.get(saldo.size() - 1) + cantidad);
	}
}
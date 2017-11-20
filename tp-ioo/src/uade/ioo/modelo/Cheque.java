package uade.ioo.modelo;

import java.util.Date;
import java.util.Calendar;

public abstract class Cheque {
	protected int numero;
	private Date fechaEmision;
	private double monto;

	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Date getFechaEmision() {
		return fechaEmision;
	}

	public void setFechaEmision(Date fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	public Date getFechaVencimiento() {
		return sumarDiasAFecha(getFechaEmision(), 30);
	}


	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public Cheque(int numero, Date fechaEmision, Date fechaVencimiento, double monto) {
		super();
		this.numero = numero;
		this.fechaEmision = fechaEmision;
		this.monto = monto;
	}

	private static Date sumarDiasAFecha(Date fecha, int dias){
		if (dias==0) return fecha;
		
		Calendar calendar = Calendar.getInstance();
	    calendar.setTime(fecha); 
	    calendar.add(Calendar.DAY_OF_YEAR, dias);  
	    return calendar.getTime(); 
	}
	
	public void SePuedePagarCon(){
	
	}

}

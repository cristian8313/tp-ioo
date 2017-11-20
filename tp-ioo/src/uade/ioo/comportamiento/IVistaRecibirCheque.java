package uade.ioo.comportamiento;

import java.util.Date;

public interface IVistaRecibirCheque {
	int getNumero();
	double getMonto();
	Date getFechaEmision();
	Date getFechaVencimiento();
}

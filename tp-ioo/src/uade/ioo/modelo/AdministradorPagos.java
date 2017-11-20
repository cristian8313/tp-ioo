package uade.ioo.modelo;

import java.util.ArrayList;
import java.util.List;

import uade.ioo.observer.Observado;

public class AdministradorPagos extends Observado{
	private List<Cheque> cheques = new ArrayList<Cheque>();
	
	public List<Cheque> getCheques() {
		return cheques;
	}

	public void setCheques(List<Cheque> cheques) {
		this.cheques = cheques;
	}

	public void registrarChequeTecero(ChequeTerceros cheque) {
		
		this.cheques.add(cheque);
		this.notificarObservadores();
	}
	
	public double getMontoDisponiblePagos() {
		double result = 0;
		
		for(Cheque c: this.cheques) {
			result += c.getMonto();
		}
		
		return result;
	}
	
	public void generarChequeNuevo(ChequePropio cheque) {
		cheque.numero = Chequera.id;
		
		this.cheques.add(cheque);
		
		this.notificarObservadores();
	}
	
	
}
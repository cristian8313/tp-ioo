package uade.ioo.vista.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import uade.ioo.comportamiento.IVistaRecibirCheque;
import uade.ioo.modelo.AdministradorPagos;
import uade.ioo.modelo.ChequeTerceros;

public class AgregarChequeController implements ActionListener {
	private AdministradorPagos modelo;
	private IVistaRecibirCheque vista;
	
	public AgregarChequeController(AdministradorPagos modelo, IVistaRecibirCheque vista) {
		super();
		this.modelo = modelo;
		this.vista = vista;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		ChequeTerceros c = new ChequeTerceros(this.vista.getNumero(), 
				this.vista.getFechaEmision(), this.vista.getFechaVencimiento(), this.vista.getMonto());
		
		this.modelo.registrarChequeTecero(c);
		
	}
	
	
}

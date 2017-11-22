package uade.ioo.modeloVista;

import javax.swing.table.AbstractTableModel;

import uade.ioo.modelo.AdministradorPagos;
import uade.ioo.modelo.Cheque;

public class ModeloChequesUsados extends AbstractTableModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private AdministradorPagos modelo;	
	
	public ModeloChequeUsados (AdministradorPagos modelo) {
		this.modelo = modelo;
	}
	
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return modelo.lista.get(0).size();
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return modelo.lista.getSize();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {

		return modelo.lista.get(rowIndex).get(columnIndex);
		
		
	}

}

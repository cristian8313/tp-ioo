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
	
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {

		return "hola";
		
		
	}

}

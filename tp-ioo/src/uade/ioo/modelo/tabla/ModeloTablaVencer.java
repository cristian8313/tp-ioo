package uade.ioo.modelo.tabla;

import javax.swing.table.AbstractTableModel;

public class ModeloTablaVencer extends AbstractTableModel {

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public Object getValueAt(int fila, int col) {
		if (fila == 0) {
			if (col == 0) {
				return "Numero de Cheque";
			}
			if (col == 1) {
				return "Vencimiento";
			}
			if (col == 2) {
				return "Depósito";
			}
		}
		return Integer.toString(fila) + "-" + Integer.toString(col);
	}
}

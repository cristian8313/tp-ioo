package uade.ioo.vista.formularios;

import javax.swing.JFrame;
import javax.swing.JTable;

import uade.ioo.modelo.tabla.ModeloTablaVencer;

public class JFormularioChequeTerVencer extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public JFormularioChequeTerVencer(){
			this.setTitle("Listado de cheques próximos a vencer");
			this.setSize(640, 480);
			this.setLocationRelativeTo(null);
			JTable tabla = new JTable(new ModeloTablaVencer());
			this.getContentPane().add(tabla);
	}
}

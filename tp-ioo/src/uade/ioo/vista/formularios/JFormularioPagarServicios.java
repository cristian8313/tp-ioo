package uade.ioo.vista.formularios;


import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;

import uade.ioo.modelo.AdministradorPagos;
import uade.ioo.modeloVista.ModeloChequesUsados;

public class JFormularioPagarServicios extends JFormularioBase{
	
	JTextField txtMontoPagar = new JTextField();
	JButton btnPagar = new JButton("Determinar Cheques a Usar");
	JTable tabla;
	

	public JFormularioPagarServicios(AdministradorPagos modelo) {
		super(modelo);
		// TODO Auto-generated constructor stub
		this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
		
		this.getContentPane().add(new JLabel("Monto a pagar"));
		this.getContentPane().add(txtMontoPagar);
		this.getContentPane().add(btnPagar);
		btnPagar.setMaximumSize(getMaximumSize());
		
		this.tabla = new JTable(new ModeloChequesUsados());
		this.getContentPane().add(tabla);
		
		
		
	}
	
	private static final long serialVersionUID=1L;

	
}

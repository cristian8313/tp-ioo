package uade.ioo.vista.formularios;

import java.util.Date;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import uade.ioo.comportamiento.IVistaRecibirCheque;
import uade.ioo.modelo.AdministradorPagos;
import uade.ioo.vista.controlador.AgregarChequeController;

public class JFormularioRegCheqTerceros extends JFormularioBase implements IVistaRecibirCheque {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JTextField txtMonto = new JTextField();
	private JTextField txtNumero = new JTextField();
	private JTextField txtFechaEmision = new JTextField();
	private JButton btnAgregarCheque = new JButton("Registrar");

	public JFormularioRegCheqTerceros(AdministradorPagos modelo) {
		super(modelo);
		this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
		
		this.getContentPane().add(new JLabel("Numero: "));
		this.getContentPane().add(txtNumero);
		this.getContentPane().add(new JLabel("Monto: "));
		this.getContentPane().add(txtMonto);
		this.getContentPane().add(new JLabel("Fecha Emision: "));
		this.getContentPane().add(txtFechaEmision);
		this.getContentPane().add(btnAgregarCheque);
		
		this.btnAgregarCheque.addActionListener(
				new AgregarChequeController(
						this.getModelo(),
						this
						));
		
		btnAgregarCheque.setMaximumSize(getMaximumSize());

}

	@Override
	public int getNumero() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getMonto() {
		// TODO Auto-generated method stub
		return Integer.parseInt(this.txtMonto.getText());
	}

	@Override
	public Date getFechaEmision() {
		return null;
	}

	@Override
	public Date getFechaVencimiento() {
		// TODO Auto-generated method stub
		return null;
	}
}

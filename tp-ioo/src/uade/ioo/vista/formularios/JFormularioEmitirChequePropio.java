package uade.ioo.vista.formularios;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JFormularioEmitirChequePropio extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JLabel lblNumeroCheque;
	private JLabel lblFechaEmisionCheque;
	private JLabel lblMontoCheque;
	
	private JButton btnRegistrarCheque;
	
	private JTextField txtNumeroCheque;
	private JTextField txtFechaEmisionCheque;
	private JTextField txtMontoCheque;
	
	public JFormularioEmitirChequePropio(){
		this.getContentPane().setLayout(
				new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS)
		);
		
		
		this.lblNumeroCheque = new JLabel();
		this.lblNumeroCheque.setText("Número de cheque: ");
		
		this.txtNumeroCheque = new JTextField();
		this.txtNumeroCheque.setText("");

		this.lblMontoCheque = new JLabel();
		this.lblMontoCheque.setText("Monto: ");
		
		this.txtMontoCheque = new JTextField();
		this.txtMontoCheque.setText("");
			
		this.lblFechaEmisionCheque = new JLabel();
		this.lblFechaEmisionCheque.setText("Fecha emisión: ");
		
		this.txtFechaEmisionCheque = new JTextField();
		this.txtFechaEmisionCheque.setText("");
		
		this.btnRegistrarCheque = new JButton();
		this.btnRegistrarCheque.setText("Registrar");
	
		
		this.setSize(300, 300);
		this.setLocationRelativeTo(null);
		
		
		//Agrego al panel principal
		
		this.getContentPane().add(lblNumeroCheque);
		this.getContentPane().add(txtNumeroCheque);
		this.getContentPane().add(lblMontoCheque);
		this.getContentPane().add(txtMontoCheque);
		this.getContentPane().add(lblFechaEmisionCheque);
		this.getContentPane().add(txtFechaEmisionCheque);
		this.getContentPane().add(btnRegistrarCheque);
	}
}

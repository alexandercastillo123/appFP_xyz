package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm01 extends JFrame {
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm01 frame = new frm01();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 250);
		setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblVarones = new JLabel("Varones :");
		lblVarones.setBounds(50, 50, 80, 30);
		getContentPane().add(lblVarones);
		
		JLabel lblMujeres = new JLabel("Mujeres :");
		lblMujeres.setBounds(50, 90, 80, 30);
		getContentPane().add(lblMujeres);
		
		JLabel lblPVarones = new JLabel("%");
		lblPVarones.setBounds(200, 50, 80, 30);
		getContentPane().add(lblPVarones);
		
		JLabel lblPMujeres = new JLabel("%");
		lblPMujeres.setBounds(200, 90, 80, 30);
		getContentPane().add(lblPMujeres);
		
		JTextField txtVarones = new JTextField();
		txtVarones.setBounds(130, 50, 60, 30);
		txtVarones.setHorizontalAlignment(SwingConstants.RIGHT);
		txtVarones.setMargin( new Insets(5, 10, 5, 10) );
		getContentPane().add(txtVarones);
		
		JTextField txtMujeres = new JTextField();
		txtMujeres.setBounds(130, 90, 60, 30);
		txtMujeres.setHorizontalAlignment(SwingConstants.RIGHT);
		txtMujeres.setMargin( new Insets(5, 10, 5, 10) );
		getContentPane().add(txtMujeres);
		
		JButton btbutton= new JButton("Calcular");
		btbutton.setBounds(80, 150, 100, 30);
		btbutton.setHorizontalAlignment(SwingConstants.RIGHT);
		btbutton.setMargin( new Insets(5, 10, 5, 10) );
		getContentPane().add(btbutton);
		
		
		
	}
	
}
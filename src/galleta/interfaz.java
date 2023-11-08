package galleta;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class interfaz {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					interfaz window = new interfaz();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public interfaz() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 128, 64));
		frame.getContentPane().setLayout(null);
		
		JLabel Nombre = new JLabel("1.Me llamo Hamza Boubou");
		Nombre.setBounds(46, 64, 162, 14);
		frame.getContentPane().add(Nombre);
		
		JLabel diahora = new JLabel("03/11/2023 17:15");
		diahora.setBounds(46, 107, 104, 14);
		frame.getContentPane().add(diahora);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setForeground(Color.BLACK);
		btnCancel.setBackground(new Color(0, 255, 255));
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnCancel.setBounds(45, 179, 89, 23);
		frame.getContentPane().add(btnCancel);
		
		JButton hecho = new JButton("Galleta del dia");
		hecho.setBackground(new Color(240, 240, 240));
		hecho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Que esperaste? HAHAHAHAHAHAHAHAHA");
			}
		});
		hecho.setBounds(222, 179, 150, 23);
		frame.getContentPane().add(hecho);
	}
}

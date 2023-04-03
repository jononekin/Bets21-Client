package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import service.BLFacade;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ResourceBundle;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class LoginGUI extends JFrame {

	private JPanel contentPane;
	private JTextField l;
	private JTextField p;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginGUI frame = new LoginGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton(ResourceBundle.getBundle("Etiquetas").getString("loginGUI.entry"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				BLFacade facade = MainGUI.getBusinessLogic();
				System.out.println(facade.isLogin(l.getText(),p.getText()));

			}
		});
		btnNewButton.setBounds(143, 143, 117, 29);
		contentPane.add(btnNewButton);
		
		l = new JTextField();
		l.setBounds(177, 40, 130, 26);
		contentPane.add(l);
		l.setColumns(10);
		
		p = new JTextField();
		p.setBounds(177, 97, 130, 26);
		contentPane.add(p);
		p.setColumns(10);
	}
}

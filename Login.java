import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		textField = new JTextField();
		textField.setBounds(68, 69, 278, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel Login = new JLabel("Login");
		Login.setToolTipText("Login");
		Login.setBounds(33, 72, 46, 14);
		contentPane.add(Login);
		
		JLabel lblNewLabel = new JLabel("Senha");
		lblNewLabel.setBounds(33, 115, 46, 14);
		contentPane.add(lblNewLabel);
		
		textField_1 = new JPasswordField();
		textField_1.setBounds(75, 112, 271, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnOk = new JButton("Ok");
		btnOk.setBounds(163, 172, 89, 23);
		contentPane.add(btnOk);
		btnOk.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (validacao(textField.getText(), new String(textField_1.getPassword()))) {
					JOptionPane.showMessageDialog(null, "Senha correta, Sistema Ativado");
				
				}
				else {
					JOptionPane.showMessageDialog(null, "Senha incorreta, tente novamente");
				}
				
			}
			});}
	public boolean validacao(String Login, String Senha) {
		return Login.equals("admin")&& Senha.equals("swordfish");
	}
}

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.DropMode;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import java.awt.Panel;
import javax.swing.JFormattedTextField;
import javax.swing.JToggleButton;
import javax.swing.JProgressBar;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class Frame2 extends JFrame {

	private JPanel contentPane;
	private JTextField Atext;
	private JTextField Btext;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame2 frame = new Frame2();
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
	
	public Frame2() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 472, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Atext = new JTextField();
		Atext.setBounds(56, 53, 197, 20);
		contentPane.add(Atext);
		Atext.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("A");
		lblNewLabel.setBounds(31, 56, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel textB = new JLabel("B");
		textB.setBounds(31, 84, 46, 14);
		contentPane.add(textB);
		
		Btext = new JTextField();
		Btext.setBounds(56, 84, 197, 20);
		contentPane.add(Btext);
		Btext.setColumns(10);
		
		JButton NumberButton = new JButton("Mostrar Numeros");
		NumberButton.setBounds(110, 132, 143, 23);
		contentPane.add(NumberButton);
		
		JTextArea CaixaTxt = new JTextArea();
		CaixaTxt.setBounds(1, 1, 163, 195);
		CaixaTxt.setWrapStyleWord(true);
		CaixaTxt.setEditable(false);
		CaixaTxt.setLineWrap(true);
		contentPane.add(CaixaTxt);
		
		JScrollPane scrollBar = new JScrollPane(CaixaTxt);
		scrollBar.setBounds(281, 53, 165, 197);
		contentPane.add(scrollBar);
		
		NumberButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				int A = Integer.parseInt(Atext.getText());
				int B = Integer.parseInt(Btext.getText());
				int C = A;
				
				if ((A<B)&((B-A)>1)) {
				CaixaTxt.setText("");
				C++;
				CaixaTxt.setText(CaixaTxt.getText() + C);
				while(C<(B-1)){
					CaixaTxt.setText(CaixaTxt.getText() + " - ");	
				C++;
				CaixaTxt.setText (CaixaTxt.getText() + C);
				
				}
				}
			else {
				JOptionPane.showMessageDialog(null, "Valores inválidos, Intervalo Inexistente");
				
			}}
			
			
		});
		
		
	}
}

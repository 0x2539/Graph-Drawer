import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;
import javax.swing.event.TreeSelectionListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;
import java.awt.Color;


public class Main {

	private JFrame frame;
	private JTextField textFieldA;
	private JTextField textFieldB;
	private JTextField textFieldC;
	private JTextField textFieldIntevalST;
	private JTextField textFieldIntevalDR;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
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
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 528, 678);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Sistem.wOX = 410;
		Sistem.hOY = 410;
		
		Sistem.xOX = 0;
		Sistem.yOX = Sistem.hOY / 2;
		
		Sistem.xOY = Sistem.wOX / 2;
		Sistem.yOY = Sistem.hOY;
		
		final PanelLectii panelSistemCoordonate = new PanelLectii();
		panelSistemCoordonate.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panelSistemCoordonate.setBounds(55, 205, 410, 410);
		frame.getContentPane().add(panelSistemCoordonate);
		
		JLabel lblSistemulCartezianXoy = new JLabel("The function's graph: ");
		lblSistemulCartezianXoy.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblSistemulCartezianXoy.setBounds(54, 172, 150, 22);
		frame.getContentPane().add(lblSistemulCartezianXoy);
		
		JLabel lblX = new JLabel("X");
		lblX.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblX.setBounds(142, 64, 20, 22);
		frame.getContentPane().add(lblX);
		
		JLabel label_1 = new JLabel("2");
		label_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		label_1.setBounds(153, 58, 20, 22);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("+");
		label_2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		label_2.setBounds(172, 64, 20, 22);
		frame.getContentPane().add(label_2);
		
		textFieldA = new JTextField();
		textFieldA.setText("1");
		textFieldA.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		textFieldA.setColumns(10);
		textFieldA.setBounds(99, 64, 33, 22);
		frame.getContentPane().add(textFieldA);
		
		JLabel label_3 = new JLabel("X");
		label_3.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		label_3.setBounds(233, 64, 20, 22);
		frame.getContentPane().add(label_3);
		
		textFieldB = new JTextField();
		textFieldB.setText("1");
		textFieldB.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		textFieldB.setColumns(10);
		textFieldB.setBounds(190, 64, 33, 22);
		frame.getContentPane().add(textFieldB);
		
		textFieldC = new JTextField();
		textFieldC.setText("1");
		textFieldC.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		textFieldC.setColumns(10);
		textFieldC.setBounds(268, 64, 33, 22);
		frame.getContentPane().add(textFieldC);
		
		JLabel label_4 = new JLabel("+");
		label_4.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		label_4.setBounds(250, 64, 20, 22);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("= 0");
		label_5.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		label_5.setBounds(311, 64, 59, 22);
		frame.getContentPane().add(label_5);
		
		JLabel lblDomeniulDeDefinitie = new JLabel("The range of the function:");
		lblDomeniulDeDefinitie.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblDomeniulDeDefinitie.setBounds(78, 31, 162, 22);
		frame.getContentPane().add(lblDomeniulDeDefinitie);
		
		textFieldIntevalST = new JTextField();
		textFieldIntevalST.setText("-720");
		textFieldIntevalST.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		textFieldIntevalST.setColumns(10);
		textFieldIntevalST.setBounds(237, 32, 64, 22);
		frame.getContentPane().add(textFieldIntevalST);
		
		textFieldIntevalDR = new JTextField();
		textFieldIntevalDR.setText("720");
		textFieldIntevalDR.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		textFieldIntevalDR.setColumns(10);
		textFieldIntevalDR.setBounds(306, 32, 64, 22);
		frame.getContentPane().add(textFieldIntevalDR);
		
		JButton btnNewButton = new JButton("Draw the function");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Sistem.deseneazaFCT = true;
				
				try
				{
					Sistem.intervalDR = Integer.parseInt(textFieldIntevalDR.getText());
					Sistem.intervalST = Integer.parseInt(textFieldIntevalST.getText());
					Sistem.a = Integer.parseInt(textFieldA.getText());
					Sistem.b = Integer.parseInt(textFieldB.getText());
					Sistem.c = Integer.parseInt(textFieldC.getText());
				}
				catch(Exception ex)
				{
					
				}
				
				panelSistemCoordonate.repaint();
			}
		});
		btnNewButton.setBounds(78, 126, 192, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnDesenatiFunctiaSinus = new JButton("Draw the sinus function");
		btnDesenatiFunctiaSinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Sistem.deseneazaFCT = false;

				try
				{
					Sistem.intervalDR = Integer.parseInt(textFieldIntevalDR.getText());
					Sistem.intervalST = Integer.parseInt(textFieldIntevalST.getText());
					Sistem.a = Integer.parseInt(textFieldA.getText());
					Sistem.b = Integer.parseInt(textFieldB.getText());
					Sistem.c = Integer.parseInt(textFieldC.getText());
				}
				catch(Exception ex)
				{
					
				}
				
				panelSistemCoordonate.repaint();
			}
		});
		btnDesenatiFunctiaSinus.setBounds(280, 126, 165, 23);
		frame.getContentPane().add(btnDesenatiFunctiaSinus);

	}
}


class Sistem
{
	public static int currentPage = -1;
	public static boolean isTeorie = false, isVectori = false;
	
	public static boolean deseneazaFCT;
	
	public static long intervalST = -720, intervalDR = 720, 
			a = 1, b = 1, c = 1;
	
	public static int xOX, yOX, xOY, yOY, wOX, hOY;
	
}

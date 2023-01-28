package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class beta_01 extends JDialog {
	private JButton btnuno;
	private JButton btncuatro;
	private JButton btnsiete;
	private JButton btnmas;
	private JButton btndos;
	private JButton btncinco;
	private JButton btnocho;
	private JButton btncero;
	private JButton btntres;
	private JButton btnseis;
	private JButton btnnueve;
	private JButton btnmenos;
	private JButton btnigual;
	private JTextField txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			beta_01 dialog = new beta_01();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	// =====================================================================
	// VARIABLES GLOBALES
	double numero1, numero2, resultado;
	String operacion;
	private JButton ctnC;
	private JButton btnx;
	private JButton btnentre;
	private JButton btnPunto;

	public beta_01() {
		setBounds(100, 100, 425, 443);
		getContentPane().setLayout(null);

		btnuno = new JButton("1");
		btnuno.setBackground(SystemColor.inactiveCaptionBorder);
		btnuno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// capturamos la pantalla y encadenamos la captura del boton
				// ademas cada que precionem0os el boton este ingresara la variable
				String ingreseNumero = txtS.getText() + btnuno.getText();
				txtS.setText(ingreseNumero);
			}
		});
		btnuno.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnuno.setBounds(20, 179, 89, 46);
		getContentPane().add(btnuno);

		btndos = new JButton("2");
		btndos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ingreseNumero = txtS.getText() + btndos.getText();
				txtS.setText(ingreseNumero);
			}
		});
		btndos.setFont(new Font("Tahoma", Font.BOLD, 16));
		btndos.setBounds(119, 179, 89, 46);
		getContentPane().add(btndos);

		btntres = new JButton("3");
		btntres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ingreseNumero = txtS.getText() + btntres.getText();
				txtS.setText(ingreseNumero);
			}
		});
		btntres.setFont(new Font("Tahoma", Font.BOLD, 16));
		btntres.setBounds(218, 179, 89, 46);
		getContentPane().add(btntres);

		btncuatro = new JButton("4");
		btncuatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ingreseNumero = txtS.getText() + btncuatro.getText();
				txtS.setText(ingreseNumero);
			}
		});
		btncuatro.setFont(new Font("Tahoma", Font.BOLD, 16));
		btncuatro.setBounds(20, 236, 89, 44);
		getContentPane().add(btncuatro);

		btncinco = new JButton("5");
		btncinco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ingreseNumero = txtS.getText() + btncinco.getText();
				txtS.setText(ingreseNumero);
			}
		});
		btncinco.setFont(new Font("Tahoma", Font.BOLD, 16));
		btncinco.setBounds(119, 236, 89, 44);
		getContentPane().add(btncinco);

		btnseis = new JButton("6");
		btnseis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ingreseNumero = txtS.getText() + btnseis.getText();
				txtS.setText(ingreseNumero);
			}
		});
		btnseis.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnseis.setBounds(218, 236, 89, 44);
		getContentPane().add(btnseis);

		btnsiete = new JButton("7");
		btnsiete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ingreseNumero = txtS.getText() + btnsiete.getText();
				txtS.setText(ingreseNumero);
			}
		});
		btnsiete.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnsiete.setBounds(20, 291, 89, 40);
		getContentPane().add(btnsiete);

		btnocho = new JButton("8");
		btnocho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ingreseNumero = txtS.getText() + btnocho.getText();
				txtS.setText(ingreseNumero);
			}
		});
		btnocho.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnocho.setBounds(119, 291, 89, 40);
		getContentPane().add(btnocho);

		btnnueve = new JButton("9");
		btnnueve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ingreseNumero = txtS.getText() + btnnueve.getText();
				txtS.setText(ingreseNumero);
			}
		});
		btnnueve.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnnueve.setBounds(218, 291, 89, 40);
		getContentPane().add(btnnueve);

		btncero = new JButton("0");
		btncero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ingreseNumero = txtS.getText() + btncero.getText();
				txtS.setText(ingreseNumero);
			}
		});
		btncero.setFont(new Font("Tahoma", Font.BOLD, 16));
		btncero.setBounds(119, 342, 89, 44);
		getContentPane().add(btncero);

		btnmas = new JButton("+");
		btnmas.setForeground(Color.RED);
		btnmas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				numero1 = Double.parseDouble(txtS.getText());
				txtS.setText("");
				operacion = "+";

			}
		});
		btnmas.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnmas.setBounds(310, 180, 89, 44);
		getContentPane().add(btnmas);

		btnmenos = new JButton("-");
		btnmenos.setForeground(Color.RED);
		btnmenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtS.getText());
				txtS.setText("");
				operacion = "-";

			}
		});
		btnmenos.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnmenos.setBounds(310, 236, 89, 44);
		getContentPane().add(btnmenos);

		btnigual = new JButton("=");
		btnigual.setForeground(Color.RED);
		btnigual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String seleccionar;
				numero2 = Double.parseDouble(txtS.getText());

				try {

					if (operacion == "+") {
						resultado = numero1 + numero2;
						seleccionar = String.format("%.0f", resultado);
						txtS.setText(seleccionar);

					} else if (operacion == "-") {
						resultado = numero1 - numero2;
						seleccionar = String.format("%.0f", resultado);
						txtS.setText(seleccionar);

					} else if (operacion == "x") {
						resultado = numero1 * numero2;
						seleccionar = String.format("%.0f", resultado);
						txtS.setText(seleccionar);

					} else if (operacion == "/") {
						resultado = numero1 / numero2;
						seleccionar = String.format("%.0f", resultado);
						txtS.setText(seleccionar);

					}

				} catch (ArithmeticException ae) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Hi, In the message box", "PopUp Dialog",
							JOptionPane.INFORMATION_MESSAGE);
				}

			}
		});
		btnigual.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnigual.setBounds(310, 344, 89, 40);
		getContentPane().add(btnigual);

		txtS = new JTextField();
		txtS.setFont(new Font("Tahoma", Font.PLAIN, 23));
		txtS.setBackground(SystemColor.activeCaption);
		txtS.setHorizontalAlignment(SwingConstants.TRAILING);
		txtS.setBounds(10, 24, 389, 99);
		getContentPane().add(txtS);
		txtS.setColumns(10);

		ctnC = new JButton("C");
		ctnC.setForeground(Color.RED);
		ctnC.setFont(new Font("Tahoma", Font.PLAIN, 24));
		ctnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtS.setText("");
			}
		});
		ctnC.setBounds(310, 134, 89, 34);
		getContentPane().add(ctnC);

		btnx = new JButton("X");
		btnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtS.getText());
				txtS.setText("");
				operacion = "x";

			}
		});
		btnx.setForeground(Color.RED);
		btnx.setBounds(310, 291, 89, 40);
		getContentPane().add(btnx);

		btnentre = new JButton("/");
		btnentre.setForeground(Color.RED);
		btnentre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtS.getText());
				txtS.setText("");
				operacion = "/";

			}
		});
		btnentre.setBounds(218, 342, 89, 41);
		getContentPane().add(btnentre);

		btnPunto = new JButton(".");
		btnPunto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtS.getText());
				txtS.setText("");

			}
		});
		btnPunto.setForeground(Color.RED);
		btnPunto.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPunto.setBounds(20, 342, 89, 41);
		getContentPane().add(btnPunto);
	}
}

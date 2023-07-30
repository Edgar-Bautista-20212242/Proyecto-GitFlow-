package Final;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Inicio extends JPanel {

	/**
	 * Create the panel.
	 */
	public Inicio() {
		setLayout(null);
		
		JPanel PanelCenter = new JPanel();
		PanelCenter.setLayout(null);
		PanelCenter.setBorder(null);
		PanelCenter.setBackground(new Color(30, 30, 30));
		PanelCenter.setBounds(0, 0, 780, 684);
		add(PanelCenter);
		
		JLabel LabelTop = new JLabel("Bienvenido");
		LabelTop.setHorizontalAlignment(SwingConstants.CENTER);
		LabelTop.setForeground(Color.WHITE);
		LabelTop.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 28));
		LabelTop.setBounds(0, 0, 780, 68);
		PanelCenter.add(LabelTop);
		
		JLabel LabelACR = new JLabel("Actividad Reciente");
		LabelACR.setHorizontalAlignment(SwingConstants.CENTER);
		LabelACR.setForeground(Color.WHITE);
		LabelACR.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 20));
		LabelACR.setBounds(0, 95, 780, 68);
		PanelCenter.add(LabelACR);
		
		PanelRound PanelAc = new PanelRound();
		PanelAc.setLayout(null);
		PanelAc.setRoundTopRight(45);
		PanelAc.setRoundTopLeft(45);
		PanelAc.setRoundBottomRight(45);
		PanelAc.setRoundBottomLeft(45);
		PanelAc.setBackground(new Color(82, 117, 144));
		PanelAc.setBounds(108, 231, 256, 160);
		PanelCenter.add(PanelAc);
		
		JLabel LabelVH = new JLabel("Ventas Hoy");
		LabelVH.setForeground(new Color(253, 245, 230));
		LabelVH.setHorizontalAlignment(SwingConstants.CENTER);
		LabelVH.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 18));
		LabelVH.setBounds(0, 0, 256, 45);
		PanelAc.add(LabelVH);
		
		PanelRound PanelAc1 = new PanelRound();
		PanelAc1.setLayout(null);
		PanelAc1.setRoundTopRight(45);
		PanelAc1.setRoundTopLeft(45);
		PanelAc1.setRoundBottomRight(45);
		PanelAc1.setRoundBottomLeft(45);
		PanelAc1.setBackground(new Color(81, 124, 99));
		PanelAc1.setBounds(408, 231, 256, 160);
		PanelCenter.add(PanelAc1);
		
		JLabel lblGananciasTotalesHoy = new JLabel("Ganancias Totales Hoy");
		lblGananciasTotalesHoy.setForeground(new Color(253, 245, 230));
		lblGananciasTotalesHoy.setHorizontalAlignment(SwingConstants.CENTER);
		lblGananciasTotalesHoy.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 16));
		lblGananciasTotalesHoy.setBounds(0, 0, 256, 45);
		PanelAc1.add(lblGananciasTotalesHoy);
		
		PanelRound PanelAc3 = new PanelRound();
		PanelAc3.setLayout(null);
		PanelAc3.setRoundTopRight(45);
		PanelAc3.setRoundTopLeft(45);
		PanelAc3.setRoundBottomRight(45);
		PanelAc3.setRoundBottomLeft(45);
		PanelAc3.setBackground(new Color(246, 198, 169));
		PanelAc3.setBounds(408, 419, 256, 160);
		PanelCenter.add(PanelAc3);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Gastos Totales Hoy");
		lblNewLabel_1_1_1.setForeground(new Color(253, 245, 230));
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 16));
		lblNewLabel_1_1_1.setBounds(0, 0, 256, 45);
		PanelAc3.add(lblNewLabel_1_1_1);
		
		PanelRound PanelAC2 = new PanelRound();
		PanelAC2.setLayout(null);
		PanelAC2.setRoundTopRight(45);
		PanelAC2.setRoundTopLeft(45);
		PanelAC2.setRoundBottomRight(45);
		PanelAC2.setRoundBottomLeft(45);
		PanelAC2.setBackground(new Color(214, 117, 115));
		PanelAC2.setBounds(108, 419, 256, 160);
		PanelCenter.add(PanelAC2);
		
		JLabel LabelCobrar = new JLabel("Cuentas Pendientes Para Hoy");
		LabelCobrar.setForeground(new Color(253, 245, 230));
		LabelCobrar.setHorizontalAlignment(SwingConstants.CENTER);
		LabelCobrar.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 16));
		LabelCobrar.setBounds(0, 0, 256, 45);
		PanelAC2.add(LabelCobrar);

	}
}

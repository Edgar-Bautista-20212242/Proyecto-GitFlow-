package Final;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class CuentasPorCobrar extends JPanel {

	/**
	 * Create the panel.
	 */
	public CuentasPorCobrar() {
		setLayout(null);
		
		JPanel PanelCenter = new JPanel();
		PanelCenter.setLayout(null);
		PanelCenter.setBorder(null);
		PanelCenter.setBackground(new Color(30, 30, 30));
		PanelCenter.setBounds(0, 0, 780, 684);
		add(PanelCenter);
		
		JLabel lblCuentasPorCobrar = new JLabel("Cuentas por Cobrar");
		lblCuentasPorCobrar.setHorizontalAlignment(SwingConstants.CENTER);
		lblCuentasPorCobrar.setForeground(Color.WHITE);
		lblCuentasPorCobrar.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 28));
		lblCuentasPorCobrar.setBounds(0, 0, 780, 68);
		PanelCenter.add(lblCuentasPorCobrar);

	}

}

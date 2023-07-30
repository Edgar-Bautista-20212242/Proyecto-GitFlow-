package Final;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Estado extends JPanel {

	/**
	 * Create the panel.
	 */
	public Estado() {
		setLayout(null);
		
		JPanel PanelCenter = new JPanel();
		PanelCenter.setLayout(null);
		PanelCenter.setBorder(null);
		PanelCenter.setBackground(new Color(30, 30, 30));
		PanelCenter.setBounds(0, 0, 780, 684);
		add(PanelCenter);
		
		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setHorizontalAlignment(SwingConstants.CENTER);
		lblEstado.setForeground(Color.WHITE);
		lblEstado.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 28));
		lblEstado.setBounds(0, 0, 780, 68);
		PanelCenter.add(lblEstado);

	}

}

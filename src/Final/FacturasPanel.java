package Final;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;

public class FacturasPanel extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public FacturasPanel() {
		setLayout(null);
		
		JPanel PanelCenter = new JPanel();
		PanelCenter.setBackground(new Color(30, 30,30));
		PanelCenter.setBounds(0, 0, 780, 684);
		add(PanelCenter);
		PanelCenter.setLayout(null);
		
		JLabel LabelTop = new JLabel("Facturas");
		LabelTop.setHorizontalAlignment(SwingConstants.CENTER);
		LabelTop.setForeground(Color.WHITE);
		LabelTop.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 28));
		LabelTop.setBounds(0, 0, 780, 68);
		PanelCenter.add(LabelTop);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(Color.BLACK);
		scrollPane.setForeground(Color.WHITE);
		scrollPane.setViewportBorder(new LineBorder(new Color(0, 0, 0)));
		scrollPane.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		scrollPane.setBounds(20, 100, 580, 500);
		PanelCenter.add(scrollPane);
		
		table = new JTable();
		table.setGridColor(Color.WHITE);
		table.setIntercellSpacing(new Dimension(0, 0));
		table.setRowHeight(20);
		table.setRowMargin(0);
		table.setFont(new Font("Poiret One", Font.PLAIN, 16));
		table.setBorder(null);
		table.setBackground(new Color(30,30, 30));
		table.getTableHeader().setBackground(new Color(30,30,30));
		table.getTableHeader().setForeground(Color.WHITE);
		table.getTableHeader().setFont(new Font("Edu TAS Beginner", Font.PLAIN, 18));
		table.getTableHeader().setEnabled(false);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"IdFactura", "IdCliente", "Estado", "FechaDImpresion"
			}
		));
		table.setFillsViewportHeight(true);
		scrollPane.setViewportView(table);
		
		PanelRound BTNDet = new PanelRound();
		BTNDet.setLayout(null);
		BTNDet.setRoundTopRight(30);
		BTNDet.setRoundTopLeft(30);
		BTNDet.setRoundBottomRight(30);
		BTNDet.setRoundBottomLeft(30);
		BTNDet.setBorder(null);
		BTNDet.setBackground(new Color(30, 30, 30));
		BTNDet.setBounds(622, 284, 120, 45);
		PanelCenter.add(BTNDet);
		
		JLabel LabelDet = new JLabel();
		LabelDet.setText("<html>"+"Detalles"+"<p>"+"Factura"+"<html>");
		LabelDet.setHorizontalAlignment(SwingConstants.CENTER);
		LabelDet.setForeground(Color.WHITE);
		LabelDet.setFont(new Font("Edu TAS Beginner", Font.PLAIN, 18));
		LabelDet.setBounds(0, 0, 120, 48);
		BTNDet.add(LabelDet);
	}
}

package experimentosEXTRA;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TestJO {
	public static void main(String[] args) {
		JPanel panel = new JPanel();
		ImageIcon icon = new ImageIcon("C:\\Users\\USUARIO\\Downloads\\CONFINGS POTHOSHOP\\mrrobot.jpg");
		JLabel label = new JLabel(icon);
		panel.add(label);
		String name = "";
		name = JOptionPane.showInputDialog(null, "Digite seu nome:");
		JOptionPane.showMessageDialog(null, panel, name, JOptionPane.PLAIN_MESSAGE);
	}
}
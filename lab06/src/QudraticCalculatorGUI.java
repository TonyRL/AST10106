import javax.swing.JOptionPane;
public class QudraticCalculatorGUI
{
	public static void main(String[] args)
	{
		String strA,strB,strC;
		double a, b, c, x1, x2, d;
		
		strA = JOptionPane.showInputDialog("Please enter the value of a");
		a = Double.parseDouble(strA);
		strB = JOptionPane.showInputDialog("Please enter the value of b");
		b = Double.parseDouble(strB);
		strC = JOptionPane.showInputDialog("Please enter the value of c");
		c = Double.parseDouble(strC);
		
		d = Math.pow(b, 2) - 4 * a * c;
		x1 = (-b + Math.sqrt(d) ) / (2 * a);
		x2 = (-b - Math.sqrt(d) ) / (2 * a);
		
		JOptionPane.showMessageDialog(null,"The two solutions are\n" + "x1 = "+ x1 +"\nx2 = " + x2);
	
	}

}

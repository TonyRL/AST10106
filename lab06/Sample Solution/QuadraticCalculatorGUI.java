import javax.swing.JOptionPane;
public class QuadraticCalculatorGUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a, b, c, delta;
		
		// Taking input from a dialog box for day and convert the input into Integer type
		a = Double.parseDouble(JOptionPane.showInputDialog("Please enter value of a"));
		b = Double.parseDouble(JOptionPane.showInputDialog("Please enter value of b"));
		c = Double.parseDouble(JOptionPane.showInputDialog("Please enter value of c"));
		
		delta = Math.pow(b, 2) - 4 * a * c;
		
		// Output different results according to the value of delta
		if (delta < 0){
			JOptionPane.showMessageDialog(null, "There isn't any root.");
		} else if (delta == 0){
			double root = (-b + Math.sqrt(delta)) / (2 * a);
			JOptionPane.showMessageDialog(null, "There is one root: " + root);
		} else{
			double root1 = (-b + Math.sqrt(delta)) / (2 * a);
			double root2 = (-b - Math.sqrt(delta)) / (2 * a);
			JOptionPane.showMessageDialog(null, "There are two roots: \nX1=" + root1 + "\nX2=" + root2);
		}
			
			
	}

}

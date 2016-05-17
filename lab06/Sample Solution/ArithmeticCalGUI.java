import javax.swing.JOptionPane;

public class ArithmeticCalGUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1, str2;
		int num1, num2;
		
		// Taking input from a dialog box and store it to str1
		str1 = JOptionPane.showInputDialog("Enter first integer");
		// Convert the value in str1 (string type) into integer
		// type and store it into num1
	    num1 = Integer.parseInt(str1);
	    
	    // same operations as str1 and num1
	    str2 = JOptionPane.showInputDialog("Enter second integer");
	    num2 = Integer.parseInt(str2);
	    
	    // Display messages
	    JOptionPane.showMessageDialog(null, "Sum is " + (num1+num2));
	    JOptionPane.showMessageDialog(null, "Difference is " + (num1-num2));
	    JOptionPane.showMessageDialog(null, "Product is " + (num1*num2));
	    
	    // To avoid integer division: num1 * 1.0
	    JOptionPane.showMessageDialog(null, "Quotient is " + (num1*1.0/num2));
	}

}

import javax.swing.JOptionPane;
public class ArithmeticCalGUI
{
	public static void main(String[] args)
	{
		String str1,str2;
		int num1,num2;
		
		str1 = JOptionPane.showInputDialog("Enter first integer: ");
		num1 = Integer.parseInt(str1);
		str2 = JOptionPane.showInputDialog("Enter second integer: ");
		num2 = Integer.parseInt(str2);
		
		JOptionPane.showMessageDialog(null, "Sum is "+(num1 + num2));
		JOptionPane.showMessageDialog(null, "Difference is "+(num1 - num2));
		JOptionPane.showMessageDialog(null, "Product is "+(num1 * num2));
		JOptionPane.showMessageDialog(null, "Quotient is "+(num1*1.0 / num2));
		

	}

}

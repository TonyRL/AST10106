import javax.swing.JOptionPane;
public class DayOfWeekGUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String day, month, year;
		int intDay, intMth, intYr, y, x, m, d;
		
		// Taking input from a dialog box for day
		day = JOptionPane.showInputDialog("Enter day");
	    
		// Convert the value in day (string type) into integer type and store it into intDay
	    intDay = Integer.parseInt(day);
			    
		// Similar operations for month and year
		month = JOptionPane.showInputDialog("Enter month");
	    intMth = Integer.parseInt(month);
		
	    year = JOptionPane.showInputDialog("Enter year");
	    intYr = Integer.parseInt(year);
	    
	    y = intYr - (14 - intMth) / 12;
	    x = y + y / 4 - y / 100 + y / 400;
	    m = intMth + 12 * ((14 - intMth) / 12) - 2;
	    d = (intDay + x + (31 * m) / 12) % 7;
	    
	    // Output result
	    JOptionPane.showMessageDialog(null, "The day of week is " + d);
	    }

}

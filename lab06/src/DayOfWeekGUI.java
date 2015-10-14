import javax.swing.JOptionPane;
public class DayOfWeekGUI
{
	public static void main(String[] args)
	{
		String str1,str2,str3;
		int day,month,year;
		
		str1 = JOptionPane.showInputDialog("Enter day");
		day = Integer.parseInt(str1);
		str2 = JOptionPane.showInputDialog("Enter month");
		month = Integer.parseInt(str2);
		str3 = JOptionPane.showInputDialog("Enter year");
		year = Integer.parseInt(str3);
		
		int y = year - (14 - month)/12;
		int x = y + y/4 - y/100 + y/400;
		int m = month + 12 * ((14-month)/12)-2;
		int d = (day + x + (31*m)/12)%7 ;
		
		JOptionPane.showMessageDialog(null, "The day of the week is "+ d );

	}

}

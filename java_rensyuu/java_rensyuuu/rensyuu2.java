package java_rensyuuu;
import java.util.*;
import java.text.*;
import java.io.*;


	public class rensyuu2 {
	public static void main(String[] args) throws IOException {
		Calendar cal = Calendar.getInstance();

		int t = 0;
		int con = 0;
		

				t = cal.get(Calendar.DAY_OF_WEEK);
				cal.set(Calendar.DATE, 1);

	


		SimpleDateFormat s = new SimpleDateFormat("yyyy年  MM月のカレンダー");
		System.out.println(s.format(cal.getTime()));

		System.out.println("Sun Mon Tue Wed Thu Fri Sat");

		for (int a = 1; a == t; a++) {
			System.out.print("    ");
			con++;
		}

		for (int b = 1; b <= cal.get(Calendar.DAY_OF_MONTH); b++) {

			if (b >= 0 && b <= 9) {
				System.out.print("  " + cal.get(Calendar.DATE));
				System.out.print(" ");
				con++;
			} else {
				System.out.print(" " + cal.get(Calendar.DATE) + " ");
				con++;
			}
			if (con >= 7) {
				System.out.print("\n");
				con = 0;
			}

			cal.add(Calendar.DATE, 1);

		}
	}
}





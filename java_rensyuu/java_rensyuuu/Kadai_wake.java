package java_rensyuuu;

import java.util.*;
import java.text.*;
import java.io.*;

class Kadai_wake {
	public static void main(String[] args) throws IOException {
		int i = 0;
		Calendar cal = Calendar.getInstance();
		cal.setLenient(false);
		int t = 0;
		while (i < 1) {
			System.out.println("年を入力（西暦でお願いします）");
			System.out.println("月を入力");

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = br.readLine();
			String str2 = br.readLine();
			try {
				int x = Integer.parseInt(str);
				cal.set(Calendar.YEAR, x);

				int y = Integer.parseInt(str2);
				cal.set(Calendar.MONTH, y - 1);

				t = cal.get(Calendar.DAY_OF_WEEK);
				cal.set(Calendar.DATE, 1);

				i++;
			} catch (IllegalArgumentException ex) {
				System.out.println("西暦または月が違います。");

			}

		}

		int con = 0;

		SimpleDateFormat s = new SimpleDateFormat("yyyy年  MM月のカレンダー");
		System.out.println(s.format(cal.getTime()));

		System.out.println("Sun Mon Tue Wed Thu Fri Sat");

		for (int a = 1; a < t; a++) {
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

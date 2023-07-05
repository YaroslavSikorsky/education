package javarush.tasks.JavaCore.tasks04.task1420;
import java.util.Scanner;

/* 
НОД
*/

	public class Solution {
		public static void main(String[] args) throws Exception {
			Scanner sc = new Scanner(System.in);
			int x = sc.nextInt();
			int y = sc.nextInt();
			int j = nod(x, y);
			System.out.println(j);
		}

		private static int nod(int x, int y) {
			if (x > y) {
				int z = y;
				while (z > 0) {
					if (x % z == 0 && y % z == 0) {
						return z;
					}
					z--;
					if (z == 1) {
						return 1;
					}
				}
			} else {
				int z = x;
				while (z > 0) {
					if (x % z == 0 && y % z == 0) {
						return z;
					}
					z--;
					if (z == 1) {
						return 1;
					}
				}
			}
			return 1;
		}
	}
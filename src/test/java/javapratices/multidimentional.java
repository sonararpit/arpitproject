package javapratices;

public class multidimentional {

	public static void main(String[] args) {
		int multi1[][] = new int[2][3];

		multi1[0][0] = 10;
		multi1[0][1] = 20;
		multi1[0][2] = 30;

		multi1[1][0] = 40;
		multi1[1][1] = 40;
		multi1[1][2] = 80;

		int multi[][] = { { 10, 20, 30 }, { 40, 40, 80, 50 }, { 2, 4, 60 } };

		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

		// this is used to get length of or number of rows
		System.out.println("rows= " + multi.length);

		// this is used to get number of columns from specific index row
		System.out.println("1 rows columns = " + multi[1].length);

		// changing value of index
		multi[1][1] = 90;

		// accessing value by using index
		System.out.println(multi[1][2]);

		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

		// printing by using for loop
		for (int i = 0; i < multi.length; i++) {
			for (int j = 0; j < multi[i].length; j++) {
				System.out.print(multi[i][j] + "\t");
			}

			System.out.println();
		}

	}

}

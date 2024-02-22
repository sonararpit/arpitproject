package javapratices;

public class programmulti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int multi[][]= {{10,20,30,40},{20,30,40,50},{30,40,50,60},{40,50,60,70}};
		System.out.println(("row="+multi.length));
		System.out.println("colunm="+multi[2].length);
		for(int i=0;i<multi.length;i++)
		{
			for(int j=0; j<multi[i].length;j++)
			{
				System.out.print(multi[i][j]+"\t");
			}
			System.out.println();
		}
	}

}

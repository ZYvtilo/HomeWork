package dz;
import java.util.Scanner;
public class Examen {

	
	public static void dlinashirina(int dlinna, int shirina) {
		

		  Scanner scan = new Scanner(System.in);
		  String[][] rectangle = new String[dlinna][shirina];
		  String p;
	      System.out.println("������� ������, �� �������� ����� ��������� �������������");
	      p = scan.next();  
	      
	      for (int i = 0; i < dlinna; i++)
	    	  for (int j = 0; j < shirina; j++) {
	    		  rectangle [i][j]= p;
	    	  }
	     for (int i = 0; i < dlinna; i++)
	    	  for (int j = 0; j < shirina; j++) {
	    		  System.out.print(rectangle [i][j]);
	    		  if( j == shirina-1 ) {
	    			  System.out.print("\n");
	    		  }
		 }
	}

	public static void main(String[] args) {
		while(true) {
			
			  int a,b;
			 
			  Scanner scan = new Scanner(System.in);
			  
			  System.out.println("������� ������ �������������� � ���� ������ �����");
		      a = scan.nextInt();
		      
		      System.out.println("������� ������ �������������� � ���� ������ �����");
		      b = scan.nextInt();
		      String[][] rectangle = new String[a][b];
		      dlinashirina(a,b);
		      
		}
	}

}

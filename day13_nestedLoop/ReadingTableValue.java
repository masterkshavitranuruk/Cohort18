package day13_nestedLoop;

public class ReadingTableValue {

	public static void main(String[] args) {
		int rowCount = 6;
		int columnCount = 7;
		
		for(int row =1;row<=rowCount; row++ ) {
//			System.out.println(row);
			for(int column = 1;column<=columnCount; column++) {
//				System.out.println(column);
				System.out.print("CellValue("+row+","+column+")  ");
			}
		 System.out.println();
		}

		
		
		
		
	}

}

package studio8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// TODO: Develop an algorithm to count steps in accelerometer data
//    Major steeps:
//       1. Create a class and main method.
//       2. Using a Scanner and File object, read data from your .csv file.
//       3. Develop and test algorithms to count the "peaks" in the data.
public class CountSteps {
	
	public static void main(String[] args) throws FileNotFoundException{
		String file = "data/7Steps.csv";
		File data = new File(file); 
		Scanner scan = new Scanner(data);
		
		while(scan.hasNextLine()) {
			String s = scan.nextLine();
			String[] a = s.split(",");
			System.out.println(a[2]);
		}
		//scan.useDelimiter(",");
		/*for(int i = 0; scan.hasNext(); i ++) {
			String s = scan.next();
			if(i%3 ==0) {
				System.out.println(s);
			}
		}	*/
//		while(scan.hasNext()) {
//		}
		scan.close();
	}
	
	public int Count() {
		
		
		return 1;
	}
	
	
}
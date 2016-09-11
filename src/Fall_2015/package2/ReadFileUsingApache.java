//package Fall_2015.package2;
//
//import java.io.File;
//import java.io.IOException;
//import java.util.ArrayList;
//
//import org.apache.commons.io.FileUtils;
//
//public class ReadFileUsingApache {
//
//	public static void main(String[] args) {
//
//
//		//1. Bring Apache's common.jar file in your project
//		//2. Include it in the build path
//		//3. Use common library
//
//
//		File file = new File("src/Fall_2015.package2/file.txt");
//
//		try {
//			ArrayList<String> lines = (ArrayList<String>) FileUtils.readLines(file);
//
//			//in order to print
//
//			for(int i=0; i<lines.size(); i++)
//				System.out.println(lines.get(i));
//
//			//in order to write in the list and pool file. if you say true it will not overwrite everything
//			FileUtils.write(file,"Goodbye!", true);
//
//		}catch(IOException io){
//			System.out.println("Missing File...");
//		}
//
//
//
//	}
//
//}

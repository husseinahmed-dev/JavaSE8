//package Fall_2015.package2;
//
//import org.apache.commons.io.FileUtils;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.util.ArrayList;
//
///**
// * Created by Hussein on 12/9/15.
// */
//public class Files {
//    public static void main(String[] args) {
//        File file = new File("src/Fall_2015.package2/file.txt");
//        //String curDir = System.getProperty("user.dir");
//        //System.out.println(curDir);
//
//        ArrayList<String> lines = new ArrayList<String>();
//
//        try {
//            lines = (ArrayList<String>) FileUtils.readLines(file);
//
//            for (int i = 0; i < lines.size(); i++) {
//                System.out.println(lines.get(i));
//            }
//
//            FileUtils.write(file, "\nName500", true);
//
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}

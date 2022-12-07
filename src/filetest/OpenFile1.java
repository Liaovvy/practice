package filetest;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * @Auther: yuguo
 * @Date: 2022/2/7 - 02 - 07 - 14:29
 * @Description: filetest
 * @version: 1.0
 */
public class OpenFile1 {
    private BufferedReader openFileReader(Scanner ss, String prompt){
        BufferedReader rd = null;
        while(rd == null){
            try {
                System.out.print(prompt);
                String name = ss.nextLine();
                rd = new BufferedReader(new FileReader(name));
            } catch (FileNotFoundException e) {
                System.out.println("Can't open that file.");
            }
        }
        return rd;
    }
}

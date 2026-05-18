package filehandling.textfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextFileReader {

    public String readFile(String filePath) {
        StringBuilder content = new StringBuilder();
      try(
              BufferedReader bufferedReader =
                  new BufferedReader(new FileReader(filePath))
      ){
          String line;
            while((line = bufferedReader.readLine()) != null) {
                content.append(line)
                        .append(System.lineSeparator());
            }
      }   catch (IOException e){
          System.out.println("Error reading text file");
          System.out.println("Reason: "+ e.getMessage());
      }

      return content.toString();
    }
}

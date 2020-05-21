import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AppData {

    private String[] header;
    private int[][] data;

  public AppData (String name){
    this.readCsvFile(name);
  }
   public void readCsvFile (String name){
      List<String[]> dataList = new ArrayList<String[]>();
      try (BufferedReader reader = new BufferedReader(new FileReader(name))) {
        //String str


      }catch (IOException e) {
          e.printStackTrace();
      }
   }
}

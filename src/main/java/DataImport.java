import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

import java.util.ArrayList;
import java.util.HashMap;

public class DataImport {

    HashMap<String,Data> map = new HashMap<>();
    ArrayList<String> dates = new ArrayList<>();
    PApplet p;
    Table table;

    DataImport(PApplet p){
        this.p=p;


    }

   void importData(){


       table = p.loadTable("https://raw.githubusercontent.com/owid/covid-19-data/master/public/data/owid-covid-data.csv","header");
       for (TableRow row : table.rows()) {
           if(row.getString("location").equals("Australia")){
               dates.add(row.getString("date"));
               p.println(row.getString("date")+ " "+row.getInt("total_deaths"));
               putData(row.getString("date"),row.getInt("total_deaths"));
           }
    }
}
    void putData(String key,int deaths){
        map.put(key,new Data(key,deaths));


    }


}

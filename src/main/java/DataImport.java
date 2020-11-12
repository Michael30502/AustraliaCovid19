import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

import java.util.ArrayList;
import java.util.HashMap;

public class DataImport {

    HashMap<String,Data> totalMap = new HashMap<>();
    HashMap<String,Data> newMap = new HashMap<>();
    ArrayList<String> dates = new ArrayList<>();
    ArrayList<String> datesActive = new ArrayList<>();
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
               if(row.getInt("total_deaths")!=0)
               datesActive.add(row.getString("date"));
               p.println(row.getString("date")+ " "+row.getInt("total_deaths") + " "+row.getInt("total_cases"));
               putData(row.getString("date"),row.getInt("total_deaths"),row.getInt("new_deaths"),row.getInt("total_cases"));
           }
    }
}
    void putData(String key,int deaths,int newDeaths,int totalCases){
        totalMap.put(key,new Data(key,deaths,newDeaths,totalCases));
    }


}

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class DataImport {

    PApplet p;
    Table table;

    DataImport(PApplet p){
        this.p=p;


    }

   void importData(){


       table = p.loadTable("https://raw.githubusercontent.com/owid/covid-19-data/master/public/data/owid-covid-data.csv","header");
       for (TableRow row : table.rows()) {
           if(row.getString("location").equals("Australia")){
               p.println(row.getString("date")+ " "+row.getInt("total_deaths"));

           }

    }
}


}

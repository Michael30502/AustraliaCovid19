import processing.core.PApplet;
import processing.data.Table;

public class DataImport {

    PApplet p;
    Table table;
    DataImport(PApplet p){
        this.p=p;


    }

   void importData(){
    table = p.loadTable("https://raw.githubusercontent.com/owid/covid-19-data/master/public/data/owid-covid-data.csv","header");
    p.println(table);


    }
}

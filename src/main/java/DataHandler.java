import processing.core.PApplet;

import java.util.ArrayList;
import java.util.HashMap;

public class DataHandler {

    PApplet p;
    HashMap<String,Data> map;
    ArrayList<String> dates;
    ArrayList<String> datesActive;
    double multi;

        DataHandler(PApplet p,HashMap<String,Data> map,ArrayList<String> dates,double multiplier,ArrayList<String> datesActive){
            this.p = p;
            this.map = map;
            this.dates = dates;
            this.datesActive = datesActive;
            multi=multiplier;
        }

        void barGraph(){
            System.out.println(p.height);
            for(int i =0; i<datesActive.size();i++) {
                p.rect((float)5.6*(float)i,p.height ,1,p.height  - ((float)map.get(datesActive.get(i)).deaths)*(float)1.5);

            }
        }




}

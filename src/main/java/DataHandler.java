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


        void lineGraph() {
            float sum1 =0;
            float sum2 =0;
            float multi2 = (float)multi*5;

            for (int i = 1; i < dates.size(); i++) {
                sum2= (float) (map.get(dates.get(i)).deaths/3.5);
                p.stroke(0);
            p.line(50+(i-1)*multi2,p.height-30-sum1,50+i*multi2,p.height-30-sum2);
                sum1=sum2;
            }

            for(int i =1;i<7;i++){
                p.stroke(169);
            p.line(50,p.height-sum2/5*i,p.width-50,p.height -sum2/5*i);
            }
    p.line(50,p.height-25,p.width-50,p.height-25);
            p.line(50,p.height-25,50,p.height-sum2-sum2/5);    }



}

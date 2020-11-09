import processing.core.PApplet;

import java.util.ArrayList;
import java.util.HashMap;

public class DataHandler {

    PApplet p;
    HashMap<String,Data> map;
    ArrayList<String> dates;
    double multi;

        DataHandler(PApplet p,HashMap<String,Data> map,ArrayList<String> dates,double multiplier){
            this.p = p;
            this.map = map;
            this.dates = dates;
            multi=multiplier;
        }

        void barGraph(){
            for(int i =0; i<dates.size();i++) {

            System.out.println(p.height);


                p.rect(0+i*(float)multi ,p.height -20*(float)multi,(i * (float)multi)+2,p.height - 20 + map.get(dates.get(i)).deaths );
            }
        }


        void lineGraph() {
            int sum1 =0;
            int sum2 =0;
            float multi2 = (float) ((float)multi*2.5);
            for (int i = 1; i < dates.size(); i++) {
                sum2=map.get(dates.get(i)).deaths/2;
            p.line(10+(i-1)*multi2,p.height-20-sum1,10+i*multi2,p.height-20-sum2);
                sum1=sum2;
            }
        }



}

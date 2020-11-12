import processing.core.PApplet;

import java.util.ArrayList;
import java.util.HashMap;

public class DataHandler {

    PApplet p;
    HashMap<String,Data> totalMap;

    ArrayList<String> dates;
    ArrayList<String> datesActive;

    double multi;

        DataHandler(PApplet p, HashMap<String,Data> totalMap, ArrayList<String> dates, double multiplier, ArrayList<String> datesActive){
            this.p = p;
            this.totalMap = totalMap;

            this.dates = dates;
            this.datesActive = datesActive;
            multi=multiplier;
        }

        void barGraph(String type){
            //System.out.println();
            for(int i =0; i<datesActive.size();i++)
            switch (type){

                case "total":{p.rect((float)5.6*(float)i,p.height-2 ,1, - (((float) totalMap.get(datesActive.get(i)).deaths)*(float)0.7)) ;break;}

                case "new":{p.rect((float)5.6*(float)i,p.height-2 ,1, - (((float) totalMap.get(datesActive.get(i)).newDeaths)*(float)0.7));break;}
            }





        }

        void circleDiagram(){

        p.text("THIS IS A CIRCLE DIAGRAM",p.width/2,p.height/2);




        }

        void lineGraph() {
            float sum1 =0;
            float sum2 =0;
            float multi2 = (float)multi*5;

            for (int i = 1; i < dates.size(); i++) {
                sum2= (float) (totalMap.get(dates.get(i)).deaths/3.5);
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

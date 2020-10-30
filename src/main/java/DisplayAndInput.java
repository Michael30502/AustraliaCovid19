import processing.core.PApplet;
import java.util.ArrayList;

public class DisplayAndInput {
PApplet p;

ArrayList<String> options = new ArrayList<>();

        DisplayAndInput(PApplet p){
            this.p=p;
            options.add("Bar Graph (Deaths)");
            options.add("Bar Graph (New Deaths)");
        }

    void displayMenu(){

        for(int i =0;i<options.size();i++){
            p.textAlign(p.CENTER);
            p.text(options.get(i),p.width/2,(p.height/2)-options.size()+i*20);
        
	}}

void display(/*InputField inputField*/){
    background();
    //inputField.display();
}

void background(){
    p.background(3,145,213);

    }



}

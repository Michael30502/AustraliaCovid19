import processing.core.PApplet;
import processing.core.PImage;

import java.awt.*;
import java.util.ArrayList;

public class DisplayAndInput {
PApplet p;
DataHandler dataHandler;

PImage logo;
        DisplayAndInput(PApplet p,DataHandler dataHandler){
            logo=p.loadImage("Australiencool.png");
            this.p=p;
            this.dataHandler = dataHandler;

        }

    void displayMenu(ArrayList<String> options){

        for(int i =0;i<options.size();i++){
            p.textAlign(p.CENTER);
            p.fill(0);
            p.text(options.get(i),p.width/2,(p.height/2)-options.size()+i*20);
        
	}}

void display(int graph,ArrayList<Button> buttList){
    background();

    for(int i = 0;i<buttList.size();i++){
    buttList.get(i).drawButton();}
    if(graph==1){
//        dataHandler.barGraph();
    }
    if(graph==2){
 //       dataHandler.barGraph();
    }
    if(graph==3){
        dataHandler.lineGraph();
    }
}





void background(){
    p.background(3,145,213);
    p.fill(3,130,170);
    p.rect(0,0,p.width,100);
    logo.resize(200,100);
    p.image(logo,0,0);

    }



}

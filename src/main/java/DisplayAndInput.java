import processing.core.PApplet;

public class DisplayAndInput {
    PApplet p;
DisplayAndInput(PApplet p){
this.p=p;
}
void display(/*InputField inputField*/){
    background();
    //inputField.display();
}

void background(){
    p.background(3,145,213);
    p.fill(3,130,170);
    p.rect(0,0,828,100);

}

}

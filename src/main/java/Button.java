import processing.core.PApplet;

import java.util.ArrayList;

public class Button {
    boolean pressed;

    float xPos, yPos;
    float w, h;
    DisplayAndInput  dAP;
    String text;
    PApplet p;
    int type;

    Button(PApplet p,float x, float y, float b, float h, String t,DisplayAndInput dAP,int type) {
        this.dAP = dAP;
        this.w = b;
        this.h = h;
        this.xPos = x;
        this.yPos = y;
        this.text = t;
        this.p=p;
        this.type = type;
    }
    public void drawButton() {
        p.textSize(24);
        p.fill(3,130,170);
        p.rect(xPos, yPos, w, h);
        p.fill(255);
        p.text(text, xPos +w/2, yPos + 35);
        isButtonPressed();
    }
    boolean isButtonPressed() {
        if (pressed)
        dAP.currentGraph = type;

        return pressed;

    }
    void registerClick(float xin, float yin) {

        if (xin > xPos && xin < xPos + w && yin < yPos + h && yin > yPos) {
            pressed = true;
        }
    }
    void release() {
        pressed = false;
    }
}

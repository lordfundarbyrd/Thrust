import processing.core.PApplet;
import processing.core.PVector;

public class Fire {
    
    PApplet parent;
    PVector position;
    PVector velocity;
    PVector acceleration;
    
    public Fire(PApplet p) {
        parent = p;
        position = new PVector(Rocket.position.x-50,Rocket.position.y+345.71F);
    }
    
    public void render() {
        parent.noStroke();
        parent.fill(255,140,0);
        parent.rect(position.x,position.y+25,100,50);
    }
    
    public void update() {
        this.position.set(Rocket.position.x-50,Rocket.position.y+345.71F);
    }
    
}

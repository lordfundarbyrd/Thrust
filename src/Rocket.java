
import processing.core.PApplet;
import processing.core.PVector;

public class Rocket{
    
    PApplet parent;
    static PVector position;
    static PVector velocity;
    static PVector acceleration;
    float dT;
    float mass;
    
    
    public Rocket(PApplet p) {
        parent = p;
        position = new PVector(500,30);
        velocity = new PVector(0,5);
        acceleration = new PVector(0,9.8F);
        dT = .1F;
    }
    
    public void update() {
        
        velocity.add(PVector.mult(acceleration, dT));
        position.add(PVector.mult(velocity, dT));
        if (this.position.y >= parent.height/2) {
            parent.noLoop();
        }
    }
    
    public void render() {
        parent.fill(255,0,0);        
        parent.noStroke();
        parent.triangle(position.x,position.y,position.x-50,70.71F+position.y,position.x+50,70.71F+position.y);
        parent.fill(255);
        parent.rect(position.x-50,70.71F+position.y,100,300);
        parent.fill(255,0,0);
        parent.triangle(position.x-50,320.71F+position.y,position.x-75,345.71F+position.y,position.x-50,345.71F + position.y);
        parent.triangle(position.x+50,320.71F+position.y,position.x+75,345.71F+position.y,position.x+50,345.71F + position.y);
        parent.rect(position.x-75,345.71F+position.y,25,50);
        parent.rect(position.x+50,345.71F+position.y,25,50);
    }
}

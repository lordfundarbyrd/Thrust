
import processing.core.PApplet;

public class Thrust extends PApplet{
    
    Rocket rocket;
    Fire fire;
    boolean fireOn;
    
    public static void main(String[] args) {
        PApplet.main(new String[]{Thrust.class.getName()});
    }
    
    public void settings() {
        size(1000,1000);
    }
    
    public void setup() {
        rocket = new Rocket(this);
        fire = new Fire(this);
        fireOn = false;
    }
    
    public void draw() {
        background(0);
        fill(0,255,0);
        ellipse(width/2,1400,width+500, width+200);
        rocket.update();
        rocket.render();
    }
    
    public void fire() {
        if (fireOn == false) {
            fireOn = true;
            fire.update();
            fire.render();
        }
        
        if (fireOn == true) {
            fireOn = false;
        }
    }
    
    public void keyReleased() {
        fire();
    }
    
    public void keyPressed() {
        if (key == CODED) {
            if (keyCode == UP) {
                rocket.position.y-=10;
                fire();
            }
            
            if (keyCode == DOWN) {
                rocket.position.y+=10;
                fire();
            }
            
            if (keyCode == LEFT) {
                rocket.position.x-=10;
                fire();
            }
            
            if (keyCode == RIGHT) {
                rocket.position.x+=10;
                fire();
            }
        }
    }
}

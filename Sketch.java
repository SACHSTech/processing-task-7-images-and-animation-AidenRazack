import processing.core.PApplet;
/**
 * A program that generates an image background and animates an image and shape with edge detection
 * @author: A. Razack
 *
 */
import processing.core.PImage;
public class Sketch extends PApplet {
	
  PImage backgroundImage;

  public void settings() {
	// put your size call here
    size(800, 800);
    backgroundImage = loadImage("https://happycoding.io/images/stanley-1.jpg");
  }

  public void setup() {
    background(210, 255, 173);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
    image(backgroundImage, 0, 0, 800, 800);
  }
  
  // define other methods down here.
}
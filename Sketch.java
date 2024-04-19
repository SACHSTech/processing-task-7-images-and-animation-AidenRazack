import processing.core.PApplet;
/**
 * A program that generates an image background and animates an image and shape with edge detection
 * @author: A. Razack
 *
 */
import processing.core.PImage;
public class Sketch extends PApplet {

  PImage backgroundImage;
  PImage imgRect;

  public void settings() {
	// put your size call here
    size(650, 400);
    backgroundImage = loadImage("night-sky-glows-with-iridescent-deep-space-generative-ai.jpg");
    imgRect = loadImage("360_F_459326746_Sbe7u3BYDy3rDmMk1MP9IMUkkgTHRNss.png");
  }

  float imgRectX = 400;
  float imgRectY = 300;
  float imgRectWidth = 50;
  float imgRectHeight = 50;
  float imgRectSpeedX = 2;
  float imgRectSpeedY = 2;
  
  float bouncingRectX = 10;
  float bouncingRectY = 10;
  float bouncingRectWidth = 50;
  float bouncingRectHeight = 50;
  float bouncingRectSpeedX = 2;
  float bouncingRectSpeedY = 2;

  public void setup() {
    background(210, 255, 173);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    image(backgroundImage, 0, 0, 650, 400);

    // Make the imgRect travel in a non-linear path using sine waves
    float angle = radians(frameCount); 
    float radius = 150;
    float imgRectX = width / 2 + cos(angle) * radius;
    float imgRectY = height / 2 + sin(angle) * radius;
  
    // Draw imgRect
    stroke(255);
    image(imgRect, imgRectX, imgRectY, imgRectWidth, imgRectHeight);

    // bounce off left and right edges of screen
    if(imgRectX < 0 || imgRectX + imgRectWidth > width){
      imgRectSpeedX *= -1;
    }

    // bounce off top and bottom edges of screen
    if(imgRectY < 0 || imgRectY + imgRectHeight > height){
      imgRectSpeedY *= -1;
    }

    imgRectX += imgRectSpeedX;
    imgRectY += imgRectSpeedY;

    // bounce off left and right edges of screen
    if(bouncingRectX < 0 || bouncingRectX + bouncingRectWidth > width){
      bouncingRectSpeedX *= -1;
    }


    // bounce off top and bottom edges of screen
    if(bouncingRectY < 0 || bouncingRectY + bouncingRectHeight > height){
      bouncingRectSpeedY *= -1;
    }

    bouncingRectX += bouncingRectSpeedX;
    bouncingRectY += bouncingRectSpeedY;

    // draw the bouncing rectangle
    rect(bouncingRectX, bouncingRectY, bouncingRectWidth, bouncingRectHeight);

  }

}
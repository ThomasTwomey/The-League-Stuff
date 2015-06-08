PImage face;
import ddf.minim.*;
AudioSample sound;

void setup()
{
  Minim minim = new Minim(this);
  sound = minim.loadSample("pewpew.mp3");

  size (500, 500);
  PImage catPic = loadImage("tabby.jpg");
  catPic.resize(500, 500);
  image(catPic, 0, 0);
  
}

int eye1X = 165;
int eye1Y = 182;
int eye2X = 315;
int eye2Y = 189;
  
void draw()
{
  
  fill(255, 0, 0);
  ellipse(eye1X, eye1Y, 50, 50);
  ellipse(eye2X, eye2Y, 50, 50);
  
  noStroke();
  keyPressed();
  
  //println(mouseX + " " + mouseY);
}

int accel = 1;

void keyPressed()
{
  if(keyCode == UP)
  {
      int speed = 5;
      
      eye1X += accel+speed;
      eye1Y += accel+speed;
      eye2X += accel+speed;
      eye2Y += accel+speed;
      sound.trigger();
  }
}

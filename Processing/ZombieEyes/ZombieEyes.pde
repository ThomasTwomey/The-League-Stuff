PImage face;

void setup()
{
  //size(247, 348);
  size(500, 500);
  face = loadImage("Ainsley.jpg");
  face.resize(500, 500);
  image(face, 0, 0);
}

void draw()
{
  image(face, 0, 0);
  
  fill(mouseX, mouseY, mouseX);
  ellipse(120, 204, 50, 50);
  ellipse(320, 204, 50, 50);
  
  int pup1X = mouseX;
  int pup1Y = mouseY;
  int pup2X = mouseX;
  int pup2Y = mouseY;
  
  if(pup1X >= 140)
  {
      pup1X = 140;
  }
  
  if(pup1X <= 100)
  {
      pup1X = 100;
  }
  
  if(pup1Y >= 224)
  {
      pup1Y = 224;
  }
  
  if(pup1Y <= 184)
  {
      pup1Y = 184;
  }
  
  //pup 2
  if(pup2X >= 340)
  {
      pup2X = 140;
  }
  
  if(pup2X <= 300)
  {
      pup2X = 100;
  }
  
  if(pup2Y >= 224)
  {
      pup2Y = 224;
  }
  
  if(pup2Y <= 184)
  {
      pup2Y = 184;
  }
  
  fill(0, 0, 0);
  ellipse(pup1X, pup1Y, 20, 20);
  ellipse(pup2X, pup2Y, 20, 20);
  
}

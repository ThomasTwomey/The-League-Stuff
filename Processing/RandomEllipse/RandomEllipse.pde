void setup()
{
  size (400, 400);
  
  
}

void draw()
{
float randx = random(150) + 50;
float randy = random(150) + 50;
float r = random(255);
float g = random(255);
float b = random(255);

  fill(r, g, b);
  ellipse(200, 200, randx, randy);
}

void setup()
{
  size(500, 500);
}

void draw()
{
  
  for (int i = 150; i >= 1; i-=15)
  {
    ellipse(100, 250, i, i);
  }
  for (int j = 150; j >= 1; j-=15)
  {
    ellipse(400, 250, j, j);
  }
  
}

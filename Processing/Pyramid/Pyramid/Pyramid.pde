void setup(){
  int BRICK_WIDTH = 50;
  int BRICK_HEIGHT = 24;
  int BRICK_IN_BASE = 14;
  size(700, 350);
  
for (int i = 0; i < BRICK_IN_BASE; i++) {
  for (int j = 0; j < i; j++) {

    int x = BRICK_WIDTH * j ;
    int y = BRICK_HEIGHT * i;

    rect(x, y, BRICK_WIDTH, BRICK_HEIGHT);

    }
  }
}

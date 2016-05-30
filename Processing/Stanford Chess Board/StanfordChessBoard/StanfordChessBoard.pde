int rows = 8;
int columns = 9;
int rectWidth = 50;
int rectHeight = 50;

void setup(){
  size(rectWidth * rows, rectHeight * (columns - 1));
}

boolean isOdd(int num){
  if(num % 2 == 0)
    return false;
  else
    return true; 
}

void draw(){
   for(int i = 0; i < rows; i++){
    for(int j = 0; j < columns; j++){
      rect(rectWidth * j, rectHeight * i, rectWidth, rectHeight);
      if(isOdd(i + j)){
        fill(255);
      }
      else{
       fill(0); 
      }
    }
  }
}

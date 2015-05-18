import ddf.minim.*;

//Ball Movement
int xPos = 400;
int yPos = 300;
int xSpeed = 6; // x Speed of ball
int ySpeed = 6; // y Speed of ball
int leftPaddleSpeed = 300;
int leftPaddleVar = 8;
int player1Points = 0;
int player2Points = 0;
String player1Score = "";
String player2Score = "";

//Sound import
Minim minim;
AudioSample sound;

//Background Image
PImage backgroundImage;



void setup () {
 size(800, 600); //800 by 600 box
 
 //Sound Setup
 minim = new Minim (this);
 //sound = minim.loadSample("BD.wav", 128);
 
}
void draw () {
  background(150, 150, 150); //Background dark grey
  
  //Player 1 Score
   String player1Score = "Player 1 Has " + player1Points + " Points";
   
   //Player 2 Score
   String player2Score = "Player 2 Has " + player2Points + " Points";
  
  //Pong Ball
  xPos = xPos + xSpeed; //adding speed to x pos
  yPos = yPos + ySpeed; //adding speed to y pos
  stroke(0, 0, 0);
  fill(255, 255, 255);
  ellipse(xPos, yPos, 25, 25);
  
  //Midline
  stroke(0, 0, 0);
  line(400, 0, 400, 600);
  //Top Wall
  noStroke();
  fill(0, 0, 0);
  rect(0, 0, 800, 10);
  
  
  //Bottom Wall
  noStroke();
  fill(0, 0, 0);
  rect(0, 590, 800, 10);
    
  //Right Wall bounce
   if(xPos >= 800 && xPos <= 810) {
     //xSpeed = -xSpeed;
     player1Points = player1Points + 1;
     println(player1Score);
   }
   
   //Left Wall bounce
   if(xPos <= 0) {
     //xSpeed = -xSpeed;
     player2Points = player2Points + 1;
     println(player2Score);
   }
   
   //Top Wall bounce
   if(yPos <= 5) {
     ySpeed = -ySpeed;
   }
   
   //Bottom Wall bounce
   if(yPos >= 595) {
     ySpeed = -ySpeed;
   }
   
   //Right Paddle
   rect(785, mouseY - 60, 15, 120);
      
   //Left Paddle
   rect(0, leftPaddleSpeed -60 , 15, 120);
   
   //Ball Reset
  if(xPos >= 810 || xPos <= -10) {
     xPos = 400;
     yPos = 300;
   }  
   
   //Collison with Right Paddle
   if (yPos >= mouseY - (60) && yPos <= mouseY + (60) && xPos >= 785) {
     xSpeed = -xSpeed;
     //sound.trigger();
   }
   
   //Collison with Left Paddle
   if(yPos >= leftPaddleSpeed - (60) && yPos <= leftPaddleSpeed + (60) && xPos <= 15) {
     xSpeed = -xSpeed;
     //sound.trigger();
   }
   //Left Paddle Movement
   if(keyCode == 87){
     leftPaddleSpeed = leftPaddleSpeed - leftPaddleVar;
   }
   if(keyCode == 83){
     leftPaddleSpeed = leftPaddleSpeed + leftPaddleVar;
   }
   if(keyCode == 65){
     leftPaddleSpeed = leftPaddleSpeed;
   }
   
}

import processing.core.PApplet;
import processing.core.PFont;

public class pong extends PApplet {



    public void settings (){
        size(800, 800);
    }

    public void setup() {
        size(800, 800);
        surface.setTitle("Pong");
        noStroke();

        // Initialize Variables
        ballX = width/2;
        ballY = height/2;

        ballSpeedX= 7.0F;
        ballSpeedY = 1.5F;

        p1y = p2y = height/2;
        scoreP1 = scoreP2 = 0;

        font = createFont("Helvetica",72);
        textFont(font,72);

    }

    public void draw(){
        background(0);
        fill(255,100);
        rect(width/2 - 3, 0, 6, height);
        textAlign(LEFT, CENTER);
        text(scoreP1, 50, 50);
        textAlign(RIGHT, CENTER);
        text(scoreP2, width-50, 50);

        //Drawing the ball
        fill(255);
        ellipse(ballX, ballY, ballSize, ballSize); //is the ball
        ballX += ballSpeedX;
        ballY += ballSpeedY;

        //Drawing the paddles
        rect(0, p1y, paddleWidth, paddleHeight);
        rect(width-paddleWidth, p2y, paddleWidth, paddleHeight);

        p1y= mouseY;

        if (ballY < 0 || ballY > height){
            ballSpeedY *= -1.0;
        }

        if (ballX < 0){
            scoreP2 += 1;
            newBall();
        }
        else if (ballX > width){
            scoreP1 += 1;
            newBall();
        }

        if (ballX - ballSize/2 >= width-paddleWidth && ballY > p1y && ballY < p1y + paddleHeight){
            ballSpeedX *= -1;
        }
        else if (ballX + ballSize/2 >= width-paddleWidth && ballY > p2y && ballY < p2y + paddleHeight){
            ballSpeedX *= -1;
        }

    }
    public void keyPressed(){
        if(key == CODED){
            if(keyCode == UP){
                p2y -= playerSpeed;
            }
            else if(keyCode == DOWN){
                p2y += playerSpeed;
            }
        }
    }

    void newBall(){
        ballX = width/2;
        ballY = height/2;
        ballSpeedX = random(6.5F, 7.0F);
        ballSpeedY = random(-2.0F,2.0F);

    }

    int ballSize = 12;
    int paddleWidth = 12;
    int paddleHeight = 100;
    float playerSpeed = 15.0F;


    //Ball position
    float ballX, ballY;
    float ballSpeedX, ballSpeedY;

    //Paddle Position
    float p1y, p2y;

    //Scoring
    int scoreP1, scoreP2;

    PFont font;


    public static void main(String... args) {
        PApplet.main("pong");
    }
}




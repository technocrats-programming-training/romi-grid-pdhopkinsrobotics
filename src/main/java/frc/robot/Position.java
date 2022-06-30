package frc.robot;

import static lib.Romi.driveDistance;
import static lib.Romi.turnDegrees;

public class Position {

  int pos_x = 0;
  int pos_y = 0;
  int turn_deg = 0;
  int dir = 0;
  
  //drive units is inches
  //ture units is degrees
    public void driveUp() throws InterruptedException {

    //turn left 90 degrees * dir
    turn_deg = -90 * dir;
    turnDegrees (turn_deg);   
    //set dir = 0
    dir = 0;
    //drive forward 10 inches
    driveDistance(10);
    //set pos_y = pos_y + 1
    pos_y = pos_y + 10;
    
    }

    public void driveDown() throws InterruptedException {
    //desired direction is 2
      turn_deg = -90 * (dir-2);
    turnDegrees (turn_deg);   
    //set dir = 0
    dir = 2;
    //drive forward 10 inches
    driveDistance(10);
    //set pos_y = pos_y + 1
    pos_y = pos_y - 10;

    }

    public void driveRight() throws InterruptedException {
    //desired direction is 1
      turn_deg = -90 * (dir-1);
    turnDegrees (turn_deg);   
    //set dir = 0
    dir = 1;
    //drive forward 10 inches
    driveDistance(10);
    //set pos_y = pos_y + 1
    pos_x = pos_x + 10;

    }

    public void driveLeft() throws InterruptedException {
    //desired direction is 3
      turn_deg = -90 * (dir-3);
    turnDegrees (turn_deg);   
    //set dir = 0
    dir = 3;
    //drive forward 10 inches
    driveDistance(10);
    //set pos_y = pos_y + 1
    pos_x = pos_x - 10;

    }

    public void returnToHome() {

    }

    public String toString() {
        return "(" + pos_x + ", " + pos_y + ")";
    }
}

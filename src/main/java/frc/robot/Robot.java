// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILi.b BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import lib.ProceduralRobot;

import java.util.Scanner;

import static lib.Romi.*;


public class Robot extends ProceduralRobot {
  @Override
  public void autonomousProcedure() throws InterruptedException {
    Joystick myJoystick = new Joystick(0);
    Position myPosition = new Position();
    int buttonNumber = 1;
    boolean pressed = false;
    for (int done = 0;done == 0;done = done){

      //button
      pressed = myJoystick.getRawButtonPressed(buttonNumber);
      myPosition.driveUp();
      pressed = false;
      buttonNumber += 1;    
      //button
      pressed = myJoystick.getRawButtonPressed(buttonNumber);
      myPosition.driveDown();
      pressed = false;
      buttonNumber += 1;    
      //button
      pressed = myJoystick.getRawButtonPressed(buttonNumber);
      myPosition.driveLeft();
      pressed = false;
      buttonNumber += 1;    
      //button
      pressed = myJoystick.getRawButtonPressed(buttonNumber);
      myPosition.driveRight();
      pressed = false;
      buttonNumber += 1;    
      //button
      pressed = myJoystick.getRawButtonPressed(buttonNumber);
      myPosition.returnToHome();
      pressed = false;
      done = 1;
      buttonNumber += 1;    

      buttonNumber = 0;
    }
  }
}

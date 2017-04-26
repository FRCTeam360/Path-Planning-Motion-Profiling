package org.usfirst.frc.team360.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team360.robot.commands.*;

public class OI {
	 public static Joystick joyR = new Joystick(0);
	 public static Joystick joyL = new Joystick(1);
	 public static Joystick joyOI = new Joystick(2);   
	 
	 public static Button buttonDriveUp = new JoystickButton(joyR, 1);
	 
	 public static Button buttonDriveDown = new JoystickButton(joyL, 1);
	 public static Button buttonResetDriveEncoders = new JoystickButton(joyL, 3);
	 public static Button buttonDriveStraight1 = new JoystickButton(joyL, 7);
	 
	 
	 public OI(){
		buttonDriveUp.whenPressed(new ShiftUp());
		buttonDriveDown.whenPressed(new ShiftDown());
		buttonResetDriveEncoders.whenPressed(new ResetDriveEncoders());
	 }
}
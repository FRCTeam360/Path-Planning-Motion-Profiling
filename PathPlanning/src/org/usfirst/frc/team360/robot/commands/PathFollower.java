package org.usfirst.frc.team360.robot.commands;

import java.util.Timer;
import java.util.TimerTask;

import edu.wpi.first.wpilibj.command.Command;

public class PathFollower extends Command {
	
    public PathFollower() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
    public class Calculate extends TimerTask {
	   

	   public Calculate() {
	       Timer timer = new Timer();
	       timer.scheduleAtFixedRate(this, 10, 10);
	   }
	    public void run(){
	      
	    }
	}
}

package org.usfirst.frc.team360.robot;

import com.kauailabs.navx.frc.AHRS;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.interfaces.Potentiometer;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	public static Compressor compressor = new Compressor();
	
	public static VictorSP motorR1 = new VictorSP(0);
	public static VictorSP motorR2 = new VictorSP(1);
	public static VictorSP motorL1 = new VictorSP(2);
	public static VictorSP motorL2 = new VictorSP(3);
	
	public static Encoder driveTrainEncoderLeft = new Encoder(8, 9);
	public static Encoder driveTrainEncoderRight = new Encoder(6, 7);
	
	public static int driveTrainEncoderLeftReset = 0;
	public static int driveTrainEncoderRightReset = 0;
	
	public static DoubleSolenoid shifter = new DoubleSolenoid(1, 0);
	
	public static AHRS navX = new AHRS(SPI.Port.kMXP);
	
	public static final double encoderCountsLeftToFeet = 22.6;
	public static final double encoderCountsRightToFeet = 22.0;
}

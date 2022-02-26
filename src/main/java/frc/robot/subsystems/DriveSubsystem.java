// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveSubsystem extends SubsystemBase {
  private final PWMSparkMax leftDriveMotor = new PWMSparkMax(frc.robot.Constants.leftDriveMotor_ID);
  private final PWMSparkMax rightDriveMotor = new PWMSparkMax(frc.robot.Constants.rightDriveMotor_ID);
  private final DifferentialDrive m_robotDrive = new DifferentialDrive(leftDriveMotor, rightDriveMotor);
  /** Creates a new DriveSubsystem. */
  public DriveSubsystem() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  
}

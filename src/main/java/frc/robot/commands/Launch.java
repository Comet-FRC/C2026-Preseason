package frc.robot.commands;

import static frc.robot.subsystems.fuelSystem.FuelSystemConstants.*;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.fuelSystem.FuelSystem;

public class Launch extends Command {
  private FuelSystem fuelSystem;

  public Launch(FuelSystem fuelSystem) {
    this.fuelSystem = fuelSystem;
    addRequirements(fuelSystem);
  }

  @Override
  public void initialize() {
    fuelSystem.setIntakeLauncher(
        SmartDashboard.getNumber("Launch Launcher Voltage", LAUNCH_LAUNCHER_VOLTAGE));
    fuelSystem.setFeeder(SmartDashboard.getNumber("Eject Feeder Voltage", EJECT_FEEDER_VOLTAGE));
  }

  @Override
  public void execute() {}

  @Override
  public void end(boolean interrupted) {
    fuelSystem.setIntakeLauncher(0);
    fuelSystem.setFeeder(0);
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}

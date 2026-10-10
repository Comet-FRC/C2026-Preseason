package frc.robot.commands;

import static frc.robot.subsystems.fuelSystem.FuelSystemConstants.*;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.fuelSystem.FuelSystem;

public class RevLauncher extends Command {
  private FuelSystem fuelSystem;

  public RevLauncher(FuelSystem fuelSystem) {
    this.fuelSystem = fuelSystem;
    addRequirements(fuelSystem);
  }

  @Override
  public void initialize() {
    fuelSystem.setIntakeLauncher(
        SmartDashboard.getNumber("Launch Launcher Voltage", LAUNCH_LAUNCHER_VOLTAGE));
    // fuelSystem.setFeeder(SmartDashboard.getNumber("Intake Feeder Voltage",
    // INTAKE_FEEDER_VOLTAGE));
  }

  @Override
  public void execute() {}

  @Override
  public void end(boolean interrupted) {}

  @Override
  public boolean isFinished() {
    return false;
  }
}

package frc.robot.commands;

import static frc.robot.subsystems.fuelSystem.FuelSystemConstants.*;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.fuelSystem.FuelSystem;

public class LaunchSequence extends SequentialCommandGroup {
  public LaunchSequence(FuelSystem fuelSystem) {
    addCommands(
        new RevLauncher(fuelSystem)
            .withTimeout(SmartDashboard.getNumber("Rev Launcher Timeout", REV_LAUNCHER_TIMEOUT)),
        new Launch(fuelSystem));
  }
}

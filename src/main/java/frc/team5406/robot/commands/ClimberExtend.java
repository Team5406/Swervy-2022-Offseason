package frc.team5406.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.team5406.robot.subsystems.climber.ClimbSubsystem;

public class ClimberExtend extends CommandBase {
    ClimbSubsystem climber;

    public ClimberExtend(ClimbSubsystem _climber) {
        climber = _climber;
        addRequirements(climber);
    }

    @Override
    public void execute() {
        climber.setClimber(105);
    }

    @Override
    public void initialize() {
    }

    @Override
    public void end(boolean interrupted) {
        System.out.println("Climb - End");
        climber.stopClimber();
    
    }

}
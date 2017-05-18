package brajesh.test.command.executer.pattern;

/**
 * Created by brajesh on 11/5/17.
 */
public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light cmd){
        this.light = cmd;
    }

    @Override
    public void execute() {
        this.light.switchOff();

    }
}

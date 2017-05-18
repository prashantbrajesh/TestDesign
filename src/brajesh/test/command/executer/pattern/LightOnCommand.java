package brajesh.test.command.executer.pattern;

/**
 * Created by brajesh on 11/5/17.
 */
public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        this.light.switchOn();
    }
}

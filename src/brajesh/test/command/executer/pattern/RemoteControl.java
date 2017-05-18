package brajesh.test.command.executer.pattern;

/**
 * Created by brajesh on 11/5/17.
 */
public class RemoteControl {

    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void pressButton(){
        this.command.execute();
    }
}

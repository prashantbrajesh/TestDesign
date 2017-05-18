package brajesh.test.command.executer.pattern;

/**
 * Created by brajesh on 11/5/17.
 */
public class MainExecuter {

    public static void main(String args[]){
        Light l = new Light();
        LightOnCommand lo = new LightOnCommand(l);
        LightOffCommand loff = new LightOffCommand(l);
        RemoteControl controller = new RemoteControl();
        Command fuseLigtCommad = new Command() {
            @Override
            public void execute() {
                System.out.print("hello world");
            }
        };

        controller.setCommand(lo);
        controller.pressButton();
        controller.setCommand(loff);
        controller.pressButton();
        controller.setCommand(fuseLigtCommad);
        controller.pressButton();
    }
}

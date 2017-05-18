package brajesh.test.generic.command.executer;

/**
 * Created by brajesh on 11/5/17.
 */
public class Executer {

    public boolean sync( SyncCommand command){
        try {
            command.success(command.execute());
            return true;
        }catch (RuntimeException e){
            command.failure(e);
            return false;
        }
    }

//    public boolean asyncQ( AsyncCommand command){
//
//    }

}

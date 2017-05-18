package brajesh.test.generic.command.executer;

import java.util.concurrent.Future;

/**
 * Created by brajesh on 11/5/17.
 */
public interface AsyncCommand<T> {
    void success(T var);

    void error(RuntimeException e);

    Future<T> queue();
}

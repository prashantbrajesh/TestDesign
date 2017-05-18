package brajesh.test.generic.command.executer;

/**
 * Created by brajesh on 11/5/17.
 */
public interface SyncCommand<T> {
    T execute();

    void failure(RuntimeException e);

    void success(T var);
}

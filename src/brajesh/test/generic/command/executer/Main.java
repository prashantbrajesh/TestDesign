package brajesh.test.generic.command.executer;

import java.util.LinkedList;

/**
 * Created by brajesh on 11/5/17.
 */
public class Main {
    public static void main(String args[]){
        Executer commandExecuter = new Executer();
        final LinkedList<Integer> finalResult= new LinkedList<Integer>();
        commandExecuter.sync(new SyncCommand<LinkedList<Integer>>() {
            @Override
            public LinkedList<Integer> execute() {
                LinkedList<Integer> result = new LinkedList<Integer>();
                result.add(1);
                result.add(2);
                return result;
            }

            @Override
            public void failure(RuntimeException e) {
                throw e;
            }

            @Override
            public void success(LinkedList<Integer> var) {
                finalResult.addAll(var);
            }
        });

        for (Integer i : finalResult){
            System.out.print(i);
        }
        System.out.println();
        finalResult.forEach(System.out::println);
    }
}

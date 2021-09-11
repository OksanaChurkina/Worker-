package main.java;

public class MainClass {

    public static void main(String[] args) {
        OnTaskDoneListener doneListener = System.out::println;
        OnTaskErrorListener errorListener = System.out::println;
        Worker worker = new Worker(doneListener, errorListener);
        worker.start();

    }
}

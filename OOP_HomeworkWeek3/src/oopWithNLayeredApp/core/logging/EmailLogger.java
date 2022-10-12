package oopWithNLayeredApp.core.logging;

public class EmailLogger implements Logger{
    @Override
    public void log() {
        System.out.println("Emaile loglandı.");
    }
}

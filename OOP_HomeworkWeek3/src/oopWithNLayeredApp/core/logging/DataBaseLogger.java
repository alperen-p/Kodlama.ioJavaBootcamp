package oopWithNLayeredApp.core.logging;

public class DataBaseLogger implements Logger{
    @Override
    public void log() {
        System.out.println("Veritabanına loglandı.");
    }
}

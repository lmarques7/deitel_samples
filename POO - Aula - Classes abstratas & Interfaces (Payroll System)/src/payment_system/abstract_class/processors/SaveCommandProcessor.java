package payment_system.abstract_class.processors;

public class SaveCommandProcessor extends CommandProcessor {
    @Override
    protected void execute(String command) {
        System.out.println("Comando salvo: " + command);
    }
}

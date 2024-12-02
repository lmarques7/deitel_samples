package payment_system.abstract_class.processors;

public class PrintCommandProcessor extends CommandProcessor {
    @Override
    protected void execute(String command) {
        System.out.println("Comando recebido para impressão: " + command);
    }
}




package payment_system.abstract_class.processors;

public class CommandProcessorTest {
    public static void main(String[] args) {
        // Criando processadores
        CommandProcessor printProcessor = new PrintCommandProcessor();
        CommandProcessor saveProcessor = new SaveCommandProcessor();

        // Processando comandos
        printProcessor.process("Imprimir relatório");
        saveProcessor.process("Salvar relatório no disco");
    }
}


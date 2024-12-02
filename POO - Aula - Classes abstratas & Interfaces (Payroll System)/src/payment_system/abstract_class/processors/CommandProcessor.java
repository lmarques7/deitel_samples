package payment_system.abstract_class.processors;

abstract class CommandProcessor {
    // Método concreto para inicializar o processamento
    public void process(String command) {
        System.out.println("Processando comando: " + command);
        execute(command); // Método abstrato chamado no fluxo
    }

    // Método abstrato para execução específica
    protected abstract void execute(String command);
}


package kleber;

public class TabelaSimbolos {

    private static TabelaSimbolos uniqueInstance;

    public TabelaSimbolos() {
    }

    public static synchronized TabelaSimbolos getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new TabelaSimbolos();
        }

        return uniqueInstance;
    }

}

package kleber.symbolTable;

import java.util.ArrayList;
import java.util.function.Consumer;

public class SymbolTable {

    private static SymbolTable uniqueInstance;
    private ArrayList<Symbol> symbols;

    public SymbolTable() {
        symbols = new ArrayList<Symbol>();

    }

    public int size() {
        return symbols.size();
    }

    public int indexOf(Object o) {
        return symbols.indexOf(o);
    }

    public Symbol get(int i) {
        return symbols.get(i);
    }

    public Symbol set(int i, Symbol e) {
        return symbols.set(i, e);
    }

    public boolean add(Symbol e) {
        return symbols.add(e);
    }

    public void clear() {
        symbols.clear();
    }

    public void forEach(Consumer<? super Symbol> cnsmr) {
        symbols.forEach(cnsmr);
    }

    public static synchronized SymbolTable getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SymbolTable();
        }

        return uniqueInstance;
    }

}

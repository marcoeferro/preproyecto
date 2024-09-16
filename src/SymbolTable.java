import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

// Clase que maneja la tabla de símbolos
class SymbolTable {
    private final Stack<Map<String, Symbol>> scopes = new Stack<>();

    public SymbolTable() {
        // Iniciar con un scope global
        enterScope();
    }

    public void enterScope() {
        scopes.push(new HashMap<>());
    }

    public void exitScope() {
        scopes.pop();
    }

    public void addSymbol(String name, String type) {
        if (!scopes.isEmpty()) {
            Map<String, Symbol> currentScope = scopes.peek();
            if (currentScope.containsKey(name)) {
                System.out.println("Error: símbolo '" + name + "' ya declarado.");
            } else {
                currentScope.put(name, new Symbol(name, type, scopes.size()));
            }
        }
    }

    public Symbol lookup(String name) {
        for (int i = scopes.size() - 1; i >= 0; i--) {
            Symbol symbol = scopes.get(i).get(name);
            if (symbol != null) {
                return symbol;
            }
        }
        return null;
    }
}
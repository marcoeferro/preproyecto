// Representa una entrada en la tabla de símbolos
public class Symbol {
    String name;
    String type;
    int scope;

    public Symbol(String name, String type, int scope) {
        this.name = name;
        this.type = type;
        this.scope = scope;
    }
}

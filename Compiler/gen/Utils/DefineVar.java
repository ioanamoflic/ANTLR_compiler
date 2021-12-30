package Utils;

public class DefineVar {
    public String type;
    public String name;
    public String varType;
    public int isConst;

    public DefineVar(String type, String name) {
        this.type = type;
        this.name = name;
        isConst = 0;
        this.varType = null;
    }
}

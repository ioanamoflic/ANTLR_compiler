package Utils;

public class Method {
    public String functionName;
    public String[] functionParametersType;

    public Method(String functionName, String[] type)
    {
        this.functionName = functionName;
        functionParametersType = new String[type.length];
        for(int index=0;index<type.length;index++) {
            functionParametersType[index] = type[index];
        }
    }
}

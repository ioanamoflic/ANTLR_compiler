import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;


public class Semantic {

    private ParseTree parseTree;

    public Semantic(ParseTree parseTree)
    {
        this.parseTree = parseTree;
        WalkTree();
    }

    public void WalkTree()
    {
        lexAnalysisBaseListener listener = new lexAnalysisBaseListener();
        ParseTreeWalker.DEFAULT.walk(listener, parseTree);
    }
}

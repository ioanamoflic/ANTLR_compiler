import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;


public class Compiler {

    private Object Paths;

    public static void main(String[] args) throws IOException {
        CharStream input = null;
        input = CharStreams.fromFileName("Compiler/src/test1.txt");

        lexAnalysisLexer lexer = new lexAnalysisLexer(input);
        lexAnalysisParser parser = new lexAnalysisParser(new BufferedTokenStream(lexer));
        lexer.removeErrorListeners();
        lexer.addErrorListener(ErrorHandling.INSTANCE);
        parser.removeErrorListeners();
        parser.addErrorListener(ErrorHandling.INSTANCE);
        ParseTree parseTree = parser.start();
        Trees.inspect(parseTree, parser);

        Semantic semantic = new Semantic(parseTree);

        FileOutputStream file = new FileOutputStream("Compiler/src/x86_code.out");
        OutputStreamWriter fileWriter = new OutputStreamWriter(file);
        BufferedWriter writer = new BufferedWriter(fileWriter);

        x86Generator gen = new x86Generator();
        gen.PrintBasics();

        gen.visit(parseTree);
        gen.PrintData();
        gen.PrintExit();

        writer.write(".CODE");
        writer.newLine();
        for (int i = 0; i < gen.printList.size(); i++) {
            writer.write(gen.printList.get(i));
            writer.newLine();
        }
        writer.close();

    }

}


package interpreter;

import grammar.ExprLexer;
import grammar.ExprParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            System.out.println("NANI?! Specify path to file: [file].1000-7");
            return;
        }
        // create a CharStream that reads from standard input
        CharStream input = CharStreams.fromFileName(args[0]);

        //	CharStream input = CharStreams.fromStream(System.in);
        //	CharStream input = CharStreams.fromString("x and y");

        // create a lexer that feeds off of input CharStream
        ExprLexer lexer = new ExprLexer(input);

        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // create a parser that feeds off the tokens buffer
        ExprParser parser = new ExprParser(tokens);

        // start parsing at the program rule
        ParseTree tree = parser.program();
        // System.out.println(tree.toStringTree(parser));

        // create a visitor to traverse the parse tree
        Visitor visitor = new Visitor();
        System.out.println(visitor.visit(tree));
    }
}
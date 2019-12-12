package kleber;

import kleber.parser.*;
import java.awt.HeadlessException;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JPanel;
import kleber.symbolTable.SymbolTable;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Run {

    public static void main(String[] args) throws Exception {

        CharStream input = new ANTLRFileStream("teste.kleber");
        KleberLexer lexer = new KleberLexer(input);
        TokenStream tokens = new BufferedTokenStream(lexer);
        KleberParser parser = new KleberParser(tokens);
        //KleberParser.ProgrContext progr = parser.progr();
        SymbolTable symbolTable = SymbolTable.getInstance();
        ParseTree tree = parser.progr();


        Visitor visitor = new Visitor();
        
        visitor.visit(tree);

        for (int i = 0; i < symbolTable.size(); i++) {
            System.out.println(
                    "ID: " + symbolTable.get(i).getId()+ 
                    " Nome: " + symbolTable.get(i).getNome()+
                    " Tipo: " + symbolTable.get(i).getTipo() + 
                    " Valor: " + symbolTable.get(i).getValor() +
                    " Escopo: " + symbolTable.get(i).getEscopo()
            );
        }

        //showParseTreeFrame(progr, parser);
    }

    private static void showParseTreeFrame(ParseTree tree, KleberParser parser) throws HeadlessException {
        JFrame frame = new JFrame("SRC: " + tree.getText());
        JPanel panel = new JPanel();
        TreeViewer viewr = new TreeViewer(Arrays.asList(
                parser.getRuleNames()), tree);
        viewr.setScale(1);
        panel.add(viewr);
        frame.add(panel);
        frame.setSize(1000, 600);
        frame.setState(JFrame.MAXIMIZED_HORIZ);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kleber;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import kleber.parser.KleberBaseVisitor;
import kleber.parser.KleberParser;
import kleber.symbolTable.Symbol;
import kleber.symbolTable.SymbolTable;
import org.antlr.v4.runtime.ParserRuleContext;

/**
 *
 * @author thiago
 */
public class Visitor extends KleberBaseVisitor {

    String escopo = "local";
    String nomeFuncao;

    /*
    @Override
    public Object visitBibcall(KleberParser.BibcallContext ctx) {
        String caminho = ctx.STR().getText();
        caminho = caminho.replace("\"", "");

        try {
            Runtime.getRuntime().exec("cat " + caminho + " dasd " + "teste.kleber" + " > " + "teste.kleber");
        } catch (IOException e) {
            
        }
               return null;
    }
     */
    @Override
    public Object visitGlobal(KleberParser.GlobalContext ctx
    ) {
        escopo = "global";
        return visitChildren(ctx);
    }

    @Override
    public Object visitFunctions(KleberParser.FunctionsContext ctx
    ) {
        escopo = "funcao";
        return visitChildren(ctx);
    }

    @Override
    public Object visitScanf(KleberParser.ScanfContext ctx
    ) {
        boolean flag = true;
        boolean flag2 = false;
        boolean flag3 = false;
        Double oi = 0.0;
        String fl = "";
        Scanner s = new Scanner(System.in);
        String value = s.nextLine();

        for (int i = 0;
                i < SymbolTable.getInstance()
                        .size(); i++) {
            String name = SymbolTable.getInstance().get(i).getNome();
            if (ctx.VAR().getText().equals(name) && (SymbolTable.getInstance().get(i).getEscopo().equals(escopo) || SymbolTable.getInstance().get(i).getEscopo().equals("global"))) {
                flag = true;
                flag2 = true;

                if (value.length() == 1 && SymbolTable.getInstance().get(i).getTipo().equals("char")) {
                    flag3 = true;
                    Symbol e = SymbolTable.getInstance().get(i);
                    e.setValor(value);
                    break;
                } else if (value.matches("[+¬]?[0-9]+(\\.[0-9]+)?") && (SymbolTable.getInstance().get(i).getTipo().equals("int") || SymbolTable.getInstance().get(i).getTipo().equals("float"))) {
                    flag3 = true;
                    Symbol e = SymbolTable.getInstance().get(i);
                    e.setValor(value);
                    break;
                } else if (value.matches("(~[\"\\\\\\r\\n])*") && SymbolTable.getInstance().get(i).getTipo().equals("string")) {
                    flag3 = true;
                    Symbol e = SymbolTable.getInstance().get(i);
                    e.setValor(value);
                    break;
                } else {
                    flag3 = false;
                    break;
                }

            } else {
                flag = false;
            }
        }

        if (flag == false) {
            System.err.println("Variável (" + ctx.VAR().getText() + ") fora do escopo"
            );
            System.exit(0);
        } else if (flag2 == false) {
            System.err.println("Variável (" + ctx.VAR().getText() + ") não declarada"
            );
            System.exit(0);
        } else if (flag3 == false) {
            System.err.println("Entrada para variável (" + ctx.VAR().getText() + ") não é do tipo correto"
            );
            System.exit(0);
        }

        return null;
    }

    @Override
    public Object visitIft(KleberParser.IftContext ctx) {
        Boolean condicao = (Boolean) visit(ctx.boolExpr());

        if (condicao) {
            return visitChildren(ctx);
        } else {
            return null;
        }

    }

    @Override
    public Object visitIfelset(KleberParser.IfelsetContext ctx) {
        Boolean condicao = (Boolean) visit(ctx.boolExpr());

        if (condicao) {
            return visitChildren(ctx.block(0));
        } else {
            return visitChildren(ctx.block(1));
        }
    }

    @Override
    public Object visitExprTrue(KleberParser.ExprTrueContext ctx) {
        return true;
    }

    @Override
    public Object visitExprFalse(KleberParser.ExprFalseContext ctx) {
        return false;
    }

    @Override
    public Object visitExprBool(KleberParser.ExprBoolContext ctx) {
        Double a = (Double) visit(ctx.fact(0));
        Double b = (Double) visit(ctx.fact(1));

        String aux = ctx.relop().getText();
        if (aux.equals("==")) {
            return a.equals(b);
        } else if (aux.equals("<")) {
            return a < b;
        } else if (aux.equals(">")) {
            return a > b;
        } else if (aux.equals("<=")) {
            return a <= b;
        } else if (aux.equals(">=")) {
            return a >= b;
        } else if (aux.equals("!=")) {
            return !a.equals(b);
        }
        return null;
    }

    @Override
    public Object visitPrinExpr(KleberParser.PrinExprContext ctx
    ) {

        Double aux = (Double) visit(ctx.expr());
        System.out.println(aux);

        return null;
    }

    @Override
    public Object visitPrintSTR(KleberParser.PrintSTRContext ctx
    ) {
        String aux = ctx.STR().getText();
        aux = aux.replace("\"", "");
        System.out.println(aux);

        return null;
    }

    @Override
    public Object visitPrintVAR(KleberParser.PrintVARContext ctx
    ) {
        boolean flag = true;

        for (int i = 0;
                i < SymbolTable.getInstance()
                        .size(); i++) {
            String name = SymbolTable.getInstance().get(i).getNome();
            if (ctx.VAR().getText().equals(name) && (SymbolTable.getInstance().get(i).getEscopo().equals(escopo) || SymbolTable.getInstance().get(i).getEscopo().equals("global"))) {
                flag = true;
                Symbol e = SymbolTable.getInstance().get(i);
                System.out.println(e.getValor());
                break;
            } else {
                flag = false;
            }
        }
        if (flag == false) {
            System.err.println("Variável (" + ctx.VAR().getText() + ") fora do escopo");
            System.exit(0);
        }

        return null;
    }

    @Override
    public Object visitFunction(KleberParser.FunctionContext ctx
    ) {
        nomeFuncao = ctx.VAR().getText();
        String tipo = ctx.type().getText();
        String name = nomeFuncao;
        Symbol s = new Symbol((SymbolTable.getInstance().size() + 1), name, tipo, "", escopo);
        SymbolTable.getInstance().add(s);

        return visitChildren(ctx);
    }

    @Override
    public Object visitVariable(KleberParser.VariableContext ctx
    ) {

        String tipo = ctx.type().getText();
        for (int i = 0; i < ctx.VAR().size(); i++) {
            String name = (!ctx.VAR().isEmpty()) ? ctx.VAR().get(i).getText() : "Deu ruim";
            String escp;
            if (escopo.equals("funcao")) {
                escp = nomeFuncao;
            } else {
                escp = escopo;
            }
            Symbol s = new Symbol((SymbolTable.getInstance().size() + 1), name, tipo, "null", escp);
            SymbolTable.getInstance().add(s);
        }

        return visitChildren(ctx);
    }

    @Override
    public Object visitMain(KleberParser.MainContext ctx
    ) {
        escopo = "local";
        return visitChildren(ctx);
    }

    @Override
    public Object visitAtrExpr(KleberParser.AtrExprContext ctx
    ) {

        Double aux = (Double) visit(ctx.expr());
        int aux1 = 0;
        boolean flag = true;
        boolean flag2 = false;
        boolean flag3 = false;
        Integer aux2 = 0;
        String valor = null;

        for (int i = 0;
                i < SymbolTable.getInstance()
                        .size(); i++) {
            String name = SymbolTable.getInstance().get(i).getNome();
            if (ctx.VAR().getText().equals(name) && (SymbolTable.getInstance().get(i).getEscopo().equals(escopo) || SymbolTable.getInstance().get(i).getEscopo().equals("global"))) {
                flag = true;
                flag3 = true;
                Symbol e = SymbolTable.getInstance().get(i);
                if (SymbolTable.getInstance().get(i).getTipo().equals("int")) {
                    aux1 = aux.intValue();
                    aux2 = aux1;
                    valor = aux2.toString();
                    flag2 = true;
                } else if (SymbolTable.getInstance().get(i).getTipo().equals("float")) {
                    valor = aux.toString();
                    flag2 = true;
                }
                if (flag2 == false) {
                    System.err.println("Variável (" + ctx.VAR().getText() + ") não é do tipo numérico");
                    System.exit(0);
                }

                e.setValor(valor);
                SymbolTable.getInstance().set(i, e);
                break;
            } else {
                flag = false;
            }
        }
        if (flag == false) {
            System.err.println("Variável (" + ctx.VAR().getText() + ") fora do escopo");
            System.exit(0);
        }

        if (flag3 == false) {
            System.err.println("Variável (" + ctx.VAR().getText() + ") não declarada");
            System.exit(0);
        }
        return null;
    }

    @Override
    public Object visitAtrString(KleberParser.AtrStringContext ctx
    ) {

        String aux = ctx.STR().getText();
        boolean flag = true;
        boolean flag2 = true;
        boolean flag3 = false;
        aux = aux.replace("\"", "");
        for (int i = 0;
                i < SymbolTable.getInstance()
                        .size(); i++) {
            String name = SymbolTable.getInstance().get(i).getNome();
            if (ctx.VAR().getText().equals(name)) {
                flag3 = true;
                if (SymbolTable.getInstance().get(i).getTipo().equals("string") && (SymbolTable.getInstance().get(i).getEscopo().equals(escopo) || SymbolTable.getInstance().get(i).getEscopo().equals("global"))) {
                    Symbol e = SymbolTable.getInstance().get(i);
                    e.setValor(aux);
                    SymbolTable.getInstance().set(i, e);
                    flag = true;
                    flag2 = true;
                    break;
                } else {
                    flag = false;
                    flag2 = false;

                }
            } else {
                flag3 = false;
            }

        }

        if (flag == false) {
            
            System.err.println("Variável (" + ctx.VAR().getText() + ") não é do tipo string");
            System.exit(0);
        }
         if (flag2 == false) {
            System.err.println("Variável (" + ctx.VAR().getText() + ") fora do escopo");
            System.exit(0);
        }

        if (flag3 == false) {
            System.err.println("Variável (" + ctx.VAR().getText() + ") não declarada");
            System.exit(0);
        }
        return visitChildren(ctx);
    }

    @Override
    public Object visitFor(KleberParser.ForContext ctx) {
        String name = ctx.atr().getText();
        String novoValor = ctx.atr().getText();
        Symbol e = null;
        int aux2 = name.length();
        int aux = name.indexOf("=");
        name = name.substring(0, aux);
        novoValor = novoValor.substring(aux + 1, aux2);
        Double n = 0.0;
        int j = 0;

        boolean flag = false;
        boolean flag2 = false;

        for (int i = 0;
                i < SymbolTable.getInstance()
                        .size(); i++) {
            if (SymbolTable.getInstance().get(i).getNome().equals(name)) {
                flag = true;
                if ((SymbolTable.getInstance().get(i).getTipo().equals("int") || SymbolTable.getInstance().get(i).getTipo().equals("float")) && (SymbolTable.getInstance().get(i).getEscopo().equals(escopo) || SymbolTable.getInstance().get(i).getEscopo().equals("global"))) {
                    flag2 = true;
                    e = SymbolTable.getInstance().get(i);
                    e.setValor(novoValor);
                    SymbolTable.getInstance().set(j, e);
                    j = i;
                    n = Double.parseDouble(e.getValor());
                    break;
                }
            }
        }
        if (flag == false) {
            System.err.println("Variável (" + name + ") não declarada");
            System.exit(0);
        }

        if (flag2 == false) {
            System.err.println("Variável (" + name + ") fora do escopo");
            System.exit(0);
        }

        Boolean cond = (Boolean) visit(ctx.boolExpr());
        while (cond) {

            if (ctx.increment().getText().equals("+=")) {
                n += Double.parseDouble(ctx.NUM().getText());
            } else if (ctx.increment().getText().equals("-=")) {
                n -= Double.parseDouble(ctx.NUM().getText());
            }
            e.setValor(n.toString());
            SymbolTable.getInstance().set(j, e);
            cond = (Boolean) visit(ctx.boolExpr());
            visit(ctx.block());

        }

        return null;
    }

    @Override
    public Object visitReturn0(KleberParser.Return0Context ctx) {
        System.out.println("System return 0");
        System.exit(0);
        return null;
    }

    @Override
    public Object visitFactExpr(KleberParser.FactExprContext ctx) {

        Double a = (Double) visit(ctx.expr());
        return a;
    }

    @Override
    public Object visitAtrChar(KleberParser.AtrCharContext ctx
    ) {
        String aux = ctx.CHARACTERE().getText();
        char a = aux.charAt(1);
        aux = aux.valueOf(a);
        boolean flag = true;
        boolean flag2 = true;

        for (int i = 0;
                i < SymbolTable.getInstance()
                        .size(); i++) {
            String name = SymbolTable.getInstance().get(i).getNome();
            if (ctx.VAR().getText().equals(name) && SymbolTable.getInstance().get(i).getTipo().equals("char")) {
                flag = true;
                if (SymbolTable.getInstance().get(i).getEscopo().equals(escopo) || SymbolTable.getInstance().get(i).getEscopo().equals("global")) {
                    flag2 = true;
                    Symbol e = SymbolTable.getInstance().get(i);
                    e.setValor(aux);
                    SymbolTable.getInstance().set(i, e);
                    break;

                } else {
                    flag2 = false;
                }

            } else {
                flag = false;
            }

        }

        if (flag2 == false) {
            System.err.println("Variável (" + ctx.VAR().getText() + ") fora do escopo");
            System.exit(0);
        }

        if (flag == false) {
            System.err.println("Variável (" + ctx.VAR().getText() + ") não é do tipo char");
            System.exit(0);
        }

        return visitChildren(ctx);
    }

    @Override
    public Object visitFactNUM(KleberParser.FactNUMContext ctx
    ) {
        return Double.parseDouble(ctx.NUM().getText());
    }

    @Override
    public Object visitFactVAR(KleberParser.FactVARContext ctx
    ) {
        Object aux = null;
        String name;
        String tipo;
        String valor;
        String escop;

        for (int i = 0; i < SymbolTable.getInstance().size(); i++) {
            name = SymbolTable.getInstance().get(i).getNome();
            tipo = SymbolTable.getInstance().get(i).getTipo();
            valor = SymbolTable.getInstance().get(i).getValor();
            escop = SymbolTable.getInstance().get(i).getEscopo();

            if (ctx.VAR().getText().equals(name) && (escop.equals(escopo) || escop.equals("global")) && !tipo.equals("string") && !tipo.equals("char")) {
                aux = Double.parseDouble(valor);
                return aux;
            }
        }
        return null;
    }

    @Override
    public Object visitExprDiv(KleberParser.ExprDivContext ctx
    ) {
        Double a = (Double) visit(ctx.fact());
        Double b = (Double) visit(ctx.term());
        return a / b;
    }

    @Override
    public Object visitExprMult(KleberParser.ExprMultContext ctx
    ) {
        Double a = (Double) visit(ctx.fact());
        Double b = (Double) visit(ctx.term());
        return a * b;
    }

    @Override
    public Object visitExprMod(KleberParser.ExprModContext ctx
    ) {
        Double a = (Double) visit(ctx.fact());
        Double b = (Double) visit(ctx.term());
        return a % b;
    }

    @Override
    public Object visitExprSub(KleberParser.ExprSubContext ctx
    ) {
        Double a = (Double) visit(ctx.term());
        Double b = (Double) visit(ctx.expr());
        return a - b;
    }

    @Override
    public Object visitExprPlus(KleberParser.ExprPlusContext ctx
    ) {
        Double a = (Double) visit(ctx.term());
        Double b = (Double) visit(ctx.expr());
        return a + b;
    }

}

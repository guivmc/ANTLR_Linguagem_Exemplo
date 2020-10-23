grammar experiment;	

@header { 
    import java.util.ArrayList;
    import java.util.HashMap; 
    import java.util.Map; 
    import java.util.Scanner; 
}

@members { 
    public class Dado
    {
        public String nome, tipo;

        public int valorInt;

        public float valorFloat;

        public char valorChar;

        public boolean valorBool;

        public Dado(String nome, int valorInt)
        {
            this.nome = nome;
            this.tipo = "int";
            this.valorInt = valorInt;
        }

        public Dado(String nome, float valorFloat)
        {
            this.nome = nome;
            this.tipo = "float";
            this.valorFloat = valorFloat;
        }

        public Dado(String nome, char valorChar)
        {
            this.nome = nome;
            this.tipo = "char";
            this.valorChar = valorChar;
        }

        public Dado(String nome, boolean valorBool)
        {
            this.nome = nome;
            this.tipo = "bool";
            this.valorBool = valorBool;
        }
    }

    private Map<String, Dado> variaveis = new HashMap<String, Dado>();

    private boolean variableDefined(String name){
        return variaveis.containsKey(name);
    }

    private void defineVariable(String name, Dado dado){
        variaveis.put(name, dado);
    }

    private String printVarValue(String varname)
    {
        Dado toPrint = this.variaveis.get(varname);

        if(toPrint.tipo.equals("int"))
            return toPrint.valorInt + "";
        else if(toPrint.tipo.equals("float"))
            return toPrint.valorFloat + "";
        else if(toPrint.tipo.equals("bool"))
            return toPrint.valorBool + "";
        else if(toPrint.tipo.equals("char"))
            return toPrint.valorChar + "";

        return null;
    }

    private void readVar(String varname)
    {
        Dado toRead = this.variaveis.get(varname);

        Scanner in = new Scanner(System.in);

        if(toRead.tipo.equals("int"))
            toRead.valorInt = in.nextInt();
        else if(toRead.tipo.equals("float"))
            toRead.valorFloat = in.nextFloat();
        else if(toRead.tipo.equals("bool"))
            toRead.valorBool = in.nextBoolean();
        else if(toRead.tipo.equals("char"))
            toRead.valorChar = in.next().charAt(0);          


    }
}

//Every line basics
program : (NEWLINE? statement ENDLINE)+ EOF ;

statement : (startIFExpr | startWhileExpr | startDoWhileExpr | startLogExpr | startReadExpr | let ) ;

//var init
let returns [String type]
    : VAR VARNAME {if(variableDefined($VARNAME.text)) throw new IllegalArgumentException("Variavel " + $VARNAME.text+ " ja foi declarada!");}
     '=' (BOOL { defineVariable($VARNAME.text, new Dado($VARNAME.text, Boolean.parseBoolean($BOOL.text))); $type = "bool";} 
     | INT { defineVariable($VARNAME.text, new Dado($VARNAME.text, Integer.parseInt($INT.text))); $type = "int"; } 
     | CHAR { defineVariable($VARNAME.text, new Dado($VARNAME.text, $CHAR.text.charAt(0))); $type = "char"; } 
     | FLOAT { defineVariable($VARNAME.text, new Dado($VARNAME.text, Float.parseFloat($FLOAT.text))); $type = "float"; } 
     | startExpr) 
    ;

//Base if expresion
startIFExpr : IF '(' (ifExpr)+ ')' NEWLINE statement (NEWLINE ELSE NEWLINE statement)? ;

//Num condition or BOOL
ifExpr : BOOL |
startExpr (EQ | NEQ | GTEQ | LTEQ | LT | GT) (INT | FLOAT) (((AND | OR) startExpr (EQ | NEQ | GTEQ | LTEQ | LT | GT) (INT | FLOAT))* ) 
 ;

startWhileExpr : WHILE '(' (ifExpr)+ ')' NEWLINE statement ;

startDoWhileExpr : DO statement WHILE '(' (ifExpr)+ ')' ;

startLogExpr : LOG '(' (STRING { System.out.println($STRING.text); } | VARNAME { System.out.println(printVarValue($VARNAME.text)); } ) ')' ;

startReadExpr : READ '(' VARNAME ')' { readVar($VARNAME.text); } ;

//Base expresion
startExpr :	(expr)* ;

expr returns [String type] 
    :	expr ('*'|'/') expr
    |	expr ('+'|'-') expr
    |	INT | FLOAT | VARNAME
    |	'(' expr ')'
    ;

	
VAR		: 'var' ;
IF		: 'if' ;
ELSE	: 'else' ;
WHILE	: 'while' ;
DO		: 'do' ;
//Print screen
LOG 	: 'log' ;
//Read input
READ	: 'read' ;

OR 		: '||' ;
AND 	: '&&' ;
EQ 		: '==' ;
NEQ 	: '!=' ;
GT 		: '>' ;
LT 		: '<' ;
GTEQ 	: '>=' ;
LTEQ 	: '<=' ;
	
BOOL : ('true' | 'false') ;


ENDLINE : ';' ;
NEWLINE : [\r\n]+ ;	

//Vars
VARNAME : [a-zA-Z]+ ;
CHAR	: '\u0027'[a-zA-Z]'\u0027' ;
INT     : [0-9]+ ;
FLOAT   : INT ('.' INT)? ;
STRING  : '"' ([a-zA-Z] | WHITESPACE )* '"';

WHITESPACE : [ \t\r\n] -> skip ;

//CLASS
//antlr experiment.g4
//javac experiment*.java
//grun experiment program example.txt -gui
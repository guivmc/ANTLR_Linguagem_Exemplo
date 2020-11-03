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

    private boolean variableDefined(String varname){
        return variaveis.containsKey(varname);
    }

    private void defineVariable(String varname, Dado dado){
        variaveis.put(varname, dado);
    }

    private void changeValue(String varname, String value)
    {
        Dado toChange = this.variaveis.get(varname);
        if(toChange.tipo.equals("int"))
            toChange.valorInt = Integer.parseInt(value);
        else if(toChange.tipo.equals("float"))
             toChange.valorFloat = Float.parseFloat(value);
        else if(toChange.tipo.equals("bool"))
             toChange.valorBool =  Boolean.parseBoolean(value);
        else if(toChange.tipo.equals("char"))
             toChange.valorChar = value.charAt(0);
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
    private void initCode()
    {
        System.out.println("Guilherme Carvalhal (211002514)");
        System.out.println("Guilherme Carvalho Lucas (20311639)");
        System.out.println("import java.util.Scanner;");
       
        System.out.println("public class Main {");
        System.out.println("public static void main(String[] args) {");
        System.out.println("Scanner in = new Scanner(System.in);");
    }

    private void endCode()
    {
        System.out.println("}");
        System.out.println("}");
    }
    private String parseIfString(String condition){
        String completeIf = "if("+condition+"){" ;
        return completeIf;
    }
    private String parseWhileString(String condition){
        String whileString = "while("+condition+"){";
        return whileString;
    }
    private String parseDoWhileString(String condition){
        String doWhileString = "} while("+condition+");";
        return doWhileString;
    }
    private String parseLogString(String logMessage){
        char doubleQuote ='"';
        String  parsedLogMessage = "System.out.println(" + logMessage + ");";
        return parsedLogMessage;
    }
    private String parseDeclarationString(String varName,String content,String type){
        char doubleQuote ='"';
        if(type.equals("char")){
            String parsedVariableDeclarationString = type+" "+varName+" = " + content + ";";
            return parsedVariableDeclarationString;
        }else if(type.equals("String")){
            String parsedVariableDeclarationString = type+" "+varName+" = "+ content +";";
            return parsedVariableDeclarationString;
        }else{
            String parsedVariableDeclarationString = type+" "+varName+" = "+content+";";
            return parsedVariableDeclarationString;
        }
    }

    private String parseReadDeclaration(String varname)
    {
        String declaration = varname + " = ";

        Dado toRead = this.variaveis.get(varname);

        if(toRead.tipo.equals("int"))
            declaration += "in.nextInt();";
        else if(toRead.tipo.equals("float"))
            declaration += "in.nextFloat();";
        else if(toRead.tipo.equals("bool"))
            declaration += "in.nextBoolean();";
        else if(toRead.tipo.equals("char"))
            declaration += "in.next().charAt(0);";

        return declaration;
    }

    private String parseVarToBool(String varname)
    {
        if (this.variaveis.get(varname).tipo.equals("bool"))
            return varname;
        else
            throw new IllegalArgumentException("Variavel " + varname + " nao eh bool!");
    }
}

//Every line basics
program : {initCode();} (NEWLINE? statement {System.out.print($statement.statementString + "\n");} ENDLINE)+  EOF {endCode();} ;

statement returns [String statementString]
: (startIFExpr{$statementString = $startIFExpr.completeIfExpression;}
| startWhileExpr{$statementString = $startWhileExpr.whileStatement;}
 | startDoWhileExpr{$statementString = $startDoWhileExpr.doWhileStatement;}
 | startLogExpr{$statementString = $startLogExpr.logStatement;}
 | startReadExpr { $statementString = $startReadExpr.readStatement;}
 | let {$statementString = $let.declarationString;}
 | att {$statementString = $att.declarationString + ";";});


//var init
let returns [String type, String declarationString]
    : VAR VARNAME {if(variableDefined($VARNAME.text)) throw new IllegalArgumentException("Variavel " + $VARNAME.text+ " ja foi declarada!");}
     '=' (BOOL { defineVariable($VARNAME.text, new Dado($VARNAME.text, Boolean.parseBoolean($BOOL.text))); $type = "boolean";$declarationString = parseDeclarationString($VARNAME.text,$BOOL.text,$type);}
     | INT { defineVariable($VARNAME.text, new Dado($VARNAME.text, Integer.parseInt($INT.text))); $type = "int"; $declarationString = parseDeclarationString($VARNAME.text,$INT.text,$type);}
     | CHAR { defineVariable($VARNAME.text, new Dado($VARNAME.text, $CHAR.text.charAt(0))); $type = "char"; $declarationString = parseDeclarationString($VARNAME.text,$CHAR.text,$type);}
     | FLOAT { defineVariable($VARNAME.text, new Dado($VARNAME.text, Float.parseFloat($FLOAT.text))); $type = "double"; $declarationString = parseDeclarationString($VARNAME.text,$FLOAT.text,$type);}
     | startExpr {defineVariable($VARNAME.text, new Dado($VARNAME.text, 0)); $type = "int"; $declarationString = $startExpr.text;})
    ;

att returns  [String type, String declarationString]
    : VARNAME {if(!variableDefined($VARNAME.text)) throw new IllegalArgumentException("Variavel " + $VARNAME.text+ " nao foi declarada!");}
    '=' (BOOL {changeValue($VARNAME.text, $BOOL.text); $declarationString = $VARNAME.text + " = " +  $BOOL.text; }
    | INT {changeValue($VARNAME.text, $INT.text);  $declarationString = $VARNAME.text + " = " +  $INT.text; }
    | CHAR {changeValue($VARNAME.text, $CHAR.text);  $declarationString = $VARNAME.text + " = " +  $CHAR.text; }
    | FLOAT {changeValue($VARNAME.text, $FLOAT.text);  $declarationString = $VARNAME.text + " = " +  $FLOAT.text; }
    | startExpr  {changeValue($VARNAME.text, "0"); $declarationString = $VARNAME.text + " = " +  $startExpr.text;} ) 
    ;

//Base if expression
// else currently not working
startIFExpr returns [String completeIfExpression] : IF '(' (ifExpr)+ ')' {$completeIfExpression = parseIfString($ifExpr.condition);} '{' (NEWLINE statement {$completeIfExpression += "\n" + $statement.statementString;} ENDLINE )+ NEWLINE '}' {$completeIfExpression += "\n}";}
 (NEWLINE ELSE {$completeIfExpression += "else {"; } '{' (NEWLINE statement {$completeIfExpression += "\n" + $statement.statementString;} ENDLINE NEWLINE)+ '}' {$completeIfExpression += "\n}";})? ;

//Num condition or BOOL
ifExpr returns[String condition] : BOOL{$condition = $BOOL.text;} | boolExpr {$condition = $boolExpr.text;} | VARNAME {$condition = parseVarToBool($VARNAME.text);} ;

//Aqui da ruim :C 
boolExpr : startExpr (EQ | NEQ | GTEQ | LTEQ | LT | GT) (INT | FLOAT | VARNAME);

startWhileExpr returns [String whileStatement] : WHILE '(' (ifExpr)+ ')'  {$whileStatement = parseWhileString($ifExpr.condition);} '{' (NEWLINE statement {$whileStatement += "\n" + $statement.statementString; } ENDLINE)+ NEWLINE '}' {$whileStatement += "\n}";};

startDoWhileExpr returns [String doWhileStatement] : DO '{'  {$doWhileStatement = "do {";} (NEWLINE statement {$doWhileStatement += "\n" + $statement.statementString; } ENDLINE)+ NEWLINE '}' WHILE '(' (ifExpr)+ ')' {$doWhileStatement += parseDoWhileString($ifExpr.condition); };

startLogExpr returns [String logStatement] : LOG '(' (STRING { $logStatement = parseLogString($STRING.text); } | VARNAME { $logStatement = parseLogString($VARNAME.text); } ) ')' ;

startReadExpr returns [String readStatement] : READ '(' VARNAME ')' { $readStatement = parseReadDeclaration($VARNAME.text); } ;

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
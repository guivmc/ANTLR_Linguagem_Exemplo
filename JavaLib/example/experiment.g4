grammar experiment;	

@header { 
    import java.util.ArrayList;
}

@members {
    private ArrayList<String> variableNames = new ArrayList<String>();

    private boolean variableDefined(String name){
        return variableNames.contains(name);
    }

    private void defineVariable(String name){
        variableNames.add(name);
    }
}

//Every line basics
program : (NEWLINE? statement ENDLINE)+ EOF ;

statement : (startIFExpr | startWhileExpr | startDoWhileExpr | startLogExpr | startReadExpr | let {System.out.println($let.type);}) ;

//var init
let returns [String type]
    : VAR VARNAME {if(variableDefined($VARNAME.text)) throw new IllegalArgumentException("Variavel " + $VARNAME.text+ " ja foi declarada!");}
     '=' (BOOL {$type = "bool"; } 
     | INT {$type = "int"; } 
     | CHAR {$type = "char"; } 
     | FLOAT {$type = "float"; } 
     | startExpr) 
     {defineVariable($VARNAME.text);} ;

//Base if expresion
startIFExpr : IF '(' (ifExpr)+ ')' NEWLINE statement (NEWLINE ELSE NEWLINE statement)? ;

//Num condition or BOOL
ifExpr : BOOL |
startExpr (EQ | NEQ | GTEQ | LTEQ | LT | GT) (INT | FLOAT) (((AND | OR) startExpr (EQ | NEQ | GTEQ | LTEQ | LT | GT) (INT | FLOAT))* ) 
 ;

startWhileExpr : WHILE '(' (ifExpr)+ ')' NEWLINE statement ;

startDoWhileExpr : DO statement WHILE '(' (ifExpr)+ ')' ;

startLogExpr : LOG '(' (STRING { System.out.println($STRING.text); } | VARNAME ) ')' ;

startReadExpr : READ '(' VARNAME ')' ;

//Base expresion
startExpr :	(expr)* ;

expr :	expr ('*'|'/') expr
    |	expr ('+'|'-') expr
    |	INT | FLOAT
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
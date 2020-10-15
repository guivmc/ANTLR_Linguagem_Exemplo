grammar experiment;		

//Every line basics
program : (NEWLINE? statement ENDLINE)+ EOF ;

statement : (startIFExpr | startWhileExpr | startDoWhileExpr | startLogExpr | startReadExpr | let) ;

//var init
let : VAR VARNAME '=' (BOOL | INT | CHAR | FLOAT | startExpr) ;

//Base if expresion
startIFExpr : IF '(' (ifExpr)+ ')' NEWLINE statement (NEWLINE ELSE NEWLINE statement)? ;

//Num condition or BOOL
ifExpr : BOOL |
startExpr (EQ | NEQ | GTEQ | LTEQ | LT | GT) (INT | FLOAT) (((AND | OR) startExpr (EQ | NEQ | GTEQ | LTEQ | LT | GT) (INT | FLOAT))* ) 
 ;

startWhileExpr : WHILE '(' (ifExpr)+ ')' NEWLINE statement ;

startDoWhileExpr : DO statement WHILE '(' (ifExpr)+ ')' ;

startLogExpr : LOG '(' STRING | VARNAME ')' ;

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


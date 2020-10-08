grammar experiment;		

//Every line basics
program : (NEWLINE? statement ENDLINE)+ EOF ;

statement : startIFExpr | let ;

//Base if expresion
startIFExpr : IF '(' (ifExpr)+ ')' NEWLINE statement (NEWLINE ELSE NEWLINE statement)? ;

//Num condition or BOOL
ifExpr : BOOL |
startExpr (EQ | NEQ | GTEQ | LTEQ | LT | GT) (INT | FLOAT) (((AND | OR) startExpr (EQ | NEQ | GTEQ | LTEQ | LT | GT) (INT | FLOAT))* ) 
 ;

//var init
let : VARNAME '=' (BOOL | INT | CHAR | FLOAT | startExpr) ;

//Base expresion
startExpr :	(expr)* ;

expr :	expr ('*'|'/') expr
    |	expr ('+'|'-') expr
    |	INT | FLOAT
    |	'(' expr ')'
    ;
	
	
ENDLINE : ';' ;
NEWLINE : [\r\n]+ ;	

//Vars
VARNAME : [a-zA-Z]+ ;

BOOL : 'true' | 'false' ;

CHAR	: '\u0027'[a-zA-Z]'\u0027' ;

INT     : [0-9]+ ;
FLOAT   : INT ('.' INT)? ;


NULL : 'null';

//If and loops
IF		: 'if' ;
ELSE	: 'else' ;
WHILE	: 'while' ;
FOR 	: 'for' ;
OR 		: '||' ;
AND 	: '&&' ;
EQ 		: '==' ;
NEQ 	: '!=' ;
GT 		: '>' ;
LT 		: '<' ;
GTEQ 	: '>=' ;
LTEQ 	: '<=' ;

//Print screen
LOG 	: 'log' ;

//Read input
READ	: 'read' ;

WHITESPACE : [ \t\r\n] -> skip ;

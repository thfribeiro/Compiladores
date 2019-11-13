grammar Kleber;

@header {
package kleber.parser;
}

progr             : (bibcall)+ global? functions? main 
                  ;
bibcall		  : INCLUDE STR
		  ;
global		  : GLOBAL OBL (variable EOL)+ CBL
		  ;
functions         : FUNCTIONS OBL (function EOL)+ CBL
                  ;
function          : type VAR OEX ((variable SEP)* variable)? CEX functionBlock 
                  ;
main     	  : MAIN block
		  ;
line              : read          
                  | write         
                  | atr           
                  | ifstm
                  ;
read              : READ VAR
                  ;
write             : WRITE STR     
                  | WRITE expr    
                  ;
variable          : type VAR
                  | type VAR (SEP VAR)*
	          ;
type	          : INT
	          | FLOAT
	          | BOOLEAN
	          | STRING
	          ;
atr               : VAR ATR expr
                  ;
ifstm             : IF OEX boolExpr CEX block 
                  | IF OEX boolExpr CEX block ELSE block
                  ;
forstm	          : FOR CEX atr EOL boolExpr EOL increment CEX block
	          ;
expr              : term ADD expr 
                  | term SUB expr
		  | term
                  ;
term              : fact MUL term 
                  | fact DIV term 
                  | fact MOD term
		  | fact
                  ;
fact              : VAR 
                  | NUM 
                  | OEX expr CEX 
                  ;
boolExpr          : fact 
                  | NOT boolExpr 
                  | fact relop fact 
                  | TRUE 
                  | FALSE
                  ;
relop             : GR
                  | LS
                  | EQ 
                  | GRT 
                  | LST 
                  | NEQ
                  ;
increment	  : PEG
		  | MEG
		  ;
block             : OBL (line EOL)+ CBL
                  ;
functionBlock     : OBL (line EOL)+ RETURN fact EOL CBL
                  ;

RETURN      : 'return';
FUNCTIONS   : 'functions';
INT         : 'int';
FLOAT       : 'float';
BOOLEAN     : 'boolean';
STRING      : 'string';
TRUE        : 'true';
FALSE       : 'false';
READ        : 'read';
WRITE       : 'write';
IF          : 'if';
ELSE        : 'else';
MAIN	    : 'main';
INCLUDE	    : '#include';
GLOBAL	    : 'global';
STR         : '"'(~["\\\r\n])*'"';
NUM         : [+-]?[0-9]+('.'[0-9]+)?;
VAR         : [a-zA-Z][a-zA-Z0-9_]*;
GR          : '>'; 
LS          : '<'; 
EQ          : '=='; 
GRT         : '>=';
LST         : '<='; 
NEQ         : '!=';
ATR         : '=';
PEG	    : '+=';
MEG	    : '-=';
OEX         : '(';
CEX         : ')';
OBL         : '{';
CBL         : '}';
NOT         : '!'|'NOT';
ADD         : '+';
SUB         : '-';
MUL         : '*';
DIV         : '/';
SEP         : ',';
MOD         : '%';
EOL         : ';';
COMMENT     : '/*' .*? '*/' -> skip;
LINE_COMMENT: '//' ~[\r\n]* -> skip;
WS          : [ \t\r\n]+ -> skip;

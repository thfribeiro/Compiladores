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
line              : printf     
                  | scanf
                  | variable
                  | atr           
                  | ifstm
                  | forstm
                  | ret
                  ;
printf            : PRINTF OEX printparam CEX
                  ;
printparam        : STR #printSTR
                  | VAR #printVAR
                  | expr #prinExpr
                  ;
scanf             : SCANF OEX VAR CEX
                  ;
variable          : type VAR (SEP VAR)*
	          ;
type	          : INT 
	          | FLOAT
                  | CHAR
	          | STRING 
	          ;
atr               : VAR ATR expr #atrExpr
                  | VAR ATR STR #atrString
                  | VAR ATR CHARACTERE #atrChar
                  ;
ifstm             : IF OEX boolExpr CEX block #ift
                  | IF OEX boolExpr CEX block ELSE block #ifelset
                  ;
forstm	          : FOR OEX atr EOL boolExpr EOL VAR increment NUM CEX block #for
	          ;
expr              : term ADD expr               #exprPlus
                  | term SUB expr               #exprSub
		  | term                        #exprTerm
                  ;
term              : fact MUL term               #exprMult
                  | fact DIV term               #exprDiv
                  | fact MOD term               #exprMod
		  | fact                        #exprFact
                  ;
fact              : VAR  #factVAR
                  | NUM  #factNUM
                  | OEX expr CEX #factExpr
                  ;
boolExpr          : fact relop fact #exprBool
                  | TRUE #exprTrue
                  | FALSE #exprFalse
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
ret               : RETURN '0' #return0
                  ;
functionBlock     : OBL (line EOL)* (ret)? CBL
                  ;


RETURN      : 'return';
PRINTF      : 'printf';
SCANF       : 'scanf';
FUNCTIONS   : 'functions';
INT         : 'int';
FLOAT       : 'float';
STRING      : 'string';
CHAR        : 'char';
TRUE        : 'true';
FALSE       : 'false';
READ        : 'read';
WRITE       : 'write';
IF          : 'if';
ELSE        : 'else';
FOR         : 'for';
MAIN	    : 'main';
INCLUDE	    : '#include';
GLOBAL	    : 'global';
STR         : '"'(~["\\\r\n])*'"';
NUM         : [+¬]?[0-9]+('.'[0-9]+)?;
VAR         : [a-zA-Z][a-zA-Z0-9_]*;
CHARACTERE  : '\''[a-zA-Z]'\'';
GR          : '>'; 
LS          : '<';
EQ          : '=='; 
GRT         : '>=';
LST         : '<='; 
NEQ         : '!=';
ATR         : '=';
ASP         : '"';
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
WS          : [ \t\r\n]+ -> skip;


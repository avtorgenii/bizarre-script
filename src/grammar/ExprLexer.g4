lexer grammar ExprLexer;

// Types
INT_TYPE    : 'int' ;
FLOAT_TYPE  : 'float' ;
BOOL_TYPE   : 'bool' ;
STRING_TYPE : 'string' ;

// Keywords
PROG_START : 'DOMAIN_EXPANSION' ;
PROG_END : 'OMAE_WA_MOU_SHINDEIRU';
IF_kw  : 'NANI?';
ELSE_kw : 'YARE_YARE_DAZE' ;
PRINT_kw : 'DATTEBAYO' ;
READ_kw  : 'ZAWARUDO';
FUNC_DEF : 'KO_RE_WA_REQUIEM';
RETURN_kw : 'ARRIVEDERCI' ;
FOR_kw : 'ORAORAORA' ;

// --- Logical operators---
AND : 'SO?' ;
OR  : 'ISEKAI' ;
NOT : 'DAGA_KOTOWARU' ;

// --- Comparison operators ---
EQUAL    : 'EQUIVALENT_EXCHANGE' ;
NOTEQUAL : 'KONO_DIO_DA' ;
GT       : '>' ;
LT       : '<' ;
GE       : '>=' ;
LE       : '<=' ;

// --- Maths ---
MUL : '*' ;
DIV : '/' ;
ADD : '+' ;
SUB : '-' ;
INCR : 'PLUS_ULTRA';
DECR : 'MUDA';

// --- Utility symbols ---
ASSIGN : 'DESU' ;
COMMA : ',' ;
SEMI : ';' ;
LPAREN : '(' ;
RPAREN : ')' ;
LCURLY : '{' ;
RCURLY : '}' ;



// Literals
FLOAT  : [0-9]+ '.' [0-9]* | '.' [0-9]+ ;
STRING : '"' .*? '"' ;
BOOL   : 'true' | 'false' ;
INT    : [0-9]+ ;

// Etc
ID     : [a-zA-Z_][a-zA-Z_0-9]* ; // variable or function names
WS     : [ \t\n\r\f]+ -> skip ;  // spaces, tabs and переносы строк - skip = Выбросить токен в корзину. Парсер его никогда не увидит, он исчезнет навсегда.
Other  : . ;  // catches all other symbols
COMMENT : '/*' .*? '*/' -> channel(HIDDEN) ; // Отправить токен в «скрытый канал».
LINE_COMMENT : '//' ~'\n'* '\n' -> channel(HIDDEN) ; // Отправить токен в «скрытый канал».
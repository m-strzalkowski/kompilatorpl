lexer grammar Lekserpl; // note "lexer grammar"

ZMIENN : CALK'.'CALK; //zmiennoprzecinkowa liczba
CALK :   [0-9]+ ;   //zwykła liczba
//STRING : '"'~('"')*'"';
ZNAK_DOSL
    :   '\'' ( EscapeSequence | ~('\''|'\\') ) '\''
    ;

NAPIS_DOSL
    :  '"' ( EscapeSequence | ~('\\'|'"') )* '"'
    ;
fragment
EscapeSequence
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\');
ID  :   [a-zA-Z]+([0-9])* ;      // identyfikatory
EOS: ';';//END-OF-STATEMENT - koniec instrukcji, po polsku ewentualnie Egzaltowany-Okropnie-Srednik
WS  :   [ \t\r\n]+ -> skip ; // ignorowanie białych znaków

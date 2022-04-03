lexer grammar Lekserpl; // note "lexer grammar"
NIC : 'nic' | 'NIC' | 'Nic';
ZMIENN : CALK'.'CALK; //zmiennoprzecinkowa liczba
CALK :   [0-9]+ ;   //zwykła liczba
//STRING : '"'~('"')*'"';
//STRING: '"' (ESC|.)*? '"' z książki
ZNAK_DOSL
    :   '\'' ( EscapeSequence | ~('\''|'\\') ) '\''
    ;

NAPIS_DOSL
    :  '"' ( EscapeSequence | ~('\\'|'"') )* '"'
    ;
fragment
EscapeSequence
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\''|'\\');
//ID  :   [a-zA-Z_]+([0-9])* ;      // identyfikatory
ID  :   [A-Za-z\uc480-\uc588][0-9A-Za-z\uc480-\uc588_]* ;      // identyfikatory (ze znakami z bloku "Latin extended A", gdzie sa polskie ogonki)
EOS: ';';//END-OF-STATEMENT - koniec instrukcji, po polsku ewentualnie Egzaltowany-Okropnie-Srednik
//więte z książki
LINE_COMMENT : '//' .*? '\r'? '\n' -> skip ; // Match "//" stuff '\n'
COMMENT : '/*' .*? '*/' -> skip ; // Match "/*" stuff "*/
WS  :   [ \t\r\n]+ -> skip ; // ignorowanie białych znaków
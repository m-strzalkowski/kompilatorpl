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
ID  :   ([A-Za-z]|OGONKI)([0-9A-Za-z_]|OGONKI)* ;      // identyfikatory
fragment OGONKI : [\u0104\u0105\u0106\u0107\u0118\u0119\u0141-\u0144\u015A\u015B\u0179-\u017C\u00D3\u00F3];//ąćęłńśźżóĄĆĘŁŃŚŹŻÓ - polskie ogonki
EOS: ';';//END-OF-STATEMENT - koniec instrukcji, po polsku ewentualnie Egzaltowany-Okropnie-Srednik
//więte z książki
LINE_COMMENT : '//' .*? '\r'? '\n' -> skip ; // Match "//" stuff '\n'
COMMENT : '/*' .*? '*/' -> skip ; // Match "/*" stuff "*/
WS  :   [ \t\r\n]+ -> skip ; // ignorowanie białych znaków
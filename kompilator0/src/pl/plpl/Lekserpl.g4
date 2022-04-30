lexer grammar Lekserpl; // note "lexer grammar"
ZNACZNIK_DEBUGGERA :   '<<' ~( '<') *? '>>' -> channel(333)
                    ;
NIC : 'nic' | 'NIC' | 'Nic';
STATYCZN: 'statyczn'[yea];
AUTOMATYCZN : 'automatyczn'[yea];
STAL : 'sta'[\u0142][yea];
TCALK: 'ca'[\u0142]'k';
TRZECZYW: 'rzeczyw';
TZNAK: 'znak';
TREF: 'ref';

ZMIENN : CALK'.'CALK; //zmiennoprzecinkowa liczba
CALK :   [0-9]+ ;   //zwykła liczba
ZNAK_DOSL
    :   '\'' ( EscapeSequence | ~('\''|'\\') ) '\''
    ;

NAPIS_DOSL
    :  '"' ( EscapeSequence | ~('\\'|'"') )* '"'
    ;

LINIA_ASEMBLERA : '$$' .*? '\r'? '\n';
fragment
EscapeSequence
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\''|'\\');
ID  :   ([A-Za-z]|OGONKI)([0-9A-Za-z_]|OGONKI)* ;      // identyfikatory
fragment OGONKI : [\u0104\u0105\u0106\u0107\u0118\u0119\u0141-\u0144\u015A\u015B\u0179-\u017C\u00D3\u00F3];//ąćęłńśźżóĄĆĘŁŃŚŹŻÓ - polskie ogonki
EOS: ';';//END-OF-STATEMENT - koniec instrukcji, po polsku ewentualnie Egzaltowany-Okropnie-Srednik
//więte z książki

LINE_COMMENT : '//' .*? '\r'? '\n' -> skip ; // Match "//" stuff '\n'
COMMENT : '/*' .*? '*/' -> skip ; // Match "/*" stuff "*/
WS  :   [ \t\r\n]+ -> skip ; // ignorowanie białych znaków
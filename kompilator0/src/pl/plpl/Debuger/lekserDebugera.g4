lexer grammar lekserDebugera;
OTW : '<';
ZMK : '>';
PRZEBIEG_TYPOWANIA : 'TYP'| 'T';
PRZEBIEG_ANALIZY_SEMANTYCZNEJ : 'SEM'| 'S';
PRZEBIEG_GENERACYJNY : 'GEN'|'G';
SEPARATOR_ZNACZNIKOWY: ':'-> mode(KOMENDY);
WSZ  :   [ \t\n\r]+ -> skip ;
//NASTEPNA : '\\';

mode KOMENDY;
ZMKK : '>' -> mode(DEFAULT_MODE);
PROC: 'procedura' | 'proc'('.')? | 'proced'('.')?;
ZAKR: 'zakres' | 'zakr'('.'?);
GWIAZDKA: '*';
SREDNIK: ';';
PRZECINEK: ',';
ZGIN: ('zgiń'| '`');
DOKONCZ: ('dokończ'|'dok.');
RAMKA: 'ramka';
STATYCZNE: 'statyczn'('.'|'e')?;
SEKCJA: 'sekcja';
TYPY:'typy';
TOKENY:'tokeny';
DRZEWO:'drzewo' ('składniowe'| 'syntaktyczne')?;
SYMBOLE: ('symbole'| 'przestrzeń nazw');
SYMBOL: ('symbol'| 'sym');
TU: 'tu';
TUIWYZEJ: 'tuiwyżej';
CD:'cd';
LS: 'ls';
TEXT: ('.')?'text';
BSS: ('.')?'bss';
DATA: ('.')?'data';
RODATA: ('.')?'rodata';
ID  :   ([A-Za-z]|OGONKI)([0-9A-Za-z_]|OGONKI)* ;      // identyfikatory
NUM :   [0-9]+ ;   //zwykła liczba
WS  :   [ \t\n\r]+ -> skip ;
NASTEPNA : '\\';
SL_COMMENT
    :   '//' .*? '\n' -> skip
    ;
fragment OGONKI : [\u0104\u0105\u0106\u0107\u0118\u0119\u0141-\u0144\u015A\u015B\u0179-\u017C\u00D3\u00F3];//ąćęłńśźżóĄĆĘŁŃŚŹŻÓ - polskie ogonki


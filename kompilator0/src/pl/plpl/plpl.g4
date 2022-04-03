grammar plpl;
import Lekserpl;
program : (byt_globalny)*;
byt_globalny: procedura | deklaracja_typu | deklaracja_prosta;

procedura   :  'procedura' ('->' pelny_typ)? '{' lista_instrukcji  '}';

deklaracja_typu   : 'typ'  ID  '{' ( deklaracja_prosta )+ '}';//użytkownik wprowadza nowy typ
deklaracja_prosta   :  deklaracja_atomiczna  |  deklaracja_referencji;//użytkownik deklarje obiekt istniejącego już typu (atomicznego, bądź zdefiniowanego)

deklaracja_referencji   :
    pelny_typ ID  EOS |//pełny typ to np. całk[][]
    pelny_typ  ID   '='  (ID | NAPIS_DOSL) EOS ;

deklaracja_atomiczna   :  nazwa_typu_atom   ID (',' ID)*  EOS
                |  nazwa_typu_atom   ID  '='  (CALK | ZMIENN | ZNAK_DOSL) (ID  '='  (CALK | ZMIENN | ZNAK_DOSL))* EOS ;

lista_instrukcji   : instrukcja+;
instrukcja   :   instrukcja_wyboru
             |   instrukcja_petli
             |   instrukcja_zlozona
             |   instrukcja_prosta
             |   instrukcja_wkroczenia
             |   instrukcja_przerwania_petli
             |   instrukcja_kontynuacji_petli
             |   instrukcja_powrotu
             |   instrukcja_zakonczenia
             |   deklaracja_atomiczna
             |   deklaracja_referencji;
instrukcja_zlozona  : '{'  lista_instrukcji?  '}';
instrukcja_wyboru   : 'jeśli' '(' wyrazenie ')' instrukcja  ('inaczej'  instrukcja)?;
instrukcja_petli   : 'dopóki' '(' wyrazenie ')' instrukcja;
instrukcja_powrotu   : 'zwróć' '(' wyrazenie? ')' EOS;
instrukcja_wkroczenia   : 'zacznij'  ID '(' lista_parametrow_formalnych ')' EOS;
instrukcja_zakonczenia : 'skończ' '(' wyrazenie ')' EOS;
instrukcja_przerwania_petli   : 'przerwij' EOS;
instrukcja_kontynuacji_petli   : 'kontynuuj' EOS;
instrukcja_prosta  :   wyrazenie EOS;

lista_parametrow_formalnych : (deklaracja_parametru  (',' deklaracja_parametru)*)?;
deklaracja_parametru   :  pelny_typ   ID;

/* przykład z książki
expression
    :   expression mult='*' expression          # expressionMultExpression
    |   expression add=( '+' | '-' ) expression # expressionAddExpression
    |   VARIABLE '=' expression                 # expressionAssign
    |   '(' expression ')'                      # parenthesisedExpression
    |   atom                                    # atomExpression
    ;
*/
wyrazenie
          : wywolanie_funkcji                           #wyrazenieWywolanie
          | lwartosc                                    #wyrazenieLwartosc//
          | adr='@' lwartosc                            #wyrazenieAdres //funkcje rodem z C będą i tak potrzebować adresów....
          | neg='!' wyrazenie                           #wyrazenieNegacja
          | znak=('-'| '+') wyrazenie                   #wyrazenieZnak
          | <assoc=right> wyrazenie '^' wyrazenie       #wyrazeniePoteg
          | wyrazenie mult=('*' | '/' |'%') wyrazenie   #wyrazenieMult
          | wyrazenie addyt=('+' | '-') wyrazenie       #wyrazenieAddyt
          | wyrazenie logicz=('&&' | '||')wyrazenie    #wyrazenieLogicz
          | wyrazenie porownanie=('==' | '!=' | '>' | '<' | '<=' | '>=')wyrazenie    #wyrazeniePorownanie
          | przypisanie                                 #wyrazeniePrzypisanie
          | stala_atomiczna                             #wyrazenieStala
          | ID                                          #wyrazenieId
          | '(' wyrazenie ')'                           #wyrazenieNawiasy
          ;

 lwartosc: ID (selektor_tablicowy)?(selektor_typu_zlozonego(selektor_tablicowy)*)*;//konstrukcje typu a.b[d+2][7][12+w]
 selektor_tablicowy   :  '['  wyrazenie  ']';
 selektor_typu_zlozonego   :  '.' ID ;

 przypisanie : <assoc=right> lwartosc '=' wyrazenie                      #przypisanieZwykle
             | <assoc=right> lwartosc '^=' wyrazenie                     #przypisaniePoteg
             | <assoc=right> lwartosc mult=('*=' | '/=' | '%=') wyrazenie#przypisanieMult
             | <assoc=right> lwartosc addyt=('+=' | '-=') wyrazenie      #przypisanieAddyt
             ;

 wywolanie_funkcji   :  ID '(' lista_parametrow_aktualnych ')';
 lista_parametrow_aktualnych : (wyrazenie  (',' wyrazenie)*)?;

 stala_atomiczna   :  CALK  |  ZMIENN  |  ZNAK_DOSL ;

pelny_typ : (nazwa_typu_atom | ID ) ('[]')* ('[' CALK ']')*;
nazwa_typu_atom   : 'całk' | 'rzeczyw' | 'znak';

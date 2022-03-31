grammar plpl0;
import Lekserpl;
program : (byt_globalny)*;
byt_globalny: procedura | deklaracja_typu | deklaracja_prosta;

procedura   :  'procedura' ('->' ( nazwa_typu  |  identyfikator ))? '{' lista_instrukcji  '}';

deklaracja_typu   : 'typ'  identyfikator  '{' ( deklaracja_prosta )+ '}';
deklaracja_prosta   :  deklaracja_atomiczna  |  deklaracja_referencji;

deklaracja_referencji   :
    identyfikator   identyfikator ('[' CALK ']')* EOS |
    identyfikator   identyfikator   '='  (identyfikator | NAPIS_DOSL) EOS ;

deklaracja_atomiczna   :  nazwa_typu   identyfikator ('[' CALK ']')* EOS
                |  nazwa_typu   identyfikator  '='  (CALK | ZMIENN | ZNAK_DOSL) EOS ;

lista_instrukcji   : instrukcja+;
instrukcja   :   instrukcja_wyboru
             |   instrukcja_petli
             |   instrukcja_zlozona
             |   instrukcja_prosta
             |   instrukcja_wkroczenia
             |   instrukcja_przerwania_petli
             |   instrukcja_kontynuacji_petli
             |   instrukcja_powrotu
             |   deklaracja_atomiczna
             |   deklaracja_referencji;
instrukcja_zlozona  : '{'  lista_instrukcji?  '}';
instrukcja_wyboru   : 'jeśli' '(' wyrazenie ')' instrukcja  ('inaczej'  instrukcja)?;
instrukcja_petli   : 'dopóki' '(' wyrazenie ')' instrukcja;
instrukcja_powrotu   : 'zwróć' '(' identyfikator? ')' EOS;
instrukcja_wkroczenia   : 'zacznij'  identyfikator '(' lista_parametrow_formalnych ')' EOS;
instrukcja_przerwania_petli   : 'przerwij' EOS;
instrukcja_kontynuacji_petli   : 'kontynuuj' EOS;
instrukcja_prosta   :  wyrazenie EOS |  przypisanie ; //wywołanie ;
//konstrukcja poniżej spłaszcza drzewo (wzgledem poprzednie wersji) i prawdopodobnie usuwa koszmarek przy przegladaniu tegoż drzewa i generacji kodu
lista_parametrow_formalnych : (deklaracja_parametru  (',' deklaracja_parametru)*)?;
 //lista_parametrow_formalnych   :  deklaracja_parametru
//                                | lista_parametrow_formalnych  ','  deklaracja_parametru;
 deklaracja_parametru   :  nazwa_typu   identyfikator;//brakuje referencji...
/*
expression
    :   expression mult='*' expression          # expressionMultExpression
    |   expression add=( '+' | '-' ) expression # expressionAddExpression
    |   VARIABLE '=' expression                 # expressionAssign
    |   '(' expression ')'                      # parenthesisedExpression
    |   atom                                    # atomExpression
    ;
*/
wyrazenie
          : selektor_tablicowy                          #wyrazenieSelektorTabl
          | selektor_typu_zlozonego                     #wyrazenieSelektorZl
          | neg='!' wyrazenie                           #wyrazenieNegacja
          | przec='-' wyrazenie                         #wyrazeniePrzeciwnosc
          | <assoc=right> wyrazenie '^' wyrazenie       #wyrazeniePoteg
          | wyrazenie mult=('*' | '/' |'%') wyrazenie   #wyrazenieMult
          | wyrazenie addyt=('+' | '-') wyrazenie       #wyrazenieAddyt
          | wyrazenie logicz1=('&&' | '||')wyrazenie    #wyrazenieLogicz1
          | wyrazenie logicz2=('==' | '!=' | '>' | '<' | '<=' | '>=')wyrazenie    #wyrazenieLogicz2
          | przypisanie                                 #wyrazeniePrzypisanie
          | stala_atomiczna                             #wyrazenieStala
          | wywolanie_funkcji                           #wyrazenieWywolanie
          | identyfikator                               #wyrazenieId
          ;

/*
 wyrazenie : '(' wyrazenie ')'
           | przypisanie
           | wyrazenie   operator_dwuargumentowy   wyrazenie
           | operator_jednoargumentowy   wyrazenie
           | stala_atomiczna
           | wywolanie_funkcji
           | selektor_tablicowy
           | selektor_typu_zlozonego
           | identyfikator;*/
 //przypisanie   :  identyfikator   operator_przypisania   wyrazenie ;
 //operator_przypisania   :  '=' | '^=' | '*=' | '/=' | '%=' | '+=' | '-=';
 lwartosc: identyfikator | selektor_tablicowy | selektor_typu_zlozonego;
 przypisanie : <assoc=right> lwartosc '=' wyrazenie                      #przypisanieZwykle
             | <assoc=right> lwartosc '^=' wyrazenie                     #przypisaniePoteg
             | <assoc=right> lwartosc mult=('*=' | '/=' | '%=') wyrazenie#przypisanieMult
             | <assoc=right> lwartosc addyt=('+=' | '-=') wyrazenie      #przypisanieAddyt
             ;
 //operator_dwuargumentowy   :  '^' | '*' | '/' | '%' | '+' | '-' | '==' |  '|'   | '&&' | '||' | '!=' ;
 //operator_jednoargumentowy   : '-' | '!';
 selektor_tablicowy   :  identyfikator  '['  wyrazenie  ']';
 selektor_typu_zlozonego   :  identyfikator  '.' ( identyfikator | selektor_typu_zlozonego );
 wywolanie_funkcji   :  identyfikator '(' lista_parametrow_aktualnych ')';
 lista_parametrow_aktualnych : (wyrazenie  (',' wyrazenie)*)?;
 //lista_parametrow_aktualnych :  wyrazenie
 //                            |  lista_parametrow_aktualnych  ','  wyrazenie;
/*
 wiele cyfr   : 
{ cyfra }+

 stała zmiennopozycyjna   :  wiele cyfr . wiele cyfr 

 stała całkowita   :  wiele cyfr 

  wiele liter   : { litera }+

 stała-napis   : '{ znak utf8 }*'
*/
 stala_atomiczna   :  CALK  |  ZMIENN  |  ZNAK_DOSL ;
/*
 identyfikator   :  litera { cyfra  |  litera }*
*/
 nazwa_typu   : 'całk' | 'rzeczyw' | 'znak';
 identyfikator : ID;

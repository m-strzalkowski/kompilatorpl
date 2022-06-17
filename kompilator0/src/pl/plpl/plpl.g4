grammar plpl;
import Lekserpl;
program : (byt_globalny)* EOF;//a co z EOF?
byt_globalny: procedura | deklaracja_typu | deklaracja_prosta;

procedura   :  'procedura' ('->' typ_zwracany)? '{' lista_instrukcji  '}';
typ_zwracany: pelny_typ;

deklaracja_typu   : 'typ'  ID  '{' ( deklaracja_prosta )+ '}';//użytkownik wprowadza nowy typ
deklaracja_prosta   :  deklaracja_atomiczna  |  deklaracja_referencji;//użytkownik deklarje obiekt istniejącego już typu (atomicznego, bądź zdefiniowanego)


//deklaracja_atomiczna   : przydomki nazwa_typu_atom   ID (',' ID)*  EOS
//                |   przydomki nazwa_typu_atom   ID  '='  (CALK | ZMIENN | ZNAK_DOSL) (',' ID  '='  (CALK | ZMIENN | ZNAK_DOSL))* EOS ;
deklaracja_atomiczna
                :   przydomki nazwa_typu_atom   (deklarator_atomiczny_z_przypisaniem | deklarator_bez_przypisania) (',' (deklarator_atomiczny_z_przypisaniem | deklarator_bez_przypisania))* EOS ;
deklarator_bez_przypisania : ID;
deklarator_atomiczny_z_przypisaniem : ID  '='  (CALK | ZMIENN {notifyErrorListeners("Liczby zmienoprzecinkowe jeszcze nie zaimplementowane");} | ZNAK_DOSL);
deklaracja_referencji   :
     przydomki pelny_typ (deklarator_bez_przypisania|deklarator_zlozony_z_przypisaniem) (',' (deklarator_bez_przypisania|deklarator_zlozony_z_przypisaniem))*  EOS ;
deklarator_zlozony_z_przypisaniem : ID  '='  (lwartosc | stala_tablicowa /*|TABLICA_CALK_DOSL*/);

lista_instrukcji   : instrukcja+;
instrukcja   :   instrukcja_wyboru
             |   instrukcja_petli
             |   instrukcja_zlozona
             |   instrukcja_przerwania_petli
             |   instrukcja_kontynuacji_petli
             |   instrukcja_prosta
             |   instrukcja_wkroczenia
             |   instrukcja_powrotu
             |   instrukcja_zakonczenia
             //|   deklaracja_atomiczna
             //|   deklaracja_referencji
             |   deklaracja_prosta
             |   wstawka_asemblerowa
             |   wypisanie;
instrukcja_zlozona  : '{'  lista_instrukcji?  '}';
instrukcja_wyboru   : ('jeśli'|'jesli'|'gdy') '(' wyrazenie ')' instrukcja  ('inaczej'  instrukcja)?;
instrukcja_petli   : 'dopóki' '(' wyrazenie ')' instrukcja;
instrukcja_powrotu   : 'zwróć' '(' wyrazenie? ')' EOS;
instrukcja_wkroczenia   : 'zacznij'  ID '(' lista_parametrow_formalnych ')' EOS;
instrukcja_zakonczenia : 'skończ' '(' wyrazenie ')' EOS;
instrukcja_przerwania_petli   : PRZERWIJ EOS;
instrukcja_kontynuacji_petli   : KONTYNUUJ EOS;
wypisanie : 'wypisz' '(' (stala_tablicowa | ID)  ')'EOS;//dla celów testowych
instrukcja_prosta  :   wyrazenie EOS;
wstawka_asemblerowa : LINIA_ASEMBLERA;//przede wszystkim dla celów testowych, realnie wklejanie bezpośrednio kodu będzie mało przydatne.

lista_parametrow_formalnych : (deklaracja_parametru  (',' deklaracja_parametru)*)?;
deklaracja_parametru   :  przydomki ( nazwa_typu_atom | pelny_typ)   deklarator_bez_przypisania;

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
          | naiwne_wywolanie                           #wyrazenieWywolanieNaiwne
          | alokacja                                    #wyrazenieAlokacja
          | dealokacja                                  #wyrazenieDealokacja
          | lwartosc                                    #wyrazenieLwartosc//
          | wyrazenie selektor_tablicowy                #wyrazenieSelekcjaTablicowa
          | wyrazenie selektor_typu_zlozonego           #wyrazenieSelekcjiSkladowej
          | adr='@' lwartosc                            #wyrazenieAdres //funkcje rodem z C będą i tak potrzebować adresów....
          | neg='!' wyrazenie                           #wyrazenieNegacja
          | znak=('-'| '+') wyrazenie                   #wyrazenieZnak
          | <assoc=right> wyrazenie '^' wyrazenie       #wyrazeniePoteg
          | wyrazenie mult=('*' | '/' |'%') wyrazenie   #wyrazenieMult
          | wyrazenie addyt=('+' | '-') wyrazenie       #wyrazenieAddyt
          | wyrazenie logicz=('&&' | '||')wyrazenie    #wyrazenieLogicz
          | wyrazenie porownanie=('==' | '!=' | '>' | '<' | '<=' | '>=')wyrazenie    #wyrazeniePorownanie
          | <assoc=right> wyrazenie '=' wyrazenie                      #wyrazeniePrzypisanieZwykle
          | <assoc=right> wyrazenie '^=' wyrazenie                     #wyrazeniePrzypisaniePoteg
          | <assoc=right> wyrazenie mult=('*=' | '/=' | '%=') wyrazenie#wyrazeniePrzypisanieMult
          | <assoc=right> wyrazenie addyt=('+=' | '-=') wyrazenie      #wyrazeniePrzypisanieAddyt
          | stala_atomiczna                             #wyrazenieStala
          //| ID                                          #wyrazenieId//wystarczy sama lwartość, której ID jest szczególnym przypadkiem
          //NAPIS_DOSL //??
          | '(' wyrazenie ')'                           #wyrazenieNawiasy
          ;
alokacja: NOWY '('pelny_typ_dynamiczny')';//bez nawiasów robi sie niejednoznaczność
dealokacja:'zapomnij' '('wyrazenie')';
// lwartosc: ID (selektor_tablicowy)?(selektor_typu_zlozonego(selektor_tablicowy)*)*;//konstrukcje typu a.b[d+2][7][12+w]
 lwartosc: ID | NAPIS_DOSL | NIC;//  tablica_calk_dosl  | DOSLOWNA_LOSOWOSC;
 //do wyrażeń:
 //|wyrazenie selektor_tablicowy #wyrazenieSelekcjaTablicowa
 //|wyrazenie selektor_typu_zlozonego #wyrazenieSelekcjiSkladowej
 selektor_tablicowy   :  '['  wyrazenie  ']';
 selektor_typu_zlozonego   :  '.' ID ;

//W przypisaniu lwartość ma zmodyfikowane znaczenie: jest to ADRES elementu, do którego trzeba wpisać WARTOść (która też może być adresem)
 /*przypisanie : <assoc=right> wyrazenie '=' wyrazenie                      #przypisanieZwykle
             | <assoc=right> wyrazenie '^=' wyrazenie                     #przypisaniePoteg
             | <assoc=right> wyrazenie mult=('*=' | '/=' | '%=') wyrazenie#przypisanieMult
             | <assoc=right> wyrazenie addyt=('+=' | '-=') wyrazenie      #przypisanieAddyt
             ;
             */
 /*przypisanie : <assoc=right> lwartosc '=' wyrazenie                      #przypisanieZwykle
             | <assoc=right> lwartosc '^=' wyrazenie                     #przypisaniePoteg
             | <assoc=right> lwartosc mult=('*=' | '/=' | '%=') wyrazenie#przypisanieMult
             | <assoc=right> lwartosc addyt=('+=' | '-=') wyrazenie      #przypisanieAddyt
             ;
*/
 wywolanie_funkcji   :  ID '(' lista_parametrow_aktualnych ')';
 naiwne_wywolanie : 'C.' ID '(' lista_parametrow_aktualnych ')';
 lista_parametrow_aktualnych : (wyrazenie  (',' wyrazenie)*)?;

 stala_atomiczna   :  CALK  |  ZMIENN {notifyErrorListeners("Liczby zmienoprzecinkowe jeszcze nie zaimplementowane");} |  ZNAK_DOSL ;
 stala_tablicowa   : NAPIS_DOSL;
//pelny_typ : ((nazwa_typu_atom ('[]')* ('[' CALK ']')+ ) | ID (('[]')* ('[' CALK ']')*) ) ;
pelny_typ : (nazwa_typu_atom | ID ) (nieokreslony_deklarator_tablicowy)* (okreslony_deklarator_tablicowy)?;
pelny_typ_dynamiczny : (nazwa_dynamicznie_alokowalnego_typu_atom | ID ) (obliczany_deklarator_tablicowy)? (nieokreslony_deklarator_tablicowy)*;//do alokacji pamięci
nieokreslony_deklarator_tablicowy: '['']';
okreslony_deklarator_tablicowy: '[' CALK ']';
obliczany_deklarator_tablicowy: '[' wyrazenie ']';
przydomki : ((STATYCZN|AUTOMATYCZN)? STAL?) | (STAL? (STATYCZN|AUTOMATYCZN)?);
//nazwa_typu_atom   : 'całk' | 'rzeczyw' | 'znak';
nazwa_typu_atom : TCALK | TRZECZYW {notifyErrorListeners("Liczby zmienoprzecinkowe jeszcze nie zaimplementowane");} | TZNAK | TREF;
nazwa_dynamicznie_alokowalnego_typu_atom : TCALK | TRZECZYW {notifyErrorListeners("Liczby zmienoprzecinkowe jeszcze nie zaimplementowane");} | TZNAK | TREF;//po prawdzie to skrót, żeby nie zmieniać żeby oddzielić symbole gramatyczne w deklaracjach i w alokacji

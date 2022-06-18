KOMPILATOR JĘZYKA PL/PL

WŁAŚCIWA INSTRUKCJA ZNAJDUJE SIĘ W PODRĘCZNIKU UŻYTKOWNIKA

Jak uruchomić?
Plik plplk jest bashowym proxy więc wystarczy dodać go do PATH (np.:export PATH=$PATH:/c/...reszta ścieżki .../kompilator0)
Potem wywołać z dowolnego miejsca:
plplk -i plik_źródłowy.plpl
Ewentualnie można wołać bezpośrednio Javę:
java -jar ..../kompilatorPLPL.jar ...argumenty...
Aplikacja kompilatora produkuje plik .asm - w asemblerze NASM. Potem próbuje wołać nasm z odpowiednimi argumentami i na koniec gcc w charakterze linkera(tekst wydanych przez kompilator komend pojawia sie na jego standardowym wyjściu).
Istnieje możliwość ręcznego użycia innego linkera (np. ld), lecz wymagałoby to jawnego podania plików potrzebnych do ustanowienia środowiska wykonawczego C. (np. crt0)

Wymagania:
 * Java JVM >= 15
 * gcc 32bit
 * nasm 32bit
(wyjściowe obrazy wykonywalne generowane na architekturę x86-32 (IA-32))

hello world:
procedura{zacznij program();wypisz("Witaj świecie!"); zwróć();}

Licencja: taka jak oryginalnego repozytorium na https://gitlab.com/Strzalkowski/kompilatorpl/

Błędy, bugi i inne stwory
prosimy przesyłać na adres strzalkowski@student.agh.edu.pl

THIS PROJECT IS WRITTEN IN IT'S ENTIRETY IN POLISH LANGUAGE.
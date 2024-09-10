package codigo;
import static codigo.Tokens.*;

%% //todas las declaraciones

%class Lexer
%type Tokens
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ ,\t,\r]+
%{

    public String lexeme;

%}
%% 

int {lexeme=yytext(); return Int;}
bool {lexeme=yytext(); return Bool;}
void {lexeme=yytext(); return Void;}
main {lexeme=yytext(); return Main;}
true {lexeme=yytext(); return True;}
false {lexeme=yytext(); return False;}
return {lexeme=yytext(); return Return;} 
if {lexeme=yytext(); return If;}
else {lexeme=yytext(); return Else;}
while {lexeme=yytext(); return While;}

{espacio} {/*Ignore*/}
"//".* {/*Ignore*/}

"=" {lexeme=yytext(); return Igual;}
"\n" {lexeme=yytext(); return Linea;}
";" {lexeme=yytext(); return Punto_coma;}
"(" {lexeme=yytext(); return Parentesis_a;}
")" {lexeme=yytext(); return Parentesis_c;}
"{" {lexeme=yytext(); return Llave_a;}
"}" {lexeme=yytext(); return Llave_c;}
"+" {lexeme=yytext(); return Suma;}
"-" {lexeme=yytext(); return Resta;}
"*" {lexeme=yytext(); return Multiplicacion;}
"/" {lexeme=yytext(); return Division;}

{L}({L}|{D})* {lexeme=yytext(); return Identificador;}
"-"?{D}+(\.{D}+)? {lexeme=yytext(); return Numero;}
. {return ERROR;}
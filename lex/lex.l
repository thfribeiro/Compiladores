%{ 
#include<string.h>

struct NUM{
char valor[5];
};

struct TIPOS{
char nome[10];
};

struct BIBLIOTECA{
char nome[30];
};


struct NUM numeros[100];
struct TIPOS tipos[100];
struct BIBLIOTECA bibliotecas[100];

int n=0,t=0,b=0;
%} 

%% 
[0-9]+ {printf("%s", yytext); strcpy(numeros[n].valor,yytext); n++;}
int {printf("NUMERO INTEIRO"); strcpy(tipos[t].nome,yytext); t++;}
char {printf("CARACTERES"); strcpy(tipos[t].nome,yytext); t++;}
double {printf("NUMERO REAL COM PRECISAO"); strcpy(tipos[t].nome,yytext); t++;}
float {printf("NUMERO REAL"); strcpy(tipos[t].nome,yytext); t++;}
[a-z]+[.]h {printf("%s", yytext);strcpy(bibliotecas[b].nome,yytext); b++;}
for {printf("PARA");}
while {printf("ENQUANTO");}
if {printf("SE");}
else {printf("SE NAO");}
return {printf("RETORNE");}
struct {printf("ESTRUTURA");}
goto {printf("VA PARA");}
printf {printf("IMPRIME");}
scanf {printf("LE");}
include {printf("INCLUE A BIBLIOTECA");}
== {printf("E IGUAL A");}
= {printf("RECEBE");}
system {printf("COMANDO DO SISTEMA");}
. {printf("%s" , yytext);}
%% 


int yywrap(){} 
int main(){ 
int i;


FILE *fp; 
fp = fopen("teste.txt","r"); 
yyin = fp; 

yylex(); 

printf("Atributos tokens tipo NUM: \n");
for(i=0; i<n; i++){
printf("NUM: %s\n", numeros[i].valor);
}

printf("Atributos tokens tipo TIPOS: \n");
for(i=0; i<t; i++){
printf("TIPO: %s\n", tipos[i].nome);
}

printf("Atributos tokens tipo BIBLIOTECA: \n");
for(i=0; i<b; i++){
printf("BIBLIOTECA: %s\n", bibliotecas[i].nome);
}


return 0; 
} 


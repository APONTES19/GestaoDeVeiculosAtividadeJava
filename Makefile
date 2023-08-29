NAME= -sourcepath gestaoDeVeiculo
CC=javac
FLAG= -d
PATH=./src/**/*.java ./src/*.java
BIN=./bin

all :
	dir

javac -d bin ./src/**/*.java   ./*.java  -source gestaoDeVeiculo



Get-ChildItem -Recurse -Include *.java | ForEach-Object { $_.FullName } > sources.txt
javac -d bin @(Get-Content sources.txt)


PS F:\LUCAS DADOS\CURSOS\JAVA UTFPR POS\JAVA_1\ATIVIDADES\ATIVIDADE_8\bin>

 cd .. &&
 Get-ChildItem -Recurse -Include *.java | ForEach-Object { $_.FullName } > sources.txt &&
 javac -d bin @(Get-Content sources.txt) &&
 cd ./bin &&
 java Teste

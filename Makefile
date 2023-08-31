windowns:
	Get-ChildItem -Recurse -Include *.java | ForEach-Object { $_.FullName } > sources.txt &&
	javac -d bin @(Get-Content sources.txt) &&
	cd ./bin && java Teste

DIR="teste"
if [ -d "$DIR" ]; then
    echo "Achei o diretorio $DIR"
else 
    mkdir teste
    echo "Criei o diretorio $DIR"
fi


# RPG Factory Method

Projeto desenvolvido por graduandos de Ciência da Computação com o intuito de estudar o **padrão de projeto criacional Factory Method**, aplicado em um RPG.  

O sistema permite a criação de **personagens**, **inimigos** e **itens** utilizando o modelo criacional escolhido.

## Integrantes
- Igor Pache  
- Caio Felipe Mendes  
- Pedro Ramalho  
- Raniel Brenner  


## Como Executar
1. Clone este repositório

2. Na raiz do progama execute os comandos nesta ordem:

mkdir -p bin                        # cria a pasta 'bin' na raiz do projeto para colocar os arquivos .class
javac -d bin src/*.java              # compila todos os arquivos .java dentro de src/ e coloca os .class em bin
jar cfe RPG_Factory.jar Main -C bin .  # cria o .jar executável com a classe principal Main
java -jar RPG_Factory.jar            # executa o .jar, iniciando o jogo


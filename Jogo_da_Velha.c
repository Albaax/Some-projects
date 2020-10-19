#include <stdio.h>
#include <stdlib.h>

void tabuleiro(char casas2[3][3]){
    system("cls");
    printf("\t\t %c | %c | %c\n", casas2[0][0], casas2[0][1], casas2[0][2]);
    printf("\t\t-----------\n");
    printf("\t\t %c | %c | %c\n", casas2[1][0], casas2[1][1], casas2[1][2]);
    printf("\t\t-----------\n");
    printf("\t\t %c | %c | %c ", casas2[2][0], casas2[2][1], casas2[2][2]);
    
}

int main(){
    char casas[3][3] = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
    int jogadas;
    int i, j, vez = 0, c, l;
    char res;

    char playerx[10], playero[10];
    printf("\n\t\tJOGO DA VELHA: ");
    printf("\nDigite o nome do player que usara 'X': ");
    fgets(playerx, 10, stdin);
    printf("\nDigite o nome do player que usara 'O': ");
    fgets(playero, 10, stdin);

    do{
        jogadas = 1;
        for(i = 0; i <=2; i++){
            for (j = 0; j <= 2; j++){
            casas[i][j] = ' ';         
            }
        }
        do{
        tabuleiro(casas);

        if(vez % 2 == 0){
            printf("\nPlayer %s", playerx);
        }
        else{ 
            printf("\nPlayer %s", playero);
        }
        printf("\nDigite a linha e coluna: ");
        scanf("%d", &l);
        scanf("%d", &c);

        if(l < 1 || l > 3 || c < 1 || c > 3){
            c = 0;
            l = 0;
        }
        else if(casas[l - 1][c - 1] != ' '){
            c = 0;
            l = 0;
        }
        else{
        if(vez % 2 == 0){
            casas[l - 1][c - 1] = 'X';
        }
        else{ 
            casas[l - 1][c - 1] = 'O';
        }
        vez++;
        jogadas++;
        }
        
        if(casas[0][0] == 'X' && casas[0][1] == 'X' && casas[0][2] == 'X'){jogadas = 11;}
        if(casas[1][0] == 'X' && casas[1][1] == 'X' && casas[1][2] == 'X'){jogadas = 11;}
        if(casas[2][0] == 'X' && casas[2][1] == 'X' && casas[2][2] == 'X'){jogadas = 11;}
        if(casas[0][0] == 'X' && casas[1][0] == 'X' && casas[2][0] == 'X'){jogadas = 11;}
        if(casas[0][1] == 'X' && casas[1][1] == 'X' && casas[2][1] == 'X'){jogadas = 11;}
        if(casas[0][2] == 'X' && casas[1][2] == 'X' && casas[2][2] == 'X'){jogadas = 11;}
        if(casas[0][0] == 'X' && casas[1][1] == 'X' && casas[2][2] == 'X'){jogadas = 11;}
        if(casas[0][2] == 'X' && casas[1][1] == 'X' && casas[2][0] == 'X'){jogadas = 11;}

        if(casas[0][0] == 'O' && casas[0][1] == 'O' && casas[0][2] == 'O'){jogadas = 12;}
        if(casas[1][0] == 'O' && casas[1][1] == 'O' && casas[1][2] == 'O'){jogadas = 12;}
        if(casas[2][0] == 'O' && casas[2][1] == 'O' && casas[2][2] == 'O'){jogadas = 12;}
        if(casas[0][0] == 'O' && casas[1][0] == 'O' && casas[2][0] == 'O'){jogadas = 12;}
        if(casas[0][1] == 'O' && casas[1][1] == 'O' && casas[2][1] == 'O'){jogadas = 12;}
        if(casas[0][2] == 'O' && casas[1][2] == 'O' && casas[2][2] == 'O'){jogadas = 12;}
        if(casas[0][0] == 'O' && casas[1][1] == 'O' && casas[2][2] == 'O'){jogadas = 12;}
        if(casas[0][2] == 'O' && casas[1][1] == 'O' && casas[2][0] == 'O'){jogadas = 12;}

    }while(jogadas <= 9);

    tabuleiro(casas);

    if(jogadas == 11){
        printf("\nPlayer %s Wins! ", playero);
    }
    else if(jogadas == 12){
        printf("\nPlayer %s Wins! ", playero);
    }
    else{
        printf("\nJogo empatado! ");
    }
    printf("\nDeseja jogar novamente (S-N): ");
    scanf(" %c", &res);
    printf("\n\n");

    }while(res == 's' || res == 'S');

    return 0;
}
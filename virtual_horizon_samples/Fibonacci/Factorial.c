#include <stdio.h>

int fact(int n) {
    int i;
    
    if(n == 0 || n == 1) {
        return 1;
    } else {
        return n * fact(n - 1);
    }
    
}

int main(){
    int n;
    printf("Introduce un numero: ");
    scanf("%i", &n);
    printf("El factorial de %d es %d\n", n, fact(n));
}
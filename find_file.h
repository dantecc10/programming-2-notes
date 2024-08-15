#include <stdio.h>
#include <stdlib.h>
#include <string.h>

char common_path[] = "programming-2-notes/abogados.dat";
char path1[] = "/media/darkseid/DATA2/Repos/programming-2-notes/abogados.dat";
char path2[] = "C:\Repos\programming-2-notes\abogados.dat";
char path3[] = "";
int main()
{
    FILE *archivo;

    archivo = fopen(path1, "ab");
    if (!archivo)
    {
        archivo = fopen(path2, "ab");
        if (!archivo)
        {
            archivo = fopen(path3, "ab");
            if (!archivo)
            {
                printf("Error al abrir el archivo.\n");
                return 0;
            }
        }
    }
}
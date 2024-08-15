#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_NOMBRE 50
#define MAX_DIRECCION 100
#define MAX_TELEFONO 15
#define MAX_HORARIO 50
#define MAX_ESPECIALIDAD 30

typedef struct {
    char nombre[MAX_NOMBRE];
    char direccion[MAX_DIRECCION];
    char telefono[MAX_TELEFONO];
    char horario[MAX_HORARIO];
    char especialidad[MAX_ESPECIALIDAD];
} Abogado;

void altaAbogado();
void mostrarAbogado();
void mostrarTodos();

int main() {
    int opcion;

    do {
        printf("\nAgenda de Abogados\n");
        printf("1. Alta de abogado\n");
        printf("2. Mostrar un abogado\n");
        printf("3. Mostrar todos los abogados\n\n");
        printf("Seleccione una opción: ");
        scanf("%d", &opcion);
        getchar(); // Limpiar el buffer

        switch(opcion) {
            case 1:
                altaAbogado();
                break;
            case 2:
                mostrarAbogado();
                break;
            case 3:
                mostrarTodos();
                break;
            case 4:
                printf("\nHasta pronto!");
            default:
                printf("\nOpción no válida. Intente de nuevo.\n");
        }
    } while(opcion != 4);

    return 0;
}

void altaAbogado() {
    Abogado abogado;
    FILE *archivo;

    printf("Ingrese el nombre del abogado: ");
    fgets(abogado.nombre, MAX_NOMBRE, stdin);
    abogado.nombre[strcspn(abogado.nombre, "\n")] = 0;

    printf("Ingrese la dirección: ");
    fgets(abogado.direccion, MAX_DIRECCION, stdin);
    abogado.direccion[strcspn(abogado.direccion, "\n")] = 0;

    printf("Ingrese el teléfono: ");
    fgets(abogado.telefono, MAX_TELEFONO, stdin);
    abogado.telefono[strcspn(abogado.telefono, "\n")] = 0;

    printf("Ingrese el horario: ");
    fgets(abogado.horario, MAX_HORARIO, stdin);
    abogado.horario[strcspn(abogado.horario, "\n")] = 0;

    printf("Ingrese la especialidad (general, familiar, civil, laboral, penal, administrativo, inmobiliario o asistencia familiar): ");
    fgets(abogado.especialidad, MAX_ESPECIALIDAD, stdin);
    abogado.especialidad[strcspn(abogado.especialidad, "\n")] = 0;

    archivo = fopen("abogados.dat", "ab");
    if (archivo == NULL) {
        printf("Error al abrir el archivo.\n");
        return;
    }

    fwrite(&abogado, sizeof(Abogado), 1, archivo);
    fclose(archivo);

    printf("Abogado registrado con éxito.\n");
}

void mostrarAbogado() {
    Abogado abogado;
    FILE *archivo;
    char nombreBuscar[MAX_NOMBRE];
    int encontrado = 0;

    printf("Ingrese el nombre del abogado a buscar: ");
    fgets(nombreBuscar, MAX_NOMBRE, stdin);
    nombreBuscar[strcspn(nombreBuscar, "\n")] = 0;

    archivo = fopen("abogados.dat", "rb");
    if (archivo == NULL) {
        printf("Error al abrir el archivo.\n");
        return;
    }

    while(fread(&abogado, sizeof(Abogado), 1, archivo) == 1) {
        if (strcmp(abogado.nombre, nombreBuscar) == 0) {
            printf("\nNombre: %s\n", abogado.nombre);
            printf("Dirección: %s\n", abogado.direccion);
            printf("Teléfono: %s\n", abogado.telefono);
            printf("Horario: %s\n", abogado.horario);
            printf("Especialidad: %s\n", abogado.especialidad);
            encontrado = 1;
            break;
        }
    }

    if (!encontrado) {
        printf("Abogado no encontrado.\n");
    }

    fclose(archivo);
}

void mostrarTodos() {
    Abogado abogado;
    FILE *archivo;
    int contador = 0;

    archivo = fopen("abogados.dat", "rb");
    if (archivo == NULL) {
        printf("Error al abrir el archivo.\n");
        return;
    }

    while(fread(&abogado, sizeof(Abogado), 1, archivo) == 1) {
        printf("\nAbogado #%d\n", ++contador);
        printf("Nombre: %s\n", abogado.nombre);
        printf("Dirección: %s\n", abogado.direccion);
        printf("Teléfono: %s\n", abogado.telefono);
        printf("Horario: %s\n", abogado.horario);
        printf("Especialidad: %s\n", abogado.especialidad);
        printf("--------------------\n");
    }

    if (contador == 0) {
        printf("No hay abogados registrados.\n");
    }

    fclose(archivo);
}
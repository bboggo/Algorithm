#include <stdio.h>
#pragma warning(disable:4996)

int main() {

    int A;
    int B;

    int num;

    scanf("%d", &num);

    for (int i = 0; i < num; i++) {
        scanf("%d %d", &A, &B);
        int total = A + B;
        printf("%d\n", total);
    }
}
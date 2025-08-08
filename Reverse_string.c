#include <stdio.h>
#include <string.h>
int main() {
 char str[1000];
 fgets(str,1000,stdin);
 char str1[1000];
 for(int i=0,j=strlen(str)-1; i<strlen(str),j>=0;i++,j--){
     str1[j]=str[i];
 }
 printf("%s",str1);
    return 0;
}

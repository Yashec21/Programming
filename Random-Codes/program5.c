#include<stdio.h>
#include<io.h>
#include<stdlib.h>
#include<fcntl.h>
#include<string.h>

#define BUFFERSIZE 100

void read_File(char FName[])
{
    int fd = 0;
    int iRet = 0;

    char Buffer[BUFFERSIZE];

    fd = open(FName,O_RDONLY);

    if (fd == -1)
    {
        printf("Unable to open the file :\n");
    }
    else
    {
        printf("File Successuflly open with fd : %d",fd);
    }
    
    while((iRet = read(fd,Buffer,sizeof(Buffer))) != 0)
    {
        printf("%s",Buffer);
        memset(Buffer,'\0',sizeof(Buffer));
    }
}

int main()
{
    char FileName[30];

    printf("Enter the file name :\n");
    scanf("%s",FileName);

    read_File(FileName);
}
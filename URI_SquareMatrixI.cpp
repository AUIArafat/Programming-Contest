#include <stdio.h>
#include <stdlib.h>

int main()
{
    int arr[110][110];
    int i,j,k,n;
    while(scanf("%d",&n)){
        if(n==0)
            return 0;
        int l = n;
        k = 1;
        while(k<=n){
            for(i=k;i<=l;i++){
                for (j=k;j<=l;j++){
                   arr[i][j]=k;
                }
            }
            ++k;
            --l;
        }
        for (i=1;i<=n;i++){
            for (j=1;j<=n;j++){
                if(j==n)
                    printf("%3d",arr[i][j]);
                else
                    printf("%3d ",arr[i][j]);
            }
        printf("\n");
        }
        printf("\n");
    }
}

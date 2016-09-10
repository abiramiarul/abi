#include<stdio.h>
#include<string.h>

int main()
{
	char p[4][10];
	int i,x[4][2]={0},l[4],t=1,j=0,k=0,s1,s2;
	
	scanf("%s",p[0]);
	scanf("%s",p[1]);
	scanf("%s",p[2]);
	scanf("%s",p[3]);
  	
  	l[0]=strlen(p[0]);
  	l[1]=strlen(p[1]);
  	l[2]=strlen(p[2]);
  	l[3]=strlen(p[3]);
  
  while(k<4){
	for(i=l[k]-2;i>0;i--){
	  if(p[k][i] != ','){
		x[k][j] += ((p[k][i]-48)*t);
		t=t*10;
	  }
	  else{
	  	j++;t=1;
	  }
	}
	k++;
	j=0;
	t=1;
  }
  s1 = x[0][0]+x[1][0]+x[2][0]+x[3][0];
  s2 = x[0][1]+x[1][1]+x[2][1]+x[3][1];

	if(s1 == s2){
		printf("It is a square.");
	}
	else 
		printf("Not a square.");
	
	return 0;
}

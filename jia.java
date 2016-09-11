public static void main(String[] args) {
        
        int sum=0,count1=0;

       int n,i = 0,a,k=0,j,count=0,p=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the limit ");
        a=sc.nextInt();
         // System.out.println("enter the ending element");
          int[] b=new int[100];
                    int[] c=new int[100];

          for(j=2;j<=100;j++){
        for(i=2;i<j;i++){
        if(j%i==0)
        {
           break;
        }}
        if(j==i){ 
            count++;             
            b[k]=i;
        k++;}
        else
       {  continue;}
    }  
          for(i=0;i<count;i++)
          {                   n=b[i];

              do
              {
                int n1=n%10;
                sum=sum+n1;
                for(j=2;j<sum;j++)
                {
                    if(sum%j==0)
                    {
                    break;}}
                    if(sum==j){
                        c[p]=j;
count1++;
                       // System.out.println(""+c[p]);
                    p++;}
                    
                 
                
                n=n/10;  
              }while(n>9);
          }for(i=0;i<count1;i++)
          {
          if(c[i]!=c[i+1])
                  System.out.println(""+c[i]);}
}

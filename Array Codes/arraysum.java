class arraysum{
    public static void main(String args[]){

        int a[]={12,15,18,22};
        int sum=0;

        for(int i=0;i<a.length;i++){
            int item =a[i];

            while(item>0){
                int rem=item%10;
                sum=sum+rem;
                item=item/10;
            }
        }

        System.out.println("ans="+sum);
    }
}
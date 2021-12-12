class arrmax{
    public static void main(String args[]){
        int a[]={5,7,2,87,65,43,26,6};
        int m =0;
        

        for(int i=0;i<a.length;i++){
            if(m<a[i])
            m=a[i];
        }

        System.out.println("ans="+m);
    }
}
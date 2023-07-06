public class sortarrayasenddemo {

public static void main(String[] args) {
// TODO Auto-generated method stub
     int a[]= {2,5,1,9,8};
     int temp;
//     String ab="veera";
//     String sb=new String("veera");
// 1,2,3,4,6, 9
     
     for(int i=0;i<5;i++)
     {
    for(int j=i+1;j<5;j++)
    {
    if(a[i] > a[j])
    {
    temp=a[i];
    a[i]=a[j];
    a[j]=temp;
    
   
    }
    }
     }
for(int i=0;i<5;i++)

	
	 {
System.out.println(a[i]);

}
}}


package sum;

public class Sum {

    public static void main(String[] args) {
     int[] num={7,9,9};
     double sum=num[0];
     double avg=0;
     for(int i=1; i<num.length; i++){
         sum=sum+num[i];
     }
        avg=sum/num.length; 
        System.out.println("Sum = " +sum);
        System.out.printf("Avg = %.2f\n",avg);
     }
    
    public static void iteration(String[] args){
     int [] num={8,0,0};
     int a =num[0];
     int count=0;
     for(int i=1; i<num.length; i++){
       if(a<num[i]|| a>num[i]){
           else{
           count++;
       }
       }
    }    
    }
    }
   


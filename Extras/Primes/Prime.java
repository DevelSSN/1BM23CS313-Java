import java.util.Scanner;

class Primes
{
    private int low, high;
    private int[] primes;
    public Primes(int low, int high){
        this.low=low;
        this.high=high;
        this.primes=new int[high-low+1];
    }

    public String getPrimes(){
        int point=0;
        eachNum:
        for(int i=low;i<=high;i++){
            if(i==1)
                continue eachNum;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0)
                    continue eachNum;
            }
            primes[point++]=i;
        }

        return makeString(primes);

    }

    private String makeString(int[] array){
        StringBuffer s=new StringBuffer("");
        for(int ele: array){
            if (ele!=0)
            s.append(ele+"\t");
        }
        return s.toString();
    }
}

class PrimeMain{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter range of prime search:");
        int low=sc.nextInt();
        int high=sc.nextInt();

        Primes obj=new Primes(low, high);
        if(obj.getPrimes().length()!=0)
            System.out.println("Prime numbers are:"+obj.getPrimes());
        sc.close();
    }
}

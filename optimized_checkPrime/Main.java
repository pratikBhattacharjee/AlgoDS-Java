class Main{
    public static boolean checkPrime(int n){
        //loop to sqrt(n) from 2
        for(int i = 2;i<=Math.sqrt(n);i++){
            if (n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(checkPrime(10));
    }
}
class Solution {
    public int countPrimes(int n) {

        ArrayList<Boolean> isPrime = new ArrayList<>();
        for(int i = 0; i<n+1; i++){
            isPrime.add(i,true);
        }

        int cnt = 0;
        for(int i = 2; i<n;i++){
            if(isPrime.get(i)){
                cnt++;

                for(int j = i*2; j<n; j = j+i){
                    isPrime.set(j,false);
                }
            }
        }

        return cnt;
        
    }
}

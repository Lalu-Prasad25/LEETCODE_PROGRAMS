class Solution {
    public List<String> fizzBuzz(int n) {
       ArrayList<String> a= new ArrayList();
       int i = 1;
       while(i<=n){
        if(i%3== 0 && i% 5== 0){
            a.add("FizzBuzz");
        }else if(i%3==0 && i%5 !=0){
            a.add("Fizz");
        }else if(i%3 !=0 && i%5 ==0){
            a.add("Buzz");
        }else{
            a.add(String.valueOf(i));
        }
        i++;
       }
       return a;
    }
}
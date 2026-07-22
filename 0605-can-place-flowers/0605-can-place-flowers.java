class Solution {
    public boolean canPlaceFlowers(int[] f, int n) {

        if(f.length == 1 && f[0] == 0 && n == 0){
            return true;
        }
         if(f.length == 1 && f[0] == 0 && n == 1){
            return true;
        }
         if(f.length == 1 && f[0] == 1 && n == 0){
            return true;
        }
         if(f.length == 1 && f[0] == 1 && n > 0){
            return false;
        }
          if(f.length == 1 && f[0] == 0 && n > 1){
            return false;
        }
        if(f.length ==2 && f[0]== 0 && f[1] == 0 && n ==1){
            return true;
        }

        for(int i = 0; i < f.length  ; i++){
          
            if(i == 0 && f[0]==0 && f[1]== 0 && n> 0){
                f[0]=1;
                n= n-1; 
            }else if(i == f.length-1 && f[f.length-2]==0 && f[f.length-1]== 0 && n> 0){
                f[f.length-1]=1;
                n= n-1;
            }else if( i-1 >= 0 && i+1 <= f.length-1 && f[i-1] == 0 && f[i] == 0 && f[i+1]== 0 && n >0 )  {
                f[i]=1;
                n = n-1;
            }
            }

            if(n == 0){
                return true;
                
            }else{
                return false;
            }


        }
        
    }

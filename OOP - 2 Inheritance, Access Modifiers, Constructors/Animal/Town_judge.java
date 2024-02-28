package Animal;

import java.util.HashMap;
import java.util.Map;

public class Town_judge {
    public static int town(int N , int[][]A){
        HashMap<Integer,Integer> map = new HashMap<>();
        int n  =A.length;
        for(int i = 0 ; i<n;i++){
            if(map.containsKey(A[i][1]) ){
               int freq =  map.get(A[i][1]);
                map.put(A[i][1],freq+1);
            }
            else{
                map.put(A[i][1],1);
            }
        }
        int ans = 0;
        for(int i = 0 ; i<n;i++){
            ans= Math.max(ans,map.get(A[i][0]));
        }
        return ans;
    }
}

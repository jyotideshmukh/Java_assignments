package Dsa;

import java.lang.reflect.Array;
import java.util.Arrays;

public class JewelsAndStones {

    public int numJewelsInStones(String jewels, String stones) {
        int jewelsCnt = 0 ;
        char uniqueArray[] = new char[jewels.length()] ;

        if(jewels.length() < 1 ||  stones.length() < 1
                || jewels.length() > 50 ||  stones.length() > 50 )
            return -1;
        int cnt =0;
        for(int i = 0; i< jewels.length(); i++ ){
            for(int j = 0; j< stones.length(); j++ ){
                if(jewels.charAt(i) == stones.charAt(j)){
                    jewelsCnt++;

                }
            }
        }

        return jewelsCnt;
    }
}

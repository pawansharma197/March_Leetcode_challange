class Solution {
    public int[] countBits(int n) {
        int arr[] = new int[n+1];
        arr[0] = 0 ;
        
        for(int i=1 ; i<=n ; i++)
        {
            if(i%2==0)
            {
                arr[i] = arr[i/2]+0 ;
            }
            else
            {
                arr[i] = arr[i/2]+1;
            }
        }
        
        return arr;
    }
}


// Note : x/2 = y
// but there are 2 condition of  x

// 1) if x is odd then lsb is 1 and afer doing right swift by 1 bit then set bit is lost ;

// ex : 7 -->111 , 7/2 = 3 , 3---011 
//     so ax 7 is odd so its LSB is 1 and after one right swift one set bit is lost .
    
// Ex : 12/2 == 6 , 12 --> 1100 , 6 ---> 0110 , Lsb of even is 0  ao as we do right swift by 1 no set bit is lost 


// so For X == odd , no of set bit will be 1+ x/2 ;
// so for y ==even , no of set bit will be x/2 ;
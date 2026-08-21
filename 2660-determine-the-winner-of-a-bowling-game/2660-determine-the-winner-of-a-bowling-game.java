class Solution {
    public int isWinner(int[] player1, int[] player2) {
        int p1 = 0; int p1p = 0;
        int p2 = 0;int p2p = 0;
        for(int i=0;i<player1.length;i++){
            if(p1p<=2 &&p1p!=0){ p1+=player1[i]*2; p1p--;}
            else{ p1+=player1[i]; }

            if(p2p<=2 &&p2p!=0){ p2+=player2[i]*2; p2p--;}
            else { p2+=player2[i]; }

            if( player1[i] == 10){ p1p = 2; }
            if( player2[i] == 10){ p2p = 2; }
        }
        if( p1 > p2)
            return 1;
        else if( p2 > p1 )
            return 2;
        else
            return 0;
    }
}
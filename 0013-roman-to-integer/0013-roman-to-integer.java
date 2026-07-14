class Solution { 
    static int num(char c, char cc){
        int f=0,s=0;
        if(c == 'I'){ f=1; }
        else if(c == 'V'){ f=5;}       
        else if(c == 'X'){ f=10;}        
        else if(c == 'L'){ f=50 ;} 
        else if(c == 'C'){ f=100 ;}    
        else if(c == 'D'){ f=500 ;}    
        else if(c == 'M'){ f=1000 ;}   
        else{ f=0;}

        if(cc == 'I'){ s=1; }
        else if(cc == 'V'){ s=5; }  else if(cc == 'X'){ s=10;} 
        else if(cc == 'L'){ s=50 ;}  else if(cc == 'C'){ s=100 ;}
         else if(cc == 'D'){ s=500 ;}  else if(cc == 'M'){ s=1000 ;}
         else{ s=0;}
         if(s>f){
         
            return ( -f);
         }
         else{
            return f;
         }
    }
    public int romanToInt(String s) {
        int res = 0;int i=0;
        for(;i<s.length();i++){
            char c = s.charAt(i);
            char se;
            if(i<s.length()-1){
                se = s.charAt(i+1);
            }
            else{
                se = 'a';
            }
 
            res+=num(c,se);   
        }
        return res;
    }
}
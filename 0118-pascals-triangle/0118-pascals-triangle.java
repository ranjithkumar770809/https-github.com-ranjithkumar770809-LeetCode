class Solution {
    public List<List<Integer>> generate(int numRows) {
         List< List<Integer>> a= new ArrayList<>();
        if( numRows == 0){ return a; }
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(1);  a.add(temp);
        for(int i=0;i<numRows-1;i++){
            ArrayList<Integer> al = new ArrayList<>();
            al.add(1);
            for(int j=0;j<temp.size()-1;j++){
                al.add(temp.get(j)+temp.get(j+1));
            }
            al.add(1);
            temp = al;
            a.add(temp);
        }
        return a;
    }
}
class Solution {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> temp = new ArrayList<>();
        if( rowIndex == 0){ temp.add(1); return temp; }
         for(int i=0;i<rowIndex ;i++){
            ArrayList<Integer> al = new ArrayList<>();
            al.add(1);
            for(int j=0;j<temp.size()-1;j++){
                al.add(temp.get(j) + temp.get(j+1));
            }
            al.add(1);
            temp = al;
        }
        return temp;
    }
}
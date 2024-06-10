class Solution {
    public String longestCommonPrefix(String[] strs) {
        // StringBuffer s1=new StringBuffer();
        // for(int i=0;i<strs.length();i++){
        //     for(int j=0,k=0;j<=)
        if(strs.length==0){
            return "";
        }
        String cmp=strs[0];
        for(int i=1;i<strs.length;i++){
            //while(str[i].charAt[j]==str[i+1])
            int j=0;
            while(j<cmp.length() && j<strs[i].length() && cmp.charAt(j)==strs[i].charAt(j)){
                j++;
                //if(j==cmp.length() &&)
            }
            cmp=cmp.substring(0,j);
            if(cmp==""){
                break;
            }
        }
        return cmp;
        
        
    }
}
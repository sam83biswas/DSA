class Solution {
    public static void subset(String str,String ans,int idx){
        if(idx == str.length()){
            if(ans.length() == 0){
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
            return;
        }
        subset(str,ans+str.charAt(idx),idx+1);
        subset(str,ans,idx+1);
    }
    public static void main(String[] args) {
        subset("abc","",0);
    }
}

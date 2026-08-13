class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        rec(res,new StringBuilder(),0,0,n);
        return res;
    }
    public void rec(List<String> res,StringBuilder sb , int op,int cl,int n){
        if(sb.length() == n*2){
            res.add(sb.toString());
            return ;
        }
        if(op < n){
            sb.append('(');
            rec(res,sb,op+1,cl,n);
            sb.deleteCharAt(sb.length()-1);
        }
        if(cl < op){
            sb.append(')');
            rec(res,sb,op,cl+1,n);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}

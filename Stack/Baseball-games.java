class Solution {
    public int calPoints(String[] arr) {
        int n= arr.length;
        Stack<Integer>st= new Stack<>();
        for(int i=0;i<n;i++){
            String s=arr[i];
            if(s.equals("C")){
                st.pop();
            }else if(s.equals("D")){
                st.push(2*st.peek());
            } else if(s.equals("+")){
                int top=st.pop();
                int secondtop=st.peek();
                int sum=top+secondtop;
                st.push(top);
                st.push(sum);
            }else{
                st.push(Integer.parseInt(s));// this is used to convert string in number 
                // basically it returns integer taking from string
            }
        }
            int sum=0;
            while(st.size()>0){
                sum=sum+st.pop();
            }
            return sum;
        
    }
}

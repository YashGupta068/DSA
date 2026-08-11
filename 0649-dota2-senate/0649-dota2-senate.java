class Solution {
    public String predictPartyVictory(String str) {
        Queue<Integer>r=new LinkedList<>();
        Queue<Integer>d=new LinkedList<>();

        int n =str.length();
        for(int i=0;i<n;i++){
            if(str.charAt(i)=='R'){
                r.add(i);
            }
            else{
                d.add(i);
            }
        }


        while(!r.isEmpty() && !d.isEmpty()){
            int a=r.poll();
            int b=d.poll();
            if(a<b){
                r.add(a+n);
            }
            else{
                d.add(b+n);
            }
        }

        return r.isEmpty()? "Dire" : "Radiant";
    }
}
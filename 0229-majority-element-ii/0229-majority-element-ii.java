class Solution {
    public List<Integer> majorityElement(int[] arr) {
        int n = arr.length;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int x:arr){
            if(map.containsKey(x)){
                map.put(x,map.get(x)+1);
            }else{
                map.put(x,1);
            }
        }

        ArrayList<Integer> list = new ArrayList<>();

        for(int x : map.keySet()){
            if(map.get(x) > n/3){
                list.add(x);
            }
        }

        return list;
        
    }
}
class Solution {
    public boolean arrayStringsAreEqual(String[] w1, String[] w2) {
        StringBuilder word1 = new StringBuilder();
        StringBuilder word2 = new StringBuilder();

        for(int i=0;i<w1.length;i++){
            word1.append(w1[i]);
        }

        for(int i=0;i<w2.length;i++){
            word2.append(w2[i]);
        }

        if(word1.toString().equals(word2.toString())){
            return true;
        }

        return false;
    }
}
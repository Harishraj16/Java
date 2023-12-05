class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int cnt=0;
        int check; 
        if(ruleKey.equals("type")) check=0;
        else if(ruleKey.equals("color")) check=1;
        else check=2;
       for (List item : items )
        {
            if (item.get(check).equals(ruleValue)) cnt++;
        }
        return cnt;
    }
}

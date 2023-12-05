class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int greatest = 0;
        List<Boolean> Mostcandies =  new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            if(candies[i]>greatest) greatest=candies[i];
        }
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies >= greatest) Mostcandies.add(true);
            else  Mostcandies.add(false);
        }
        return Mostcandies;
    }
}

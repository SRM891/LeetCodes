public class MinDominoRotation {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int[] topsmax = new int[7];
        int[] bottomsmax = new int[7];
        int rotations = 0;
        for (int i=0; i<tops.length; i++){
            topsmax[tops[i]]++;
            bottomsmax[bottoms[i]]++;
        }
        int topmax = topsmax[0];
        int topmaxidx = 1;
        int bottommax = bottomsmax[0];
        int bottommaxidx = 1;
        for(int i=1; i<topsmax.length; i++){
            if(topmax<topsmax[i]){
                topmax=topsmax[i];
                topmaxidx=i;
            }
            if(bottommax<bottomsmax[i]){
                bottommax=bottomsmax[i];
                bottommaxidx=i;
            }
        }
        if(topmax>bottommax){
            for(int i=0; i< tops.length; i++){
                if(tops[i]!=topmaxidx){
                    if(bottoms[i]==topmaxidx){
                        rotations++;
                    }else{
                        break;
                    }
                }
                if(i==tops.length-1){
                    return rotations;
                }
            }
        } else {
            for(int j=0; j<tops.length; j++){
                if(bottoms[j]!=bottommaxidx){
                    if(tops[j]==bottommaxidx){
                        rotations++;
                    }else{
                        return -1;
                    }
                }
            }
        }
        return rotations;
    }
}

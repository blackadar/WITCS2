public class SearchArray {
    private static int[] ints = {4,11,-3,0,46,11,9,-77,3,11};

    private static int searchArray(int[] toSearch, int key){
        for(int i = 0; i < toSearch.length; i++){
            if(toSearch[i] == key) return i;
        }
        return -1;
    }

    public static void main(String[] args){
        System.out.println(searchArray(ints,11));
    }
}

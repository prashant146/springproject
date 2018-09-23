package solution;

import java.util.Arrays;
import java.util.List;

public class Sol {

    public static void main(String[] args) {
        System.out.println((int)'a'+" "+(int)'z');
        String str[] ={"we promptly judged antique ivory buckles for the next prize",
        "we promptly judged antique ivory buckles for the prizes",
        "the quick brown fox jumps over the lazy dog",
        "the quick brown fox jump over the lazy dog"};

        System.out.println(isPangram(Arrays.asList(str)));

    }


    public static String isPangram(List<String> strings) {
        int arr[] = null;
        String out="";
        for (String str:strings){
            arr=new int[123];
            for(int i=0; i<str.length();i++){
                int temp = (int)str.charAt(i);
                arr[temp]=arr[temp]+1;
            }
            if(checkIfAllChars(arr)){
                out=out+"1";
            }else {
                out=out+"0";
            }

        }

        return out;

    }

    public static boolean checkIfAllChars(int arr[]){

        boolean out = true;
        for(int i=97; i<123; i++){
            if(arr[i]==0){
                out=false;
            }
        }
        return out;
    }
}

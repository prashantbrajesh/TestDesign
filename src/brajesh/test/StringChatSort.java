package brajesh.test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by brajesh on 11/5/17.
 */
public class StringChatSort {

    public static void main(String args[]){
        String in1 = "ABCDEF";
        String in2 = "ABDCBA";

        Character arr1[] = new Character[in1.length()];
        Character arr2[] = new Character[in2.length()];

        for (int i=0; i< arr1.length; i++){
            arr1[i] = in1.charAt(i);
            arr2[i] = in2.charAt(i);

        }
        Comparator<Character> cmp = new Comparator<Character>() {
            @Override
            public int compare(Character character, Character t1) {
                int cmp = Character.compare(Character.toLowerCase(character.charValue()), Character.toLowerCase(t1.charValue()));
                if(cmp !=0){
                    return cmp;
                }
                return Character.compare(character.charValue(), t1.charValue());
            }
        };
        Arrays.sort(arr2, cmp);
        Arrays.sort(arr1,cmp);

    System.out.print(Arrays.equals(arr2, arr1));
    }
}

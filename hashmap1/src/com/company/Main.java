package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	    // in the following text count how many times each word repeats herself
        String text = "In a village of La Mancha, the name of which I have no desire to call to mind, there lived " +
                "not long since one of those gentlemen that keep a lance in the lance-rack, an old buckler, a " +
                "lean hack, and a greyhound for coursing. An olla of rather more beef than mutton, a salad on " +
                "most nights, scraps on Saturdays, lentils on Fridays, and a pigeon or so extra on Sundays, " +
                "made away with three-quarters of his income. The rest of it went in a doublet of fine cloth " +
                "and velvet breeches and shoes to match for holidays, while on week-days he made a brave figure " +
                "in his best homespun. He had in his house a housekeeper past forty, a niece not twenty, and a " +
                "lad for the field and market-place, who used to saddle the hack as well as handle the bill-hook. " +
                "The age of this gentleman of ours was bordering on fifty; he was of a hardy habit, spare, " +
                "gaunt-featured, a very early riser and a great sportsman. They will have it that he was of " +
                "lean build, adust complexion; rather above the common height, and very much inclined to baldness; " +
                "and so he might well be, for he was, as I have said, a great sportsman, and used to go to bed " +
                "late and get up early. As for the name of the man, it is not in my memory, for he was very " +
                "much inclined to keep it to himself and not reveal it. But this much is clear, he was known " +
                "for his skills at jousting, and his love for adventure was known far and wide. His house was " +
                "filled with the trophies of his conquests, and his reputation was such that many a young lad " +
                "would seek to emulate his prowess and bravery.";
                // O(n*n)
                // Hash -- key: word value: counter
        text = text.toLowerCase();
        text = text.replace(".", "");
        text = text.replace(",", "");
        text = text.replace(";", "");
        String[] words = text.split("\\s+");
        //Arrays.stream(words).forEach(word -> System.out.println(word));
        // DDD-DDDDDD
        // 4580-
        HashMap<String, Integer> wordsCount = new HashMap<>();
        for(String word : words) {
            if (wordsCount.containsKey(word)) {
                int value = wordsCount.get(word);
                wordsCount.put(word, value + 1);
            }
            else {
                wordsCount.put(word, 1);
            }
        }
        for(var entry : wordsCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // String text = "Your example string goes here! Make sure it's a good one.";
        // count how many times the same letter is repeated?
    }
}

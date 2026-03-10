import java.util.HashMap;
import java.util.Map;

/**
 * OOPSBannerApp UC8 - Map Collection
 * This version uses a HashMap to store character patterns for efficient retrieval.
 * It features a rendering function that dynamically builds a banner for a given word.
 *
 * @author Developer
 * @version 8.0
 */
public class OOPSBannerApp {public static Map<Character, String[]> createPatternMap() {

        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        patternMap.put('P', new String[]{
                "**** ",
                "*   *",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    "
        });

        patternMap.put('S', new String[]{
                " ****",
                "*    ",
                "*    ",
                " *** ",
                "    *",
                "    *",
                "**** "
        });

        return patternMap;
    }

    /**
     * Method to display banner message
     */
    public static void displayBanner(String word, Map<Character, String[]> patternMap) {

        StringBuilder[] banner = new StringBuilder[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = new StringBuilder();
        }

        for (char ch : word.toCharArray()) {

            String[] pattern = patternMap.get(ch);

            for (int i = 0; i < 7; i++) {
                banner[i].append(pattern[i]).append("  ");
            }
        }

        for (int i = 0; i < 7; i++) {
            System.out.println(banner[i]);
        }
    }

    /**
     * Main Method
     */
    public static void main(String[] args) {

        Map<Character, String[]> patternMap = createPatternMap();

        String word = "OOPS";

        displayBanner(word, patternMap);
    }
}
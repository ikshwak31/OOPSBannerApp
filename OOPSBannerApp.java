/**
 * OOPSBannerApp UC7 - Inner Class
 * This version uses a static inner class to encapsulate the character 
 * and its pattern, demonstrating OOP principles like Encapsulation and Modularity.
 *
 * @author Developer
 * @version 7.0
 */
import java.util.*;

public class OOPSBannerApp {

    
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        
        public char getCharacter() {
            return character;
        }

        
        public String[] getPattern() {
            return pattern;
        }
    }


    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] patterns) {

        for (CharacterPatternMap map : patterns) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }
        return new String[7];
    }


    public static void printBanner(String word, CharacterPatternMap[] patterns) {

        StringBuilder[] banner = new StringBuilder[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = new StringBuilder();
        }

        for (char ch : word.toCharArray()) {

            String[] pattern = getCharacterPattern(ch, patterns);

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

        String[] O = {
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        };

        String[] P = {
                "**** ",
                "*   *",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    "
        };

        String[] S = {
                " ****",
                "*    ",
                "*    ",
                " *** ",
                "    *",
                "    *",
                "**** "
        };

        CharacterPatternMap[] patterns = {
                new CharacterPatternMap('O', O),
                new CharacterPatternMap('P', P),
                new CharacterPatternMap('S', S)
        };

        printBanner("OOPS", patterns);
    }
}
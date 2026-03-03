public class OOPSBannerApp {

    public static void main(String[] args) {

        // Array initialization via methods
        String[] banner = new String[7];

        String[] o = getOPattern();
        String[] p = getPPattern();
        String[] s = getSPattern();

        // Build OOPS (O O P S)
        for (int i = 0; i < 7; i++) {
            banner[i] = o[i] + o[i] + p[i] + s[i];
        }

        // Loop-Based Rendering (Enhanced for loop)
        for (String line : banner) {
            System.out.println(line);
        }
    }

    // Helper Method for O
    public static String[] getOPattern() {
        return new String[]{
                String.join("", "  *****  "),
                String.join("", " *     * "),
                String.join("", "*       *"),
                String.join("", "*       *"),
                String.join("", "*       *"),
                String.join("", " *     * "),
                String.join("", "  *****  ")
        };
    }

    // Helper Method for P
    public static String[] getPPattern() {
        return new String[]{
                String.join("", " ******  "),
                String.join("", " *     * "),
                String.join("", " *     * "),
                String.join("", " ******  "),
                String.join("", " *       "),
                String.join("", " *       "),
                String.join("", " *       ")
        };
    }

    // Helper Method for S
    public static String[] getSPattern() {
        return new String[]{
                String.join("", "  *****  "),
                String.join("", " *     * "),
                String.join("", " *       "),
                String.join("", "  *****  "),
                String.join("", "        *"),
                String.join("", " *     * "),
                String.join("", "  *****  ")
        };
    }
}
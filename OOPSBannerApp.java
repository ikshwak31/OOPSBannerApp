/**
* OOPSBannerApp UC3 - String.join()
 * This version prints the OOPS banner using ASCII art.
 * It refactors the code to use String.join() instead of the '+' operator
 * to improve memory efficiency and reduce intermediate object creation.
 *
 * @author Developer
 * @version 3.0
 */
 public class OOPSBannerApp {
    public static void main(String[] args) {

        System.out.println(String.join(" ", "  *****  ", "  *****  ", " ******  ", "  *****  "));
        System.out.println(String.join(" ", " *     * ", " *     * ", " *     * ", " *     * "));
        System.out.println(String.join(" ", " *     * ", " *     * ", " *     * ", " *       "));
        System.out.println(String.join(" ", " *     * ", " *     * ", " ******  ", "  *****  "));
        System.out.println(String.join(" ", " *     * ", " *     * ", " *       ", "       * "));
        System.out.println(String.join(" ", " *     * ", " *     * ", " *       ", " *     * "));
        System.out.println(String.join(" ", "  *****  ", "  *****  ", " *       ", "  *****  "));
    }
}
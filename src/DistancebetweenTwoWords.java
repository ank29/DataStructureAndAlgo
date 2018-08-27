public class DistancebetweenTwoWords {
    public static double shortestDistance(String doc,String word1,String word2){
        String[] words = doc.split(" ");
        boolean found = false;
        int index = 0;
        double wordloc1 = -1.0;
        double wordloc2 = -1.0;
        double shortest = Double.MAX_VALUE;
        for(String word:words){
            if(word.contains(","))
                word = word.replace(","," ");
            if(word.contains("."))
                word = word.replace("."," ");
            if(word.equalsIgnoreCase(word1))
                wordloc1 = index + (word1.length() / 2);
            else if(word.equalsIgnoreCase(word2))
                wordloc2 = index + (word2.length() / 2);

            if(wordloc1 > 0 && wordloc2 > 0) {
                if(wordloc2 > wordloc1) {
                    shortest = wordloc2 - wordloc1;
                    found = true;
                    break;
                }
            }

            index = index+word.length()+1;
        }
        if(found)
            return  shortest;
        else return -1;
    }
    public static void main(String args[]){
        String s = "In publishing and graphic design, lorem ipsum is a filler text commonly used to demonstrate the graphic elements of a document or visual presentation. Replacing meaningful content that could be distracting with placeholder text may allow viewers to focus on graphic aspects such as font, typography, and page layout. It also reduces the need for the designer to come up with meaningful text, as they can instead use hastily generated lorem ipsum text. The lorem ipsum text is typically a scrambled section of De finibus bonorum et malorum, a 1st-century BC Latin text by Cicero, withwords altered, added, and removed to make it nonsensical, improper Latin. A variation of the ordinary lorem ipsum text has been used in typesetting since the 1960s or earlier, when it was popularized by advertisements for Letraset transfer sheets. It was introduced to the Information Age inthe mid-1980s by Aldus Corporation, which employed it in graphics and word processing templates for its desktop publishing program, PageMaker, for the Apple Macintosh. A common form of lorem ipsum reads: Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        System.out.println(shortestDistance(s,"transfer","it"));
    }
}

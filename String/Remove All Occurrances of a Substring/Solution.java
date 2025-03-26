class Solution {
    public String removeOccurrences(String s, String part) {

        StringBuilder sb = new StringBuilder(s);
        int partLen = part.length();

        while (sb.indexOf(part) != -1) {
            int start = sb.indexOf(part);
            sb.delete(start, start + partLen); // Remove the substring 'part'
        }

        return sb.toString();

        
        
    }
}

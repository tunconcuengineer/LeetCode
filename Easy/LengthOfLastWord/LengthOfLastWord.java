package Easy.LengthOfLastWord;


public class LengthOfLastWord {
    public static void main(String[] args) {
      
       
        
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));

        
    }
    public static int lengthOfLastWord(String s) {
    String s1 = s.stripLeading().stripTrailing().strip();
    System.out.println("s1 "+s1);
    s1 = s1.substring(s1.lastIndexOf(" ")+1);
    System.out.println("Second s1 "+s1);
    
    
    return s1.length();
        
    }
}

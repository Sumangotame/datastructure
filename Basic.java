// import java.util.HashMap;
// import java.util.Map;

import java.util.HashMap;
import java.util.Map;

public class Basic {
    public static void main(String[] args) {
      String sentence="ssuman gautam";
      String[] newSentence=sentence.split(" ");
      HashMap<Character,Integer> letterCount= new HashMap<Character,Integer>();
    for(String s:newSentence){
        for(char c: s.toCharArray()){
            if(letterCount.containsKey(c))
            {
                letterCount.put(c,letterCount.get(c)+1);
            }
            else{
                letterCount.put(c,1);
            }
        }
    }
        int maxcount=0;
        StringBuilder maxChar= new StringBuilder();
        for(Map.Entry<Character, Integer> entry: letterCount.entrySet()){
            if(entry.getValue()>maxcount)
            {
                maxcount=entry.getValue();
                maxChar.append(entry.getKey());
            }
            else if (entry.getValue() == maxcount) {
                if(maxChar.length()>0){
                    maxChar.append(",");
                }
                maxChar.append(entry.getKey());
            }
        }
System.out.println("sentence has max key: "+maxChar +" and count is: "+maxcount);
    }
}

import java.util.*;
class Solution {
    char[] d = {'A', 'E', 'I', 'O', 'U'};
    List<String> words = new ArrayList<>();
    public int solution(String word) {

        dfs("");
        return words.indexOf(word);
    }
    
    void dfs(String currentWord) {
        words.add(currentWord);
        
        if(currentWord.length() == 5) {
            return;
        }
        
        for(char c : d) {
            dfs(currentWord + c);
        }
    }
}
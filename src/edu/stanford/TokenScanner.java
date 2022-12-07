package edu.stanford;

/**
 * @Auther: yuguo
 * @Date: 2022/1/5 - 01 - 05 - 18:41
 * @Description: edu.stanford
 * @version: 1.0
 */
public class TokenScanner {
    public TokenScanner() {
        ignoreWhitespaceFlag = false;
        setInput("");
    }

    public TokenScanner(String str) {
        this();
        setInput(str);
    }
    public void setInput(String str){
        input = str;
        savedToken = null;
        cp = 0;
    }
    public String nextToken(){
        String token = savedToken;
        savedToken = null;
        if(token == null){
            token = "";
            if(ignoreWhitespaceFlag) skipWhitespace();
            if(cp == input.length()) return "";
            char ch = input.charAt(cp++);
            token += ch;
            if(Character.isLetterOrDigit(ch)){
                while(cp < input.length() && Character.isLetterOrDigit(input.charAt(cp))){
                    token += input.charAt(cp++);
                }
            }
        }
        return token;
    }
    public void saveToken(String token){
        savedToken = token;
    }
    public boolean hasMoreTokens() {
        if(ignoreWhitespaceFlag) skipWhitespace();
        return cp < input.length();
    }
    public void ignoreWhitespace(){
        ignoreWhitespaceFlag = true;
    }
    private void skipWhitespace(){
        while(cp < input.length() && Character.isWhitespace(input.charAt(cp))){
            cp++;
        }
    }
    private String input;
    private String savedToken;
    private int cp;
    private boolean ignoreWhitespaceFlag;
}

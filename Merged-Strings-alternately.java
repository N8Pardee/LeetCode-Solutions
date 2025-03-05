class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        StringBuilder mergedString = new StringBuilder();       
        int letterIndex = 0;
        int word1Len = word1.length();
        int word2Len = word2.length();
         int shorterWordLength = 0;
        int longerWordLength = 0;
    

        if(word1Len> word2Len)
        {
            shorterWordLength = word2.length();
            longerWordLength = word1.length();
       }
        else{
            shorterWordLength = word1.length();
            longerWordLength = word2.length();
        }

    
            while(letterIndex < longerWordLength || letterIndex < shorterWordLength){

                try{    
                    if(letterIndex < word1Len){
                        mergedString.append(word1.charAt(letterIndex));              
                        }
                    
                    if(letterIndex < word2Len){                
                            mergedString.append(word2.charAt(letterIndex));
                        }      
                }catch(Exception e){
                    System.out.println("Possible error with word length");
                }    

                 letterIndex++; 
            } 
       

        return mergedString.toString();
    }
}

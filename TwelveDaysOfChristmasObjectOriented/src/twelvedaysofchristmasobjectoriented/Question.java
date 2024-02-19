
package twelvedaysofchristmasobjectoriented;


public class Question {
    private String text;
    private String answer;
    
    public Question(){
        text = "";
        answer = "";
    }
    
     public Question(String inText, String inAnswer){
        text = inText;
        answer = inAnswer;
    }

    public String getText() {
        return text;
    }

    public String getAnswer() {
        return answer;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
     
    //check if user guest correctly
     public boolean isCorrect(String userInput){
         
         if(userInput.equalsIgnoreCase(answer)){
             return true;
         } else {
             return false;
         }
     }
     
     
     public String toString(){
         return "On the " + text + " day of Christmas, my true love gave to me:";
     }
     
     
    
}

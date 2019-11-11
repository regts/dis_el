public class SimpleDotComGame {
    public static void main(String args[]) {
       int numOfGuesses = 0;
       
       GameHelper helper = new GameHelper();
       
       SimpleDotCom theDotCom = new SimpleDotCom();
       
       int rendomNum = (int) (Math.random() * 5);
       
       int[] locations = {randomNum, randomNum + 1, randomNum + 2};
       theDotCom.setLocationCells(locations);
       boolean isAlive = true;
       
       while(isAlive == true){
        String guess = helper.getUserInput("Введите число");
        String result = theDotCom.checkYourself(guess);
        numOfGuesses++;
        if(result.equals("Потопил")){
            isAlive = false;
            System.out.println("Потребовалось " + numOfGuesses + " попыток");
        }
       }
    }
}
class SimpleDotCom{
    int[] locationCells;
    int numOfHits = 0;
    
    public void setLocationCells(int[] locs){
        locationCells = locs;
    }
    public String checkYourself(String stringGuess){
        int guess = Integer.parseInt(stringGuess);
        String result = "Мимо";
        
        for (int cell : locationCells){
            if(guess == cell){
                result = "Попал";
                numOfHits++;
                break;
            }
        }
        if(numOfHits == locationCells.length){
            result = "Потопил";        
        }
        System.out.println(result);
        return result;
    }
}
public class GameHelper{
    public String getUserInput(String prompt){
        String inputLine = null;
        System.out.print(prompt + " ");
        try{
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0){ 
            return null;
            
            catch (IOException e){
                System.out.println("IOException: " + e);
            }
            return inpuLine;
        }
    }
}

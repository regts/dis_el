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
--------------------------------------------------------------------------------------------
    
    import java.util.*;
public class BotComBust{
  private GameHelper helper = new GameHelper();
  private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
  private int numOfGuesses = 0;
  
  private void setUpGame(){
  	DotCom one = new DotCom();
    one.setName("Pets.com");
    DotCom two = new DotCom();
    two.setName("eToys.com");
    DotCom three = new DotCom();
    three.setName("Go2.com");
    dotComsList.add(one);
    dotComsList.add(two);
    dotComsList.add(three);
    
    System.out.println("Ваша цель - потопить три "сайта".");
    System.out.println("Pets.com, eToys.com, Go2.com");
    System.out.println("Попытайтесь потопить их за минимальное количество ходов");
    
    for (DotCom dotComToSet : dotComsList){
    ArrayList<String> newLocation = helper.placeDotCom(3);
    dotComToSet.setLocationCells(newLocation);
    }
  }

  private void startPlaying(){
    while(!dotComsList.isEmpty()){
    String userGuess = helper.getUserInput("Сделайте ход");
      checkUserGuess(userGuess);
    }
    finishGame();
  }
  
  private void checkUserGuess(String userGuess){
  	numOfGuesses++;
    String result = "Мимо";
    
    for (DotCom dotComToTest : dotComsList){
    	result = dotComToTest.checkYourself(userGuess);
      if (result.equals("Попал")){
       break;
      }
      if (result.equals("Потопил")){
      dotComsList.remove(dotComTotest);
        break;
      }
    }
    System.out.plintln(result);
  }
  private void finishGame(){
    System.out.plintln("Все "сайты" ушли ко дну! Ваши акции теперь ничего не стоятю");
    if (numOfGuesses <= 18){
    	System.out.plintln("Это заняло у вас всего" + numOfGuesses + "попыток.");
      	System.out.plintln("Вы успели выбраться до того, как ваши вложения утонули.");
    }else{
    	System.out.plintln("Это заняло у вас довольно много времени." + numOfGuesses + "попыток.");
      	System.out.plintln("Рыбы водят хороводы вокруг ваших вложений.");
    }
  }
public static void main(String[] args){
	DotComBust game = new DotComDust();
  game.setUpGame();
  game.startPlaying();
	}
}  


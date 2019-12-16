public class DotCom{
 private ArrayList<String> locationCells;
  private String name;
  
  public void setLocationCells(ArrayList<String> loc){
  	locationCells = loc;
  public void setName(String n){
  name = n;
  }
  public String checkYourseld (String userInput){
  String result = "Мимо";
    int index = locationCells.indexOF(userInput){
      if (index >=0 ){
      	locationCells.remove(index);
        
        if (locationCells.isEmpty()){
        	result = "Потопил";
          System.out.print("Ой! Вы потопили" + name + " :( ");
        }else{
        	result = "Попал";
        }
      }
      return result;
    }
  }
}

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
    
    System.out.println("Ваша цель - потопить три сайта.");
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
    System.out.plintln("Все сайты ушли ко дну! Ваши акции теперь ничего не стоятю");
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

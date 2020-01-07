public class Main
{
	public static void main(String[] args)
	throws java.io.IOException{
	   int x, y;
	    y = 1+(int)(Math.random()*10);//получить рандомное числo
	    System.out.println("Зaдyмaно число из диапазона 1-10");
	    System.out.print("Пoпытaйтecь угадать: ");
	    
	    x = (int) System.in.read(); //получить символ с клавиатуры
	    if(x==y){
	        System.out.println("*** Правильно! ***");
	        }else{
	            System.out.print("...Попробуйте еще раз...");
    
	            }
	}
}

public class Main
{
	public static void main(String[] args) {
	  //Создаем 3 набора слов
    String[] wordListOne = {"стол", "писатель", "счёт", "фломастер", "учительница", "торт", "спорт", "пират", "друг", "любовник"};
    String[] wordListTwo = {"космический", "крутой", "идеальный", "горячий", "редкостный", "безупречный", "вонючий", "лысого", "пидоры", "Путина"};
    String[] wordListThree = {"был", "как", "не", "любит", "бывает", "большой", "тот", "лучше", "хуже"};
    //Вычесляем, сколько слов в каждом списке
    int oneLength = wordListOne.length;
    int twoLength = wordListTwo.length;
    int threeLength = wordListThree.length;
    //Генерируем три случайных числа
    int rand1 = (int) (Math.random() * oneLength);
    int rand2 = (int) (Math.random() * twoLength);
    int rand3 = (int) (Math.random() * threeLength);
    //Строим фразу
    String phrase = wordListOne[rand1] + " " +
    wordListThree[rand3] + " " + wordListTwo[rand2];
    //Вывод фразы на экран
    System.out.println("Все знают, что " + phrase);
	}
}

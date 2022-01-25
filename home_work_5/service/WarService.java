package home_work_5.service;

import home_work_5.dto.EasySearch;
import home_work_5.service.comparator.TopComparator;

import java.awt.print.Printable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class WarService {

    /**
     * Метод, который создает String с текстом Война и мир, чтобы в дальнейшем с ним работать
     * в следующих публичных методах а так же в классе EasySearch
     * @return String с текстом Война и мир
     */
    public String warAndPeace(){
        String text = null;
        try {
            Path filePath = Path.of("Война и мир.txt");
            text = Files.readString(filePath);
        }catch (FileNotFoundException e){
            System.out.println("Файл не найден");
        }catch (IOException a){
            System.out.println("Проблемы при чтении");
        }
        return text;
    }

    /**
     * Задание 2.1
     * Метод, который позволяет создать коллекцию Set с использованными словами в тексте
     * @return коллекцию Set с использованными словами в тексте
     */
    public Set<String> getSetWords(){
        String text = warAndPeace();
        Set<String> words = new HashSet<>();
        StringBuilder builder = new StringBuilder();
        String word;
        for(int i = 0; i < text.length(); i++){
            if(Character.isLetterOrDigit(text.charAt(i))){
                builder.append(text.charAt(i));
            }else{
                word = builder.toString();
                builder.setLength(0);
                if(!word.equals("")){
                    words.add(word);
                }
            }
        }
        return words;
    }

    /**
     * Задание 2.2
     * Метод, который выводит топ N повторяющихся слов. (Топ N получаем в параметр)
     * P.S. я тут намудрил ппц, не факт что повторю такое сам, но выводит, вроде как, то что нужно
     * @param numerOfTop получает количество топ N (сколько вывести топов)
     */
    public void getTop(int numerOfTop){

        String text = warAndPeace();
        Map<String, Integer> wordAndCount = new HashMap<>();
        StringBuilder builder = new StringBuilder();
        String word;
        for(int i = 0; i < text.length(); i++){
            if(Character.isLetterOrDigit(text.charAt(i))){
                builder.append(text.charAt(i));
            }else{
                word = builder.toString();
                builder.setLength(0);
                if(!word.equals("")){
                    if (wordAndCount.containsKey(word)) {
                        wordAndCount.put(word, wordAndCount.get(word) + 1);
                    }else {
                        wordAndCount.put(word, 1);
                    }
                }

            }
        }
        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(wordAndCount.entrySet());
        sortedList.sort(new TopComparator().reversed());

        int topN = 0;
        System.out.println("Топ " + numerOfTop + " часто повторяющихся слов в тексте");
        for (Map.Entry<String, Integer> stringIntegerEntry : sortedList) {
            if(topN < numerOfTop){
                System.out.println(stringIntegerEntry.toString());
            }
            topN += 1;
        }
    }

    /**
     * Задание 4.1
     */
    public void easySearchRun(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите слово, количество повторений которого в тексте вы хотите узнать");
        String word = scan.nextLine();
        EasySearch easySearch = new EasySearch();
        System.out.println("Слово " + word + " повторяется - " + easySearch.search(warAndPeace(), word)+ " раз");
    }
}

package home_work_5.dto;

import home_work_5.dto.api.ISearchEngine;

public class EasySearch implements ISearchEngine {

    /**
     * 4.1 Написать класс EasySearch. Реализовать поиск используя метод indexOf из класса String.
     * В данной реализации запрещено использовать регулярные выражения в любом виде, для любых задач.
     * Данный класс ищет слова с учётом регистра.
     * @param text
     * @param word
     * @return
     */

    @Override
    public long search(String text, String word) {
        int fitstIndex = text.indexOf(word);
        int index = fitstIndex;
        long count = 1;
        if(fitstIndex == -1){
            return 0;
        }else {
            while (index != -1) {
                if ((index = text.indexOf(word, index + word.length())) == -1) {
                    return count;
                }else{
                    if(Character.isLetterOrDigit(text.charAt(index-1)) ||
                            Character.isLetterOrDigit(text.charAt(index + word.length()))){
                        continue;
                    }else{
                        count += 1;
                    }
                }
            }
        }
        return count;
    }
}

package home_work_4.service.comparators;

import home_work_4.dto.DataContainer;

import java.util.Comparator;
import java.util.Objects;

public class StringComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        if(Objects.equals(o1, o2)){
            return 0;
        }
        if(o1 == null){
            return -1;
        }
        if(o2 == null){
            return 1;
        }
        return o1.compareTo(o2);
    }
}

package ch11;

/* Write a method intersect that accepts two maps whose keys are strings and whose values are integers as parameters
and returns a new map containing only the key/value pairs that exist in both of the parameter maps.
In order for a key/value pair to be included in your result,
not only do both maps need to contain a mapping for that key, but they need tomapittothesamevalue.
Forexample,ifthetwomapspassedare{Janet=87, Logan=62, Whitaker=46, Alyssa=100, Stefanie=80, Jeff=88, Kim=52, Sylvia=95}
and{Logan=62, Kim=52, Whitaker=52, Jeff=88, Stefanie=80, Brian=60, Lisa=83, Sylvia=87},
yourmethodwouldreturnthefollowingnewmap (theorderofthekey/valuepairsdoesnotmatter):{Logan=62, Stefanie=80, Jeff=88, Kim=52}. */

import java.util.HashMap;
import java.util.Map;

public class opg14
{
    public static void main(String[] args)
    {
        Map<String, Integer> mapOne = new HashMap<>();
        Map<String, Integer> mapTwo = new HashMap<>();

        mapOne.put("Janet", 87);
        mapOne.put("Logan", 62);
        mapOne.put("Whitaker", 46);
        mapOne.put("Alyssa", 100);
        mapOne.put("Stefanie", 80);
        mapOne.put("Jeff", 88);
        mapOne.put("Kim", 52);
        mapOne.put("Sylvia", 95);

        mapTwo.put("Logan", 62);
        mapTwo.put("Kim", 52);
        mapTwo.put("Whitaker", 52);
        mapTwo.put("Jeff", 88);
        mapTwo.put("Stefanie", 80);
        mapTwo.put("Brian", 60);
        mapTwo.put("Lisa", 83);
        mapTwo.put("Sylvia", 87);

        System.out.println(intersect(mapOne, mapTwo));
    }

    public static Map<String, Integer> intersect (Map<String, Integer> map1, Map<String, Integer> map2)
    {
        Map<String, Integer> temporyMap = new HashMap<>();

        for (Map.Entry<String, Integer> mapEntry : map1.entrySet())
        {
            if (map2.containsKey(mapEntry.getKey()) && map2.containsValue(mapEntry.getValue()))
            {
                temporyMap.put(mapEntry.getKey(), mapEntry.getValue());
            }
        }
        return temporyMap;
    }
}

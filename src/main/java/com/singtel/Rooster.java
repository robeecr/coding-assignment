package main.java.com.singtel;

import java.util.HashMap;
import java.util.Map;

public class Rooster extends Chicken {
    private static final Map<String, String> languageMap;
    static
    {
        languageMap = new HashMap<String, String>();
        languageMap.put("English", "cock-a-doodle-doo");
        languageMap.put("Danish", "kykyliky");
        languageMap.put("Dutch", "kukeleku");
        languageMap.put("Finnish", "kukko kiekuu");
        languageMap.put("French", "cocorico");
        languageMap.put("German", "kikeriki");
        languageMap.put("Greek", "kikiriki");
        languageMap.put("Hebrew", "coo-koo-ri-koo");
        languageMap.put("Hungarian", "kukuriku");
        languageMap.put("Italian", "chicchirichi");
        languageMap.put("Japanese", "ko-ke-kok-ko-o");
        languageMap.put("Portuguese", "cucurucu");
        languageMap.put("Russian", "kukareku");
        languageMap.put("Swedish", "kuckeliku");
        languageMap.put("Turkish", "kuk-kurri-kuuu");
        languageMap.put("Urdu", "kuklooku");
        languageMap.put("Malayalam", "cocora-coco");
    }

    public boolean sing(String language) {
        if(language == null || language.isEmpty() ){
            System.out.println("Cock-a-doodle-doo");
        } else {
            System.out.println(languageMap.get(language));
        }
        return true;
    }
}

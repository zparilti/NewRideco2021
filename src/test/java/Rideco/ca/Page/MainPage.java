package Rideco.ca.Page;

import Rideco.ca.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MainPage {

    // this class can be used to create objects
    public MainPage() {
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//input[@type='text']")
    public WebElement inputBox;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//container//*[text()[contains(., 'output')]]")
    public WebElement outputText;

    public boolean isInputNumber(String str){
        return !testing(str).isEmpty();
    }

    public String testing(String a) {
        inputBox.sendKeys (a +"");
        submitButton.click();
        String str=outputText.getText();
        str=str.substring(17); // We get input and output together so we crop and get the output result only.
        return str;
    }

    public boolean unique(int n) {
        Set set = new HashSet();

        for (int i = 0; i < n; i++) {
            set.add(testing(i + ""));
        }
        return set.size() == n;
    }

    public boolean consistent(int a, int n) {
        Set set = new HashSet();
        for (int i = 0; i < n; i++) {
            set.add(testing(a + ""));
        }
        return set.size() == 1;
    }

    public boolean scramble(int a, int b){
        String out1=testing ( a+"")+"";
        String out2=testing( b+"")+"";
        Map<Character, Integer> map1= new HashMap();
        Map<Character, Integer> map2= new HashMap();
        for (int i = 0; i<out1.length(); i++) {
            if (!map1.containsKey(out1.charAt(i))) {

                map1.put(out1.charAt(i), 1);
            } else {
                map1.put(out1.charAt(i), (map1.get(out1.charAt(i)) + 1));
            }
        }

        for (int i = 0; i<out2.length(); i++) {
            if (!map2.containsKey(out2.charAt(i))) {
                map2.put(out2.charAt(i), 1);
            } else {
                map2.put(out2.charAt(i), (map2.get(out2.charAt(i)) + 1));
            }
        }

        int freq=0;
        if(map1.keySet() == map1.keySet()) {
            for (Character key : map1.keySet()) {
                if (map1.get(key) == map2.get(key)) {
                    freq++;
                }
            }
        }
        return freq==map1.keySet().size();
    }


}

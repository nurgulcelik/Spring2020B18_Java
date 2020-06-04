package day47_Abstraction;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public final class ChromeDriver extends RemoteWebDriver {
    public void get(String URL){
        System.out.println("Opening "+URL+" in Chrome Browser");
    }
    public void quit(){
        System.out.println("Closing the Chrome Browser");
    }
}

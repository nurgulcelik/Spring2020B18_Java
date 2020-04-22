package day25_MethodsRecap;
/* write a return method named getDriver1 that accepts a string parameter called Browser
				if the browser name matches with {"chrome", "firefox", "id", "safari", "edge", "Opera"}, then it returns the name of that specific browser' driver
					Ex: getDriver("chrome");  ==> "Chrome Driver"
						getDriver("fireFOX"); ==> "FireFox Driver"
	if the browser name does not match with any of browsers above, the method should return "Invalid"

 */
public class Driver {
    public static void main(String[] args) {
        String str = getDriver1("Firefox");
String str2=getDriver2("chrome");
String str3= getDriver3("safari");
String str4=GetDriver1("edge");
        String str5=GetDriver2("opera");
        System.out.println(str5);
        System.out.println(str4);
        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);
    }

    public static String getDriver1(String browserName) {
        String result;

        switch (browserName.toLowerCase()) {// if you use to uppercase,we should use like "CHROME"in the all cases

            case "chrome":
                result= "Chrome Driver";
                break;
            case "firefox":
                result = "Firefox Driver";
                break;
            case "safari":
                result = "Safari Driver";
                break;
            case "opera":
                result = "Opera Driver";
                break;
            case "edge":
                result = "Edge Driver";
                break;

            default:
                result = "Invalid Driver";
        }
        return result;

    }//with switch
    public static String getDriver2(String browserName) {
        browserName = browserName.toLowerCase();
        String result ;
        if (browserName.equals("chrome")) {
result="Chrome Driver";
        }else  if (browserName.equals("firefox")) {
            result = "Firefox Driver";
        }else  if (browserName.equals("safari")) {
            result = "Safari Driver";
        }else  if (browserName.equals("opera")) {
            result = "Opera Driver";
        }else if (browserName.equals("edge")) {
            result = "Edge Driver";
        }else{
            result="Invalid Driver";
        }
        return result;
    }//with if statements
    public static String getDriver3(String browserName){
       browserName= browserName.toLowerCase();
        String result;
        result=(browserName.equals("chrome"))?"Chrome Driver":
                (browserName.equals("safari"))?"Safari Driver":
                        (browserName.equals("opera"))?"Opera Driver":
                                (browserName.equals("edge"))?"Edge Driver":
                                        (browserName.equals("firefox"))?"Firefox Driver":"Invalid Driver" ;

        return result;
    }//with ternary
    public static String GetDriver1(String browserName){
        switch(browserName.toLowerCase()){

            case "chrome":return"Chrome Driver";
            case "safari":return"Safari Driver";
            case "firefox":return"Firefox Driver";
            case "edge": return "Edge Driver";
            case "opera": return "Opera Driver";
            default:return "Invalid Driver";
        }

    }
    public static String GetDriver2(String browserName){

        browserName=browserName.toLowerCase();
        if(browserName.equals("chrome")){
            return "Chrome Driver";
        }else if(browserName.equals("safari")){
            return "Safari Driver";
        }else if(browserName.equals("edge")){
            return "Edge Driver";
        }else if(browserName.equals("opera")) {
            return "Opera Driver";
        }else if(browserName.equals("firefox")){
            return "Firefox Driver";
        }else{
            return "Invalid Driver";
        }

    }
}
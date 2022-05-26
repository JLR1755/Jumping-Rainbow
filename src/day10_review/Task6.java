package day10_review;

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// if statement 
		
String browser = "Edge";
        
        if (browser == "chrome" ) {
            System.out.println("CHROME BROWSER IS SELECTED");
        } else if (browser == "firefox") {
            System.out.println("Firefox Browswer is selected");
        } else if (browser== "opera") {
            System.out.println("Opera Browser is Selected");
        } else if (browser == "Safari") {
            System.out.println("Safari Browswer is selected");
        } else if (browser == "edge") {
            System.out.println("Edge Browswer is Selected");
        } else if (browser == "ie") {
            System.out.println("IE Browswer is Selected");
        
        }else {
        	System.out.println("INVALID");
        }
		
		// =====switch statement=====
        
        switch(browser) {
        case "CHROME":
        	System.out.println("Chrome Browswer Selected");
        	break;
        case "Edge":
        System.out.println("Edge Browswer is Selected");
        break;
        case "Firefox":
        System.out.println("Firefox Browseris Selected ");
        break;
        default: System.out.println("INVALID");
        
        
        }
		
	}

}

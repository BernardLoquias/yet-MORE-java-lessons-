public class Conditionals { // conditionals are all about booleans
    public static void main(String[] args) {

        //Basic booleans
        System.out.println("Double equals: " + (3 == 2));
        System.out.println("String equivalent: " + Hello.equals("Hi there"));
        System.out.println("Not equals: " + (7 != 4));
        System.out.println("Greater than: " + (7 > 4));
        
        int num = 11;
        System.out.println(num <=12);
        if (num <=12) {
            System.out.println("num is less than or equals to 12");
        } else {
            System.out.println("yay you did it! num is greater than 12");
        }

        //if...else if...else
        int temperature = 93;
        if (temperature >= 85) {
            System.out.println("It's hot!"); 
        } else if (temparature >= 60) {
            System.out.println("It's nice!"); 
        } else if (temparature < 40) {
            System.out.println("It's cold!");
        } else {
            System.out.println("ERROR!"); 
        }

        // Logical 'and' 

        int age = 17;
        boolean hasPermit = true; 

        if (age >= 17 && hasPermit) {
            System.out.println("You can drive");
        } else {
            System.out.println("You can't drive yet lil bro"); 
        }

        // Logical 'or' ||

        String day = "Saturday"; 

        if day.equals("Saturday") || day.equals("Sunday") {
            System.out.println("It's the weekend!");
        } else if day.equals("Monday") || 
                  day.equals("Tuesday") || 
                  day.equals("Wednesday") || 
                  day.equals("Thursday") || 
                  day.equals("Friday") {
            System.out.println("It's the weekday >:(");
        } else {
            System.out.println("That is NOT a day lil bro"); 
        }

    }
}
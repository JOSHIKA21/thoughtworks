import java.util.*;
class pizza{
    Scanner sc=new Scanner(System.in);
    private int price = 0;
    private String base="";
    private String sauce="";
    private String toppins="";
    private String drink="";
    private String dessert="";
    private boolean isDrink=false;
    private boolean isDessert=false;
    void selectBase(){
        System.out.println("Please select your Pizza Base from below listed base:");
        System.out.println("1. Regular - Rs.50");
        System.out.println("2. Whole Wheat - Rs.75");
        System.out.println("You can select any one of the Pizza base");
        System.out.println("You can enter 1 for Regular or You can enter 2 for whole wheat");
        int basech = sc.nextInt();
        if(basech==1){
            price+=50;
            base="Regular";
        }
        else if(basech==2){
            price+=75;
            base="Whole Wheat";
        }
        else{
            System.out.println("Pease select only available base");
        }
    }

    void selectSauce(){
        System.out.println("Please select Type of sauce you prefer:");
        System.out.println("1. Marinara sauce");
        System.out.println("2. Pesto sauce");
        int saucech=sc.nextInt();
        if(saucech==1){
            sauce="Marinara sauce";
        }
        else if(saucech==2){
            sauce="Pesto sauce";
        }
        else{
            System.out.println("Please select sauce you prefer");
        }
    }

    void selectToppings(){
        System.out.println("Please select toppings you like:");
        String c;
        do { 
            System.out.println("1. Mozzarella cheese");
            System.out.println("2. Cheddar cheese");
            System.out.println("3. Spinach");
            System.out.println("4. Corn");
            System.out.println("5. Mushroom ");
            System.out.println("6. Chicken ");
            System.out.println("7. Pepperoni ");
            int toppingsch=sc.nextInt();
            switch (toppingsch) {
                case 1:
                    price+=30;
                    toppins+="Mozzarella cheese";
                    break;
                case 2:
                    price+=35;
                    toppins+="Cheddar cheese";
                    break;
                case 3:
                    price+=20;
                    toppins+="Spinach";
                    break;
                case 4:
                    price+=15;
                    toppins+="Corn";
                    break;
                case 5:
                    price+=15;
                    toppins+="Mushroom";
                    break;
                case 6:
                    price+=50;
                    toppins+="Chicken";
                    break;
                case 7:
                    price+=45;
                    toppins+="Pepperoni";
                    break;
                default:
                    System.out.println("Please select any one of the toppings");
            }
            System.out.println("Do you want to add more toppings? Y/N");
            c=sc.next();
            
        } while (c.equals("y")||c.equals("Y"));
    }

    void selectDrink(){
        System.out.println("1. Pepsi");
        System.out.println("2. 7-up");
        System.out.println("3. Coke");
        int drinkdesch=sc.nextInt();
        switch (drinkdesch) {
            case 1:
                price+=17;
                drink="Pepsi";
                break;
            case 2:
                price+=19;
                drink="7-up";
                break;
            case 3:
                price+=20;
                drink="Coke";
                break;
            default:
                System.out.println("Select the drink that are available");
        }
    }    
    void selectDessert(){
        System.out.println("1. Lava cake");
        System.out.println("2. Chocolate brownie");
        int desch=sc.nextInt();
        switch (desch) {
            case 1:
                price+=95;
                dessert="Lava cake";
                break;
            case 2:
                price+=86;
                dessert="Chocolate brownie";
                break;
            default:
                System.out.println("Select the dessert that are available");
        }
    }

    double bill(){
        
        System.out.println("Do you like to have Drinks? Y/N");
        String c=sc.next();
        if(c.equals("y")||c.equals("Y")){
            selectDrink();
            isDrink=true;
        }
        System.out.println("Do you like to have Desserts? Y/N");
        String ch=sc.next();
        if(ch.equals("y")||ch.equals("Y")){
            selectDessert();
            isDessert=true;
        }
        double a=price;
        double amt=0;
        if(c.equals("y")||ch.equals("y")){
            amt=(double) (a)*0.05;
            a=a-amt;
        }
        
        System.out.println("Pizza base: "+base);
        System.out.println("Sauce: "+sauce);
        System.out.println("Topping: "+toppins);
        if(isDrink){
            System.out.println("Drink: "+drink);
        }
        if(isDessert){
            System.out.println("Dessert: "+dessert);
        }
        System.out.println("Amount to be paid: "+a +" Rs");
        return a;
    }
}

class pizzaStore{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        pizza piz=new pizza();
        System.out.println("Welcome to pizza store");
        piz.selectBase();
        piz.selectSauce();
        piz.selectToppings();
        piz.bill();
       
    }
}

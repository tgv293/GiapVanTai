package CA2_Observer;

public class MainCA2 {
    public static void main(String[] args) {
       Button myButton = new Button();
       Activity activity = new Activity(myButton);

        myButton.click();
        myButton.click();
        myButton.click();
        myButton.click();
    }
}

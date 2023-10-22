package CA2_Observer;

public class Activity implements Button.OnClickListener {
    Button myButton;
    int clickCount = 0;

    public Activity(Button myButton) {
        this.myButton = myButton;
        myButton.attach(this);
    }

    @Override
    public void onClick() {
        System.out.println("Bạn đã nhấn " + (++clickCount) + " lần");
    }
}

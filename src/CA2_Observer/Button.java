package CA2_Observer;

public class Button {
    OnClickListener activity;

    public void attach(OnClickListener activity) {
        this.activity = activity;
    }

    public void detach() {
        this.activity = null;
    }

    public void click() {
        if (activity != null)
            activity.onClick();
    }

    public static interface OnClickListener {
        void onClick();
    }
}

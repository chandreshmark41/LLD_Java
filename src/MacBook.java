public class MacBook {

//    private final WiredKeyboard keyboard;
//    private final WiredMouse mouse;
//
//    public MacBook(){
//        keyboard = WiredKeyboard();
//        mouse = WiredMouse();
//    }

    // use interface instead of concrete classes.

    private final Keyboard keyboard;
    private final Mouse mouse;

    public MacBook(Keyboard keyboard, Mouse mouse) {
        this.keyboard = keyboard;
        this.mouse = mouse;
    }
}

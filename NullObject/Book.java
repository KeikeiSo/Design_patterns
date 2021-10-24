package NullObject;

public interface Book {
    public static Book NULL = new Book(){
        @Override
        public boolean isNull() {
            return true;
        }

    };

    boolean isNull();
}

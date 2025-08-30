package generics.atividade01;

public class PilhaGenerica<T extends Number> {

    private int top;
    private int capacity;
    private int size;
    private T[] numbers;

    public PilhaGenerica(int capacity) {
        if (capacity < 1) throw new IllegalArgumentException("Capacidade invalida!");
        this.capacity = capacity;
        this.top = 0;
        this.size = 0;
        this.numbers = (T[]) new Number[capacity];
    }

    public void push(T number) {
        if (size == capacity) {
            throw new IllegalStateException("Pilha cheia!");
        }
        this.numbers[top] = number;
        top++;
        size++;
    }

    public T pop() {
        if (size > 0) {
            T num = this.numbers[top-1];

            this.numbers[top-1] = null;
            top--;
            size--;
            return num;
        }
        return null;
    }

    public T top() {
        return size > 0 ? this.numbers[top-1] : null;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

}

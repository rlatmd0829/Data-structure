
public class Main{
    public static void main(String[] args)
    {
        TestGeneric<String, Integer> generic = new TestGeneric<String, Integer>();
    }
    public static class TestGeneric<T, K>
    {
        public T sample;
        public K sapmle2;
    }

}
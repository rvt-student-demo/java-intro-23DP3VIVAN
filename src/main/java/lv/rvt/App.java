package lv.rvt;

public class App
{

    public static void main( String[] args ) throws Exception{
        int x = 5;
        int y = x;
        int c = y;

        modify(int value);
    }

public static void modify(Person person){
    person.setName("Moodified!");
}

public static void modify(int value){
    value += 5;
}
}
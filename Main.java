class Override {
    public int sum() {
        return 2;
    }
}

class Override2 extends Override{
    public int sum(){
        return 3;
    }
}

public class Main {
    public static void main(String s[]) {
        Override override = new Override2();
        System.out.println(override.sum());
    }
}
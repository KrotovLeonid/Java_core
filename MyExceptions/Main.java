package MyExceptions;

public class Main {

    public static void main(String[] args) throws MySizeArrayException {
        String[][] strings = new String[][]{{" 100", " 100", "100", "200"},
                                            {" 100", " 100", "100", "200"},
                                            {" 100", " 100", "100", "200"},
                                            {" 100", " 100", "100", "200"}};
        String[][] stringsErr = new String[][]  {{"#00", "100", "100", "200"},
                                                {"100", "100", "100", "200"},
                                                {"100", "100", "100", "200"},
                                                {"100", "100", "100", "200"}};

        String[][] badStrings = new String[][]  {{"100", "100", "100", "200"},
                                                {"100", "100", "100", "200"},
                                                {"100", "100", "100", "200"}};


       myExceptions(strings);


    }

    static void myExceptions(String[][] strings) throws MySizeArrayException {
        if (strings.length != 4 || strings[0].length != 4){
            throw new MySizeArrayException("Длинна массива не соответствует");
        }else {
            int i=0;
            for(int x = 0 ; x < 4; x++)
                for (int y = 0; y < 4; y++) {
                    try {
                        i += Integer.parseInt(strings[x][y]);
                    } catch (NumberFormatException e){
                        System.out.println("формат данных в strings[" + x + "][" + y + "] неверный!");
                    }
                }
            System.out.println(i);
        }
    }
}

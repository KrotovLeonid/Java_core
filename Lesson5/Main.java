package Lesson5;

public class Main extends Thread{
    static final int size = 10000000;
    static final int h = size / 2;
    static float[] arr = new float[size];
    static float[] a1= new float[h];
    static float[] a2 = new float[h];

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(new Runnable(){ // создание потоков для маллых массивов
            @Override
            public void run() {
                forTwoArr(a1);
            }
        });

        Thread t2 = new Thread(new Runnable(){
            @Override
            public void run() {
                forTwoArr(a2);
            }
        });
        for (float f : arr) f = 1f; // по условию, всем значениям присваеваем еденицу
        forOneArr(arr);// просчет через один массив с выводом скорости обработки
        long a = System.currentTimeMillis();// засекаем время для расчета с разбикой
        cutArray();// разрезаем массив
        t1.start();// считаем в потоках два массива
        t2.start();
        try {
            t1.join();
            t2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        addArray();// склеиваем массив
        System.out.println("Общее время обработки через 2 массива: " + (System.currentTimeMillis() - a));// выводим результат времени расчета для двух массивов
    }

    static void forOneArr(float arr[]) {// метод для большого массива
        long a = System.currentTimeMillis();
        for (int f = 0; f < arr.length; f++) {
            arr[f] = (float) (arr[f] * Math.sin(0.2f + f / 5) * Math.cos(0.2f + f / 5) * Math.cos(0.4f + f / 2));
        }
        System.out.println("Время обработки через один массив: " + (System.currentTimeMillis() - a));
    }
    static void forTwoArr(float arr[]) { // метод для малых массивов без присвоения 1 и вывода времени
        for (int f = 0; f < arr.length; f++) {
            arr[f] = (float) (arr[f] * Math.sin(0.2f + f / 5) * Math.cos(0.2f + f / 5) * Math.cos(0.4f + f / 2));
        }
    }
    static void cutArray() {// метод разбивки масива
        for (float f : arr) f = 1f;
        long a = System.currentTimeMillis();
        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);
        System.out.println("Время разбивки массива на 2: " + (System.currentTimeMillis() - a));
        }

    static void addArray() {// метод сборки массива
        for (float f : arr) f = 1f;
        long a = System.currentTimeMillis();
        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);
        System.out.println("Время сборки массива: " + (System.currentTimeMillis() - a));
    }
}
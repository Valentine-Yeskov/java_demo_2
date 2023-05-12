// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//Створити строку двома способами
        String string = new String("Hello i missed the first lesson");
        String string1 = "and i'm sorry about that.";
        System.out.println("Створити строку двома способами");
        System.out.println(string + " " + string1);


        //Створити по 1 екземпляру кожного примітивного типу
        boolean t = true;
        boolean f = false;
        byte b = 12;
        char c = 'A';
        short s = 32;
        int n = 214;
        long l = 12;
        float o = 8.3F;
        double d = 8.5;
        System.out.println("Створити по 1 екземпляру кожного примітивного типу");
        System.out.println(t + " " + f + " " + b + " " + c + " " + s + " " + n + " " + l + " " + o + " " + d);


//Написати по 2 арифметичні операції з кожною змінною та вивести результат
        System.out.println("Написати по 2 арифметичні операції з кожною змінною та вивести результат");
        int a1 = 10;
        int a2 = 4;
        boolean b1 = a2 == b;         // false
        boolean b2 = a1 == 10;        // true
        System.out.println(b1+" "+b2);

        boolean b3 = a2 != b;         // true
        boolean b4 = a1 != 10;        // false
        System.out.println(b3+" "+b4);

        byte bb1 = 5;
        byte bb2 = 2;
        byte bb3 = (byte) (bb1-bb2);
        byte bb4 = (byte) (bb1+bb2);
        System.out.println(bb3+" "+bb4);

        short s1 = 33;
        short s2 = 3;
        short ss1 = (short) (s1*s2);
        short ss2 = (short) (s1/s2);
        System.out.println(ss1+" "+ss2);

        int i1 =10;
        int i2 =2;
        int ii1 = i1/i2;
        int ii2 = i2+i1;
        System.out.println(ii1+" "+ii2);

        long l1 = 12;
        long l2 = 2;
        long ll1 =(long) (l1-l2);
        long ll2 =(long) (l1*l2);
        System.out.println(ll1+" "+ll2);

        float o1 = 8.3F;
        float o2 = 4.1F;
        float oo1 = (float) (o1/o2);
        float oo2 = (float) (o1-o2);
        System.out.println(oo1+" "+oo2);

        double d1 = 8.5;
        double d2 = 5.8;
        double dd1 = d1+d2;
        double dd2 = d1*d2;
        System.out.println(dd1+" "+dd2);


//Написати по 2 реляцонні та логічні операції кожного типу та вивести результат,
        System.out.println("Написати по 2 реляцонні та логічні операції кожного типу та вивести результат");
        boolean a = true;
        System.out.println(!a);
        System.out.println(!false);
        System.out.println(!(2 < 5));


// написати 2 тернарні операції та вивести результат
        System.out.println("написати 2 тернарні операції та вивести результат");
        int myInt = 18;
        if (myInt <=15){
            System.out.println("No");
        }else if(myInt>=20){
            System.out.println("Yes");
        }else{
            System.out.println("maybe");
        }
//Створити змінну 1 та використовуючи інкремент та декремент вивести:
        System.out.println("Створити змінну 1 та використовуючи інкремент та декремент вивести");
        int number = 1;
        int number0 = number++;
        int number1 = number0--;
        int number2 = number--;
        System.out.println(number);
        System.out.println(number);
        System.out.println(number);
        System.out.println(number0);
        System.out.println(number2);
        System.out.println(number);
        System.out.println(number);

//Створити одномірний масив на 10 елементів та заповнити його будь-якими значеннями. Вивести парні числа.
        System.out.println("Створити одномірний масив на 10 елементів та заповнити його будь-якими значеннями. Вивести парні числа");
        int [] arr = {1,2,3,3,4,5,6,7,8,9,0};

        int i;
        for (i = 0; i < arr.length; i++)
        {
            if ((arr[i] % 2) == 0)
            {
                System.out.println(arr[i]);
            }
        }


    }
}
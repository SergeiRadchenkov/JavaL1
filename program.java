import java.util.Scanner;
import java.io.*;
public class program {
    static void sayHi() {
        System.out.println("Hi!");
    }
    static int sum(int a, int b) {
        return a + b;
    }
    static double factor(int n) {
        if(n == 1) return 1;
        return n * factor(n-1);
    }
    static public void main(String[] args) throws Exception {   // throws Exception - для чтения файлов
        System.out.println("Hello world!");

        String s = "'  123   .'";
        System.out.println(s);

        short age = 10;
        int salary = 123456;
        System.out.println(age);
        System.out.println(salary);

        float e = 2.7f;
        double pi = 3.1415;
        System.out.println(e);
        System.out.println(pi);

        char ch = '1';
        System.out.println(Character.isDigit(ch));
        ch = 'a';
        System.out.println(Character.isDigit(ch));

        boolean flag1 = 123 <= 234;
        System.out.println(flag1);
        boolean flag2 = 123 >=234 || flag1;
        System.out.println(flag2);
        boolean flag3 = flag1 ^ flag2;
        System.out.println(flag3);

        String msg ="Hello world!";
        System.out.println(msg);

        var a= 123;
        System.out.println(a);
        var d = 123.456;
        System.out.println(d);
        System.out.println(getType(a));
        System.out.println(getType(d));
        d = 1022;
        System.out.println(d);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        
        String st = "qwer";
        st.charAt(1);

        int ab = 123;
        System.out.println(++ab);

        int ac = 18;
        // 10010
        System.out.println(ac >> 1);
        // 1001

        int ad = 4;
        int ba = 2;
        System.out.println(ad | ba);
        // 101
        // 010
        // 111 
        System.out.println(ad & ba);
        // 101
        // 010
        // 000 
        System.out.println(ad ^ ba);
        // 101
        // 010
        // 111 

        int z = 2;
        z = --z-z--;
        System.out.println(z);

        int[] arr = new int[10];
        System.out.println(arr.length);
        
        arr = new int[] {1, 2, 3, 4, 5};
        System.out.println(arr.length);

        int[] arr2[] = new int[3] [5];
        for (int[] line : arr2) {
            for (int item : line) {
                System.out.printf("%d ", item);
            }
            System.out.println();
        }

        int[][] arr3 = new int[3][5];
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.printf("%d ", arr3[i][j]);
            }
            System.out.println();
        }

        int i = 123; double da = i;
        System.out.println(i);
        System.out.println(da);

        d = 3.1415; i = (int)d;
        System.out.println(d);
        System.out.println(i);

        d = 3.9415; i = (int)d;
        System.out.println(d);
        System.out.println(i);

        byte b = Byte.parseByte("123");
        System.out.println(b);
        // b = Byte.parseByte("1234");        
        // System.out.println(b);

        /* Scanner iScanner = new Scanner(System.in);
        System.out.printf("name: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s", name);
        iScanner.close(); */

        /* Scanner iScanner2 = new Scanner(System.in);        
        System.out.printf("int a: ");        
        int x = iScanner2.nextInt();
        System.out.printf("double a: ");
        double y = iScanner2.nextDouble();
        System.out.printf("%d + %f = %f", x, y, x + y);
        iScanner2.close(); */

        /* Scanner iScanner3 = new Scanner(System.in);
        System.out.printf("int a: ");        
        boolean flag = iScanner3.hasNextInt();
        System.out.println(flag);
        int ia = iScanner3.nextInt(i);
        System.out.println(ia);
        iScanner3.close(); */

        int ae = 1, bb = 2;
        int c = ae + bb;
        String res = ae + " + " + bb + " = " + c;
        System.out.println(res);

        int af = 1, bc = 2;
        int ca = af + bc;
        String res2 = String.format("%d + %d = %d", af, bc, ca);
        System.out.printf("%d + %d = %d\n", af, bc, ca);
        System.out.println(res2);

        float pi2 = 3.1415f;
        System.out.printf("%f\n", pi2);
        System.out.printf("%.2f\n", pi2);
        System.out.printf("%.3f\n", pi2);
        System.out.printf("%e\n", pi2);        
        System.out.printf("%.2e\n", pi2);
        System.out.printf("%.3e\n", pi2);

        sayHi();
        System.out.println(sum(1, 3));
        System.out.println(factor(5));

        int ag = 1;
        int bd = 2;
        int cb;
        if (ag > bd) {
            cb = ag;
        } else {
            cb = bd;
        }
        System.out.println(cb);

        int ah = 1;
        int be = 2;
        int cc = 0;
        if (ah > be) cc = ah;
        if (ah < be) cc = be;
        System.out.println(cc);

        int ai = 1;
        int bf = 2;
        int min = ai < bf ? ai : bf;
        System.out.println(min);

        int mounth = 123;
        switch (mounth) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("a");
                break;
            case 5: System.out.println("b");
            default:
                break;
        }

        int value = 321;
        int count = 0;
        while (value != 0) {
            value /= 10;
            count++;
        }
        System.out.println(count);

        int value2 = 321;
        int count2 = 0;
        do {
            value2 /= 10;
            count2++;
        } while (value2 != 0);
        System.out.println(count2);

        for (int ia = 0; ia < 10; ia++) {
            if (ia % 2 == 0)
                continue;
            System.out.println(ia);
        }

        int sa = 0;
        for (int ib = 1; ib <= 10; ib++) {
            sa += ib;
        }
        System.out.println(sa);

        for (int ic = 0; ic < 5; ic++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        int arr4[] = new int[] {1, 2, 3, 4, 5, 77};
            for (int item : arr4) {
                System.out.printf("%d ", item);
        }
        System.out.println();

        try (FileWriter fw = new FileWriter("file.txt", false)) {
            fw.write("line 1");
            fw.append('\n');
            fw.append('2');            
            fw.append('\n');            
            fw.write("line 3");
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            }

        FileReader fr = new FileReader("file.txt");
        int ci;
        while ((ci = fr.read()) != -1) {
            char ch2 = (char)ci;
            if (ch2 == '\n') {
                System.out.println(ch2);
            } else {
                System.out.println(ch2);
            }
        }

        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        String str;
        while ((str = br.readLine()) != null) {
            System.out.printf("== %s ==\n", str);
        }
        br.close();
    }
    static String getType(Object o) {
        return o.getClass().getSimpleName();
    }
}

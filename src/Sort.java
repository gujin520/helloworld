import java.util.Arrays;

/**
 * @author yangguanbao
 * @date 17/03/2017
 */
public class Sort {
    public static void main(String[] args) {
        int[] a = {1, 5, 3};
        new Sort().method1(a);
        Arrays.stream(a).forEach(i -> System.out.println(i));
    }

    public void method2(int[] a, int position, int length) {
        int temp;
        int c;
        for (temp = a[position]; 2 * position + 1 <= length; position = c) {
            c = 2 * position + 1;
            if (c < length && a[c] < a[c + 1]) {
                c++;
            }
            if (a[c] > temp) {
                a[position] = a[c];
            } else {
                break;
            }
        }
        a[position] = temp;
    }

    public void method1(int[] a) {
        for (int i = a.length / 2 - 1; i >= 0; i--) {
            method2(a, i, a.length - 1);
        }

        for (int i = a.length - 1; i >= 0; i--) {
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;
            method2(a, 0, i - 1);
        }
    }
}

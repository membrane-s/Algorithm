import java.util.Scanner;
//一维数组前缀和
public class qianzhuihe {
    private static final int N = 100000;

    public static void main(String[] args) {
        int m,n;
        int[] a = new int[N],s = new int[N];
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            s[i] = s[i - 1] + a[i];
        }
        while(m-- > 0){
            //求区间和
            int l = scanner.nextInt(),r = scanner.nextInt();
            System.out.println(s[r] - s[l - 1]);
        }
    }

}

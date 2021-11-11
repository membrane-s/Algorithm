import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class qianhuihe_2 {
    //二维数组前缀和
    private final static int N = 100000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(),m = scanner.nextInt(),q = scanner.nextInt();
        int[][] a = new int[N][N],s = new int[N][N];
        for(int i = 1;i<=n;i++){
            for(int j=1;j <= m;j++){
                s[i][j] = s[i - 1][j] + s[i][j - 1] - s[i - 1][j - 1] + a[i][j];
            }
        }
        while(q-- > 0){
            int x1 = scanner.nextInt(),y1 = scanner.nextInt(),x2 = scanner.nextInt(),y2 = scanner.nextInt();
            System.out.println(s[x2][y2] - s[x1 - 1][y2] - s[x2][y1 - 1] + s[x1 - 1][y1 - 1]);
        }
    }
}

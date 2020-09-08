public class CheckerBoard2 { 

    public static void main(String[] args) { 
        double N = 3;
        StdDraw.setXscale(0, N);
        StdDraw.setYscale(0, N);

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if ((i + j) % 2 != 0) StdDraw.setPenColor(StdDraw.BLACK);
                else                  StdDraw.setPenColor(StdDraw.RED);
                StdDraw.line(i, j, N, N);
            }
        }
        StdDraw.show();
    }

}

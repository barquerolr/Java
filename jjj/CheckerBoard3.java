public class CheckerBoard3 { 

    public static void main(String[] args) { 
        double N = 4;
        StdDraw.setXscale(0, N);
        StdDraw.setYscale(0, N);

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if ((i + j) % 2 != 0) StdDraw.setPenColor(StdDraw.BLACK);
                else                  StdDraw.setPenColor(StdDraw.RED);
                StdDraw.circle((i+.5), (j+.5), .5);
            }
        }
        StdDraw.show();
    }

}


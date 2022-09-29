import java.util.Random;

public class Matrix {

    private final int mxColumn, mxLine;
    private final int[][] mxArr;

    public Matrix(int mxColumn, int mxLine) {
        Random random = new Random();
        mxArr = new int[mxColumn][mxLine];

        for (int i = 0; i < mxArr.length; i++) {
            for (int j = 0; j < mxArr[i].length; j++) {
                set(i, j, random.nextInt(10));
            }
        }

        this.mxColumn = mxColumn;
        this.mxLine = mxLine;
    }

    public int get(int mxColumn, int mxLine) {
        return mxArr[mxColumn][mxLine];
    }
    public void set(int mxColumn, int mxLine, int mxSet) {
        mxArr[mxColumn][mxLine] = mxSet;
    }

    void output() {
        for (int i = 0; i < mxArr.length; i++) {
            for (int j = 0; j < mxArr[i].length; j++) {
                System.out.print(get(i, j) + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    Matrix plusMatrix(Matrix mx) {
        Matrix mxPlus = new Matrix(mxColumn, mxLine);

        for (int i = 0; i < mxArr.length; i++) {
            for (int j = 0; j < mxArr[i].length; j++) {
                mxPlus.set(i, j, get(i, j) + mx.get(i, j));
            }
        }

        return mxPlus;
    }

    Matrix multiNumber(int num) {
        Matrix mx = new Matrix(mxColumn, mxLine);

        for (int i = 0; i < mx.mxColumn; i++) {
            for (int j = 0; j < mx.mxLine; j++) {
                mx.set(i, j, get(i, j) * num);
            }
        }

        return mx;
    }

    Matrix multiMatrix(Matrix s) {
        Matrix mx = new Matrix(mxColumn, mxLine);
        int calc = 0;

        for (int i = 0; i < mx.mxColumn; i++) {
            for (int j = 0; j < mx.mxLine; j++) {
                if (mx.mxColumn < mx.mxLine) {
                    for (int k = 0; k < mx.mxColumn; k++) {
                        calc = calc + (get(i, k) * get(k,j));
                    }
                }
                else {
                    for (int k = 0; k < mx.mxLine; k++) {
                        calc = calc + (get(i, k) * s.get(k,j));
                    }
                }

                mx.set(i,j,calc);
                calc = 0;
            }
        }

        return mx;
    }
}
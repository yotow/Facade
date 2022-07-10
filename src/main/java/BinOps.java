public class BinOps {
    public String sum(String a, String b) {
    /*Переведите числа из двоичной записи в
      строках в int, сложите и переведите
      обратно в двоичную запись*/
        String res;
        try {
            int _a = Integer.parseInt(a, 2);
            int _b = Integer.parseInt(b, 2);
            res = Integer.toBinaryString(_a + _b);
        } catch (NumberFormatException e) {
            res = "a и b должны быть двоичными числами";
        }
        return res;
    }

    public String mult(String a, String b) {
    /*Переведите числа из двоичной записи в
      строках в int, перемножьте и переведите
      обратно в двоичную запись*/
        String res;
        try {
            int _a = Integer.parseInt(a, 2);
            int _b = Integer.parseInt(b, 2);
            res = Integer.toBinaryString(_a * _b);
        } catch (NumberFormatException e) {
            res = "a и b должны быть двоичными числами";
        }
        return res;
    }
}

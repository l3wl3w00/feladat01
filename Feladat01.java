public class Feladat01 {
    public int feladat01(String[] szinek){
        int result = 1;
        for (int i = 0; i< szinek.length;i++){
            result *= 2;
        }
        return result-1-szinek.length;
    }
}

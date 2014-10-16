package util;

public final class CommonUtil {

    private CommonUtil(){}

    public static int add(Integer... operands) {
        int total = 0;
        for (Integer operand : operands) {
            total += operand;
        }
        return total;
    }

}

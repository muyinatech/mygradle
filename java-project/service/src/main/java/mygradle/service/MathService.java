package mygradle.service;

import util.CommonUtil;

public class MathService {

    public int add(Integer... operands) {
        return CommonUtil.add(operands);
    }
}

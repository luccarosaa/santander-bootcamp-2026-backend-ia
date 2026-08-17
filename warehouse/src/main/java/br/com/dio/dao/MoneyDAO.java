package br.com.dio.dao;

import java.math.BigDecimal;

public class MoneyDAO {

    private static BigDecimal money = BigDecimal.ZERO;

    public BigDecimal add(final BigDecimal money){
        this.money = this.money.add(money);
        return this.money;
    }

    public static BigDecimal getMoney() {
        return money;
    }
}

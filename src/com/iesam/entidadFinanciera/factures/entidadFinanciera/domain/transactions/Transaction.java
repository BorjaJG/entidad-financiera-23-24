package com.iesam.entidadFinanciera.factures.entidadFinanciera.domain.transactions;

public class Transaction {

    public  final  float movimiento;
    public  final  String idTransaction;


    public Transaction(float movimiento, String idTransaction) {
        this.movimiento = movimiento;
        this.idTransaction = idTransaction;
    }

    public float getMovimiento() {
        return movimiento;
    }

    public String getIdTransaction() {
        return idTransaction;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "movimiento=" + movimiento +
                ", idTransaction='" + idTransaction + '\'' +
                '}';
    }
}

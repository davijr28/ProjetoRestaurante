package model;

import javax.swing.JOptionPane;

public class Restaurante extends Empresa {

    private String tipoComida;
    private double precoMedio;

    public Restaurante() {
        this("", "", "", "", "", "", "", 0);
    }

    public Restaurante(String nome, String endereco, String cidade, String estado, String cep, String fone, String comida, double preco) {
        super(nome, endereco, cidade, estado, cep, fone);
        setTipoComida(tipoComida);
        setPrecoMedio(precoMedio);
    }

    public String getTipoComida() {
        return tipoComida;
    }

    public void setTipoComida(String tipoComida) {
        this.tipoComida = tipoComida;
    }

    public double getPrecoMedio() {
        return precoMedio;
    }

    public void setPrecoMedio(double precoMedio) {
        this.precoMedio = precoMedio;
    }

    public void leitura() {
        super.leitura();
        setTipoComida(JOptionPane.showInputDialog("Digite o tipo de comida: "));
        setPrecoMedio(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço médio: ")));
    }

    public void imprimir() {
        super.imprimir();
        JOptionPane.showMessageDialog(null, "Tipo de comida: " + getTipoComida() + "\nPreço médio: " + getPrecoMedio());
    }
}

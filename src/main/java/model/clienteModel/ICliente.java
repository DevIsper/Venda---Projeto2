package model.clienteModel;

import model.produtos.Produto;

import java.util.List;

public interface ICliente {

    void addToCart(Produto p);
    void removeFromCart(Produto p);

    public Object displayCart();
    public double displayCartTotal(List<Produto> cart);

    public void buyItems();



}

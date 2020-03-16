package com.dev.pd.structural.facade;

public class Cliente {
	
	public static void main(String[] args) {
		PedidoMenuFacade pedidoMenuFacade = new PedidoMenuFacade();
		pedidoMenuFacade.servirOnlySopa();
		pedidoMenuFacade.servirOnlyFondo();
		pedidoMenuFacade.servirRefrescoYPostre();
	}

}

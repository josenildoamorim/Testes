package rtstreinamentos.main;

public class DescontoCompra {

	public int calcularDesconto(int valorDaCompra) {

		if (valorDaCompra >= 100 && valorDaCompra <= 200) {
			return 10;
		}

		if (valorDaCompra >= 201 && valorDaCompra <= 300) {
			return 20;
		}

		if (valorDaCompra >= 301 && valorDaCompra <= 400) {
			return 25;
		}

		if (valorDaCompra >= 401) {
			return 30;
		}

		return 0;
	}

}

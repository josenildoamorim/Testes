package rtstreinamentos.teste;

import org.junit.Assert;
import org.junit.Test;

import rtstreinamentos.main.DescontoCompra;

public class DescontoCompraTest {
	@Test
	public void compraCustou100ReaisDescontoEhDe10Porcento()
	{
	DescontoCompra descontoCompra = new DescontoCompra();

	int valorDaCompra=100;
	int valorDescoontoEsperado=10;
	int valorDescoontoAtual =descontoCompra.calcularDesconto(valorDaCompra);

	Assert.assertEquals(valorDescoontoEsperado, valorDescoontoAtual);
	}
	
	@Test
	public void compraCustou150ReaisDescontoEhDe10Porcento()
	{
	DescontoCompra descontoCompra = new DescontoCompra();

	int valorDaCompra=150;
	int valorDescoontoEsperado=10;
	int valorDescoontoAtual =descontoCompra.calcularDesconto(valorDaCompra);

	Assert.assertEquals(valorDescoontoEsperado, valorDescoontoAtual);
	}
	
	@Test
	public void compraCustou200ReaisDescontoEhDe10Porcento()
	{
	DescontoCompra descontoCompra = new DescontoCompra();

	int valorDaCompra=200;
	int valorDescoontoEsperado=10;
	int valorDescoontoAtual =descontoCompra.calcularDesconto(valorDaCompra);

	Assert.assertEquals(valorDescoontoEsperado, valorDescoontoAtual);
	}
	
	@Test
	public void compraCustou250ReaisDescontoEhDe20Porcento()
	{
	DescontoCompra descontoCompra = new DescontoCompra();

	int valorDaCompra=250;
	int valorDescoontoEsperado=20;
	int valorDescoontoAtual =descontoCompra.calcularDesconto(valorDaCompra);

	Assert.assertEquals(valorDescoontoEsperado, valorDescoontoAtual);
	}
	
	@Test
	public void compraCustou300ReaisDescontoEhDe20Porcento()
	{
	DescontoCompra descontoCompra = new DescontoCompra();

	int valorDaCompra=300;
	int valorDescoontoEsperado=20;
	int valorDescoontoAtual =descontoCompra.calcularDesconto(valorDaCompra);

	Assert.assertEquals(valorDescoontoEsperado, valorDescoontoAtual);
	}
	
	@Test
	public void compraCustou350ReaisDescontoEhDe25Porcento()
	{
	DescontoCompra descontoCompra = new DescontoCompra();

	int valorDaCompra=350;
	int valorDescoontoEsperado=25;
	int valorDescoontoAtual =descontoCompra.calcularDesconto(valorDaCompra);

	Assert.assertEquals(valorDescoontoEsperado, valorDescoontoAtual);
	}
	
	@Test
	public void compraCustou400ReaisDescontoEhDe25Porcento()
	{
	DescontoCompra descontoCompra = new DescontoCompra();

	int valorDaCompra=400;
	int valorDescoontoEsperado=25;
	int valorDescoontoAtual =descontoCompra.calcularDesconto(valorDaCompra);

	Assert.assertEquals(valorDescoontoEsperado, valorDescoontoAtual);
	}
	
	@Test
	public void compraCustou450ReaisDescontoEhDe30Porcento()
	{
	DescontoCompra descontoCompra = new DescontoCompra();

	int valorDaCompra=450;
	int valorDescoontoEsperado=30;
	int valorDescoontoAtual =descontoCompra.calcularDesconto(valorDaCompra);

	Assert.assertEquals(valorDescoontoEsperado, valorDescoontoAtual);
	}

}

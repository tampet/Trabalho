import java.util.Scanner;

/*1 Instru��es
a) As equipes podem ter no m�ximo 05 alunos.
b) O relat�rio final e os slides dever�o apresentar a nome e matr�cula de todos os 
membros da equipe.
c) Projetos de diferentes equipes que forem muito semelhantes ter�o suas notas zeradas.

2 Projeto
O objetivo do projeto � a constru��o de um software para controlar uma pequena 
empresa que fabrica tampa pl�stica para garrafas pet. A empresa produz quatro cores 
diferentes de tampas (branca, vermelha, verde e amarela) utilizando duas mat�rias-primas
(pl�stico e tinta). A empresa � composta por 5 setores com diferentes responsabilidades
que se comunicam entre si para realizar a compra de mat�ria-prima, pagamento de 
fornecedores, venda de produtos, recebimento dos clientes e produ��o.

3 Requisitos do Software

3.1 Setor de Compra
a) Enviar pedido de compra de mat�ria-prima para fornecedor
b) Receber entrega de mat�ria-prima do fornecedor
c) Atualizar o estoque de mat�ria-prima
d) Enviar pedido de pagamento ao fornecedor

3.2 Setor Financeiro
a) Manter o saldo banc�rio da empresa positivo
b) Autorizar compra de mat�ria-prima
c) Realizar pagamentos aos fornecedores
d) Receber pagamentos dos clientes

3.3 Setor de Estoque
a) Manter o estoque de mat�ria-prima atualizado
b) Manter o estoque de produtos atualizado
c) Solicitar a compra de novas mat�rias-primas
d) Solicitar a produ��o de novos produtos

3.4 Setor de Produ��o
a) Requisitar mat�ria-prima para produ��o de novos produtos
b) Transformar as mat�rias-primas em produtos
c) Atualizar o estoque de produtos

3.5 Setor de Venda
a) Receber pedidos de compra de produtos do cliente
b) Enviar produtos aos clientes
c) Enviar pedido de cobran�a do cliente*/


public class Main {

	public int qtdePlastico;
	public int qtdeTintaBranca;
	public int qtdeTintaVermelha;
	public int qtdeTintaVerde;
	public int qtdeTintaAmarela;
	public int produtos;
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		// DECLARA��O DE VARI�VEIS DOS MENUS
		int opcao;
		int subOpcaoEstoque;
		int subOpcaoVenda;
		int subOpcaoCompra;
		int subOpcaoFinanceiro;
		int subopcaoProducao;
		
		
		// LA�O DO-WHILE PARA MANTER O MENU
		do
		{
		Cabecalho();
		opcao = entrada.nextInt();
		
		
		switch (opcao) {
		case 1:// ESTOQUE
			
			do
			{
								
				CabecalhoEstoque();
				MenuEstoque();
				subOpcaoEstoque = entrada.nextInt();
				
				Estoque novoProduto = new Estoque();
				
				
				
				
				
				switch (subOpcaoEstoque) {
				case 1:
					
					break;
					
				case 2:
					
					break;
					
				case 3:
					
					break;
					
				case 4:
					
					break;

				default:
					if(subOpcaoEstoque !=5)
					{
						System.out.println("Digite uma op��o v�lida!!!");
					}
					
					break;
				}
			}while(subOpcaoEstoque != 5);
									
			break;
			
		case 2:// VENDAS
			
			
			do
			{
				CabecalhoVendas();
				MenuVenda();
				
				subOpcaoVenda = entrada.nextInt();
				
				switch (subOpcaoVenda) {
				case 1:
					
					break;
					
				case 2:
					
					break;
					
				case 3:
					
					break;
					
				default:
					if(subOpcaoVenda !=4)
					{
						System.out.println("Digite uma op��o v�lida!!!");
					}
					
					break;
				}
			}while(subOpcaoVenda != 4);
			
			
			
			break;
			
		case 3://COMPRAS
			
			CabecalhoCompras();
			MenuCompra();
			
			subOpcaoCompra = entrada.nextInt();
			
			do
			{
				switch (subOpcaoCompra) {
				case 1:
					//tetetetete
					//fdhgsdhs
					//hsdgafjasgksfdg
					break;
				case 2:
					
					break;
					
				case 3:
					
					break;
					
				
				default:
					if(subOpcaoCompra !=4)
					{
						System.out.println("Digite uma op��o v�lida!!!");
					}
					
					break;
				}
			}while(subOpcaoCompra != 4);
		
			
		
			break;
			
		case 4:// FINANCEIRO
			
			
			CabecalhoFinanceiro();
			MenuFinanceiro();
			subOpcaoFinanceiro = entrada.nextInt();
			
			do
			{
				switch (subOpcaoFinanceiro) {
				case 1:
					
					break;
				case 2:
					
					break;
					
				case 3:
					
					break;
					
				
				default:
					if(subOpcaoFinanceiro !=4)
					{
						System.out.println("Digite uma op��o v�lida!!!");
					}
					
					break;
				}
			}while(subOpcaoFinanceiro != 4);
		
			break;
			
		case 5:// PRODU��O
			
			CabecalhoProducao();
			
			
			
			
			break;
			
		default:// SAIR DO PROGRAMA
			if(opcao !=6)
			{
				System.out.println("Digite uma op��o v�lida!!!");
			}
			else
			{
				System.out.println("OBRIGADO POR UTILIZAR O SISTEMA");
			}
			break;	
		}
		
		
		
		}while(opcao != 6);//FIM DO LA�O DO-WHILE
	}

	
	public static void Cabecalho()
	{
		System.out.println("\n==============TAMPET LTDA==============");
		System.out.println("ESCOLHA UMA OP��O: ");
		System.out.println("1 - ESTOQUE");
		System.out.println("2 - VENDAS");
		System.out.println("3 - COMPRAS");
		System.out.println("4 - FINANCEIRO");
		System.out.println("5 - PRODU��O");
		System.out.println("6 - SAIR");
	}
	public static void CabecalhoEstoque()
	{
		System.out.println("\n==============TAMPET LTDA==============");
		System.out.println("================ESTOQUE================\n");
	}
	public static void CabecalhoVendas()
	{
		System.out.println("\n==============TAMPET LTDA==============");
		System.out.println("================VENDAS=================\n");
	}
	public static void CabecalhoCompras()
	{
		System.out.println("\n==============TAMPET LTDA==============");
		System.out.println("================COMPRAS================\n");
	}
	public static void CabecalhoFinanceiro()
	{
		System.out.println("\n==============TAMPET LTDA==============");
		System.out.println("==============FINANCEIRO===============\n");
	}
	public static void CabecalhoProducao()
	{
		System.out.println("\n==============TAMPET LTDA==============");
		System.out.println("===============PRODU��O================\n");
	}
	public static void MenuEstoque()
	{
		System.out.println("1- SOLICITAR PRODUCAO");
		System.out.println("2- SOLICITAR COMPRA MATERIA PRIMA");
		System.out.println("3- ESTOQUE DE PRODUTOS");
		System.out.println("4- ESTOQUE DE MAT�RIA PRIMA");
		System.out.println("5- VOLTAR AO MENU PRINCIPAL");
		
	}
	public static void MenuVenda()
	{
		System.out.println("1- INSERIR PEDIDO");
		System.out.println("2- ENVIAR BOLETO");
		System.out.println("3- REMESSA DE PRODUTO");
		System.out.println("4- VOLTAR AO MENU PRINCIPAL");
		
	}
	public static void MenuCompra()
	{
		System.out.println("1- SOLICITAR OR�AMENTO");
		System.out.println("2- SOLICITAR PAGAMENTO");
		System.out.println("3- RECEBER MATERIA PRIMA");
		System.out.println("4- VOLTAR AO MENU PRINCIPAL");
	}
	public static void MenuFinanceiro()
	{
		System.out.println("1- VER SALDO BANC�RIO");
		System.out.println("2- AUTORIZAR COMPRAS");
		System.out.println("3- FAZER PAGAMENTOS ");
		System.out.println("4- VOLTAR AO MENU PRINCIPAL");
	}

}

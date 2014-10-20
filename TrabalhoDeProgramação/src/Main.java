import java.util.Scanner;

/*1 Instruções
a) As equipes podem ter no máximo 05 alunos.
b) O relatório final e os slides deverão apresentar a nome e matrícula de todos os 
membros da equipe.
c) Projetos de diferentes equipes que forem muito semelhantes terão suas notas zeradas.

2 Projeto
O objetivo do projeto é a construção de um software para controlar uma pequena 
empresa que fabrica tampa plástica para garrafas pet. A empresa produz quatro cores 
diferentes de tampas (branca, vermelha, verde e amarela) utilizando duas matérias-primas
(plástico e tinta). A empresa é composta por 5 setores com diferentes responsabilidades
que se comunicam entre si para realizar a compra de matéria-prima, pagamento de 
fornecedores, venda de produtos, recebimento dos clientes e produção.

3 Requisitos do Software

3.1 Setor de Compra
a) Enviar pedido de compra de matéria-prima para fornecedor
b) Receber entrega de matéria-prima do fornecedor
c) Atualizar o estoque de matéria-prima
d) Enviar pedido de pagamento ao fornecedor

3.2 Setor Financeiro
a) Manter o saldo bancário da empresa positivo
b) Autorizar compra de matéria-prima
c) Realizar pagamentos aos fornecedores
d) Receber pagamentos dos clientes

3.3 Setor de Estoque
a) Manter o estoque de matéria-prima atualizado
b) Manter o estoque de produtos atualizado
c) Solicitar a compra de novas matérias-primas
d) Solicitar a produção de novos produtos

3.4 Setor de Produção
a) Requisitar matéria-prima para produção de novos produtos
b) Transformar as matérias-primas em produtos
c) Atualizar o estoque de produtos

3.5 Setor de Venda
a) Receber pedidos de compra de produtos do cliente
b) Enviar produtos aos clientes
c) Enviar pedido de cobrança do cliente*/


public class Main {

	public int qtdePlastico;
	public int qtdeTintaBranca;
	public int qtdeTintaVermelha;
	public int qtdeTintaVerde;
	public int qtdeTintaAmarela;
	public int produtos;
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		// DECLARAÇÃO DE VARIÁVEIS DOS MENUS
		int opcao;
		int subOpcaoEstoque;
		int subOpcaoVenda;
		int subOpcaoCompra;
		int subOpcaoFinanceiro;
		int subopcaoProducao;
		
		
		// LAÇO DO-WHILE PARA MANTER O MENU
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
						System.out.println("Digite uma opção válida!!!");
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
						System.out.println("Digite uma opção válida!!!");
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
						System.out.println("Digite uma opção válida!!!");
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
						System.out.println("Digite uma opção válida!!!");
					}
					
					break;
				}
			}while(subOpcaoFinanceiro != 4);
		
			break;
			
		case 5:// PRODUÇÃO
			
			CabecalhoProducao();
			
			
			
			
			break;
			
		default:// SAIR DO PROGRAMA
			if(opcao !=6)
			{
				System.out.println("Digite uma opção válida!!!");
			}
			else
			{
				System.out.println("OBRIGADO POR UTILIZAR O SISTEMA");
			}
			break;	
		}
		
		
		
		}while(opcao != 6);//FIM DO LAÇO DO-WHILE
	}

	
	public static void Cabecalho()
	{
		System.out.println("\n==============TAMPET LTDA==============");
		System.out.println("ESCOLHA UMA OPÇÃO: ");
		System.out.println("1 - ESTOQUE");
		System.out.println("2 - VENDAS");
		System.out.println("3 - COMPRAS");
		System.out.println("4 - FINANCEIRO");
		System.out.println("5 - PRODUÇÂO");
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
		System.out.println("===============PRODUÇÃO================\n");
	}
	public static void MenuEstoque()
	{
		System.out.println("1- SOLICITAR PRODUCAO");
		System.out.println("2- SOLICITAR COMPRA MATERIA PRIMA");
		System.out.println("3- ESTOQUE DE PRODUTOS");
		System.out.println("4- ESTOQUE DE MATÉRIA PRIMA");
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
		System.out.println("1- SOLICITAR ORÇAMENTO");
		System.out.println("2- SOLICITAR PAGAMENTO");
		System.out.println("3- RECEBER MATERIA PRIMA");
		System.out.println("4- VOLTAR AO MENU PRINCIPAL");
	}
	public static void MenuFinanceiro()
	{
		System.out.println("1- VER SALDO BANCÁRIO");
		System.out.println("2- AUTORIZAR COMPRAS");
		System.out.println("3- FAZER PAGAMENTOS ");
		System.out.println("4- VOLTAR AO MENU PRINCIPAL");
	}

}

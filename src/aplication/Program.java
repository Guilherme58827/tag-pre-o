package aplication;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.Produto;
import entities.ProdutoImportado;
import entities.ProdutoUsado;






public class Program {

	public static void main(String[] args) throws ParseException {
	
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat form =new SimpleDateFormat("dd/MM/yyyy");
		List<Produto> list= new ArrayList<>();
		System.out.print("numero de produtos: ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("dado do produto "+ (i+1));
			System.out.print("comum,importado ou usado?(c/i/u) ");
			String resp =sc.next();
			
			while (!resp.equals("c") && !resp.equals("i") && !resp.equals("u") ) {
				System.out.print("INVALIDO!!!!!! digite novamente:  ");
				
				resp =sc.next();
			}
				if (resp.equals("c")) {
				
				System.out.print("nome: ");
				sc.nextLine();
				String nome =sc.nextLine();
				System.out.print("preço: ");
				double preço = sc.nextDouble();
				
				Produto p = new Produto(nome, preço);
				list.add(p);
				}
			else if(resp.equals("i")) {
				
				System.out.print("nome: ");
				sc.nextLine();
				String nome =sc.nextLine();
				System.out.print("preço: ");
				double preço = sc.nextDouble();
				System.out.print("taxa: ");
				double taxaAlfandega=sc.nextDouble();
				Produto p = new ProdutoImportado(nome, preço, taxaAlfandega);
				list.add(p);
				
			}
			else {
				System.out.print("nome: ");
				sc.nextLine();
				String nome =sc.nextLine();
				System.out.print("preço: ");
				double preço = sc.nextDouble();
				System.out.print("data: ");
				Date dataCriação=form.parse(sc.next());
				Produto p = new ProdutoUsado(nome, preço, dataCriação);
				list.add(p);
				
			}
			
				
			}
		System.out.println("tags de preço: ");
		for(Produto pro:list) {
			System.out.println(pro.tagPreço());
					
			
			
		}
		
		
		
		
		sc.close();
	}

}

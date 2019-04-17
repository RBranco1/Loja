
import java.util.Scanner;

public class Principal {
            
    public static void main (String [] args) {
        
        Carro carro = new Carro();
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Nome: ");
        carro.nome = scan.next();
        
        System.out.print("Marca: ");
        carro.marca = scan.next();
        
        System.out.print("Cor: ");
        carro.cor = scan.next();
        
        System.out.print("Fabricação: ");
        carro.fabricação = scan.next();
        
        System.out.print("Largura: ");
        carro.largura = scan.next();
        
        System.out.print("Peso: ");
        carro.peso = scan.next();
        
        System.out.println("Nome:" + carro.nome);
        System.out.println("Marca:" + carro.marca);
        System.out.println("Cor:" + carro.cor);
        System.out.println("Fabricação:" + carro.fabricação);
        System.out.println("Largura:" + carro.largura);
        System.out.println("Peso:" + carro.peso);
        
        
        Carro carro2 = new Carro();
        
                System.out.print("Nome: ");
        carro2.nome = scan.next();
        
        System.out.print("Marca: ");
        carro2.marca = scan.next();
        
        System.out.print("Cor: ");
        carro2.cor = scan.next();
        
        System.out.print("Fabricação: ");
        carro2.fabricação = scan.next();
        
        System.out.print("Largura: ");
        carro2.largura = scan.next();
        
        System.out.print("Peso: ");
        carro2.peso = scan.next();

        System.out.println("Nome:" + carro2.nome);
        System.out.println("Marca:" + carro2.marca);
        System.out.println("Cor:" + carro2.cor);
        System.out.println("Fabricação:" + carro2.fabricação);
        System.out.println("Largura:" + carro2.largura);
        System.out.println("Peso:" + carro2.peso);
        
        
        
    }
            
            
}

import java.util.Scanner;


public class DatacaoCarbono{

    public static void main(String[] args){

          Scanner scanner = new Scanner(System.in);
          System.out.println("Digite a descrição do artefato");
          String descricao = scanner.nextLine();

          System.out.println("Digite o tipo do artefato. 1 , 2 ou 3");
          int tipo = scanner.nextInt();
           
          System.out.println("Digite o percentual de carbono-14 remanescente");
          double percentual = scanner.nextDouble();

          String periodo = "";
          String tipoArtefato = "";
          String pesquisador = "";

          switch(tipo){
            case 1:
                tipoArtefato = "Arma ou tecnologia similar de metal";
                break;

              case 2:
                tipoArtefato = "Ferramentas ou utensílios domésticos";
                break;
              case 3:
                tipoArtefato = "Artefato desconhecido";
                break;
          }


          if(percentual == 100){
              periodo = "Idade Moderna";
          }
          else if(percentual >= 50 ){
              periodo = "Idade Média";
          }
          else if(percentual >= 25){
            periodo = "Idade do Bronze";
          }
          else if(percentual >= 10){
              periodo = "Idade do Ferro";
          }
          else{
              periodo = "Pré-História";
          }

          switch(tipo){
            case 1:
              if(periodo == "Idade Moderna"){
                pesquisador = "Doutora Kassandra";
              }
              else if(periodo == "Idade Média"){
                pesquisador = "Doutor Kenway";
              }
              else if(periodo == "Idade do Bronze"){
                pesquisador = "Doutor Alexios";
              }
              else if(periodo == "Idade do Ferro"){
                pesquisador = "Doutor Alexios";
              }
              else{
                pesquisador = "Doutor Arno";
              }
              break;
              case 2:
                if(periodo == "Idade Moderna"){
                pesquisador = "Doutor Edward";
              }
              else if(periodo == "Idade Média"){
                pesquisador = "Doutor Ézio";
              }
              else if(periodo == "Idade do Bronze"){
                pesquisador = "Doutor Altair";
              }
              else if(periodo == "Idade do Ferro"){
                pesquisador = "Doutor Eivor";
              }
              else{
                pesquisador = "Doutora Elise";
              }
              break;
            case 3:
              if(periodo == "Idade Moderna"){
                pesquisador = "Doutor Cesare Borgia";
              }
              else if(periodo == "Idade Média"){
                pesquisador = "Doutor Rodrigo";
              }
              else if(periodo == "Idade do Bronze"){
                pesquisador = "Doutor Cormac";
              }
              else if(periodo == "Idade do Ferro"){
                pesquisador = "Doutor Berg";
              }
              else{
                pesquisador = "Doutora Braddock";
              }
          }

          System.out.println(descricao);
          System.out.println(tipoArtefato);
          System.out.println(periodo);
          System.out.println(pesquisador);
    }
}
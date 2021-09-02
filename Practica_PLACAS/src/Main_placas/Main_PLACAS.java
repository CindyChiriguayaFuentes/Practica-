package tdd_placas;

import java.util.Scanner;

public class TDD_PLACAS {

    public static void main(String[] args) {
        Placas P = new Placas();
        Scanner in = new Scanner(System.in);
        int Op;
        try{
            System.out.print("1 = Azuay : A\n"
                        + "2 = Bolivar : B\n"
                        + "3 = Cañar : U\n"
                        + "4 = Carchi : C\n"
                        + "5 = Chimborazo : H\n"
                        + "6 = Cotopaxi : X\n"
                        + "7 ElOro : O\n"
                        + "8 Esmeraldas : E\n"
                        + "9 Galapagos : W\n"
                        + "10 Guayas : G\n"
                        + "11 Imbabura : I\n"
                        + "12 Loja : L\n"
                        + "13 LosRios : R\n"
                        + "14 Manabi : M\n"
                        + "15 MoronaSantiago : V\n"
                        + "16 Napo : N\n"
                        + "17 Orellana : Q\n"
                        + "18 Pastaza : S\n"
                        + "19 Pichincha : P\n"
                        + "20 SantaElena : Y\n"
                        + "21 SantoDomingo : J\n"
                        + "22 Sucumbios : K\n"
                        + "23 Tungurahua : T\n"
                        + "24 ZamoraChinchipe : Z\n"
                        + "Ingrese una provincia = ");
            Op = in.nextInt();
            switch (Op){
                case 1:
                    if (Op == 1){
                        System.out.println("Provincia ingresada como:" + P.getAzuay());
        }else{
                        System.out.println("Provincia incorrecta");
                    }
                    break;
                    case 2:
                    if (Op == 2){
                        System.out.println("Provincia ingresada como:" + P.getBolivar());
        }else{
                        System.out.println("Provincia incorrecta");
                    }
                    break;
                    case 3:
                    if (Op == 3){
                        System.out.println("Provincia ingresada como:" + P.getCañar());
        }else{
                        System.out.println("Provincia incorrecta");
                    }
                    break;
                    case 4:
                    if (Op == 4){
                        System.out.println("Provincia ingresada como:" + P.getCarchi());
        }else{
                        System.out.println("Provincia incorrecta");
                    }
                    break;
                    case 5:
                    if (Op == 5){
                        System.out.println("Provincia ingresada como:" + P.getChimborazo());
        }else{
                        System.out.println("Provincia incorrecta");
                    }
                    break;
                    case 6:
                    if (Op == 6){
                        System.out.println("Provincia ingresada como:" + P.getCotopaxi());
        }else{
                        System.out.println("Provincia incorrecta");
                    }
                    break;
                    case 7:
                    if (Op == 7){
                        System.out.println("Provincia ingresada como:" + P.getElOro());
        }else{
                        System.out.println("Provincia incorrecta");
                    }
                    break;
                    case 8:
                    if (Op == 8){
                        System.out.println("Provincia ingresada como:" + P.getEsmeraldas());
        }else{
                        System.out.println("Provincia incorrecta");
                    }
                    break;
                    case 9:
                    if (Op == 9){
                        System.out.println("Provincia ingresada como:" + P.getGalapagos());
        }else{
                        System.out.println("Provincia incorrecta");
                    }
                    break;
                    case 10:
                    if (Op == 10){
                        System.out.println("Provincia ingresada como:" + P.getGuayas());
        }else{
                        System.out.println("Provincia incorrecta");
                    }
                    break;
                    case 11:
                    if (Op == 11){
                        System.out.println("Provincia ingresada como:" + P.getImbabura());
        }else{
                        System.out.println("Provincia incorrecta");
                    }
                    break;
                    case 12:
                    if (Op == 12){
                        System.out.println("Provincia ingresada como:" + P.getLoja());
        }else{
                        System.out.println("Provincia incorrecta");
                    }
                    break;
                    case 13:
                    if (Op == 13){
                        System.out.println("Provincia ingresada como:" + P.getLosRios());
        }else{
                        System.out.println("Provincia incorrecta");
                    }
                    break;
                    case 14:
                    if (Op == 14){
                        System.out.println("Provincia ingresada como:" + P.getManabi());
        }else{
                        System.out.println("Provincia incorrecta");
                    }
                    break;
                    case 15:
                    if (Op == 15){
                        System.out.println("Provincia ingresada como:" + P.getMoronaSantiago());
        }else{
                        System.out.println("Provincia incorrecta");
                    }
                    break;
                    case 16:
                    if (Op == 16){
                        System.out.println("Provincia ingresada como:" + P.getNapo());
        }else{
                        System.out.println("Provincia incorrecta");
                    }
                    break;
                    case 17:
                    if (Op == 17){
                        System.out.println("Provincia ingresada como:" + P.getOrellana());
        }else{
                        System.out.println("Provincia incorrecta");
                    }
                    break;
                    case 18:
                    if (Op == 18){
                        System.out.println("Provincia ingresada como:" + P.getPastaza());
        }else{
                        System.out.println("Provincia incorrecta");
                    }
                    break;
                    case 19:
                    if (Op == 19){
                        System.out.println("Provincia ingresada como:" + P.getPichincha());
        }else{
                        System.out.println("Provincia incorrecta");
                    }
                    break;
                    case 20:
                    if (Op == 20){
                        System.out.println("Provincia ingresada como:" + P.getSantaElena());
        }else{
                        System.out.println("Provincia incorrecta");
                    }
                    break;
                    case 21:
                    if (Op == 21){
                        System.out.println("Provincia ingresada como:" + P.getSantoDomingo());
        }else{
                        System.out.println("Provincia incorrecta");
                    }
                    break;
                    case 22:
                    if (Op == 22){
                        System.out.println("Provincia ingresada como:" + P.getSucumbios());
        }else{
                        System.out.println("Provincia incorrecta");
                    }
                    break;
                    case 23:
                    if (Op == 23){
                        System.out.println("Provincia ingresada como:" + P.getTungurahua());
        }else{
                        System.out.println("Provincia incorrecta");
                    }
                    break;
                    case 24:
                    if (Op == 24){
                        System.out.println("Provincia ingresada como:" + P.getZamoraChinchipe());
        }else{
                        System.out.println("Provincia incorrecta");
                    }
                    break;
        }
        }catch (Exception e) {
                System.out.println("Ha ingresado un valor no valido");
                in.next();
            }
    }
    
}

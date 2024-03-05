
package tres_en_raya_java;

import java.util.Scanner;

public class tres_en_raya_2 {

    public static void main(String[] args) {
        int nuevapartida=0;
        boolean continua=true;
       
        Scanner scan=new Scanner(System.in);
        
        do{
            do{
                int mi_matriz[][]= new int[3][3];
                int j1f, j1c, j1f2, j1c2, j1f3, j1c3, j1f4, j1c4;
                int j2f, j2c, j2f2, j2c2, j2f3, j2c3, j2f4, j2c4;
                continua=true;


                //Aqui comienza la explicacion de la partida y mostrar el tablero 
                System.out.println("__________________________________");
                System.out.println("COMENZAMOS !!!!!!!!!!!");
                System.out.println("Les vamos a mostrar el tablero de las tres en raya, en el cual se ve cada posicion:");
                System.out.println("|_0,0_|_0,1_|_0,2_|");
                System.out.println("|_1,0_|_1,1_|_1,2_|");
                System.out.println("|_2,0_|_2,1_|_2,2_|");
                System.out.println("A la hora de poner la ficha, cada jugador debe indicar primero la fila y despues la columna. Las posiciones libres apareceran como un 0. No puede seleccionar una posicion que ya este ocupada por una ficha");

                //primera tirada del jugador 1
                System.out.println("Comienza el jugador numero 1, cuya ficha aparecera en el tablero como un 1");
               do{ 
                   System.out.println("J1 Indique la posicion de la fila");
                    
                    j1f=scan.nextInt();
                    System.out.println("J1 Indique la posicion de la columna");
                    j1c=scan.nextInt();
                    mi_matriz[j1f][j1c]=1;
                    if(j1f<3 && j1c<3){
                        System.out.println("El tablero esta asi ahora mismo:");
                        for(int x=0; x<3; x++){
                            for(int z=0; z<3; z++){

                                System.out.print("|_"+mi_matriz[x][z]+"_|");
                            }System.out.println("");
                        }
                    }
                }while (j1f>2 && j1c>2);

                //primera tirada del jugador 2
                do{
                    do{
                        System.out.println("J2 Indique la posicion de la fila");
                        j2f=scan.nextInt();
                        System.out.println("J2 Indique la posicion de la columna");
                        j2c=scan.nextInt();
                            if(j2f<3 && j2c<3){
                                if(j1f!=j2f || j1c!=j2c){
                                mi_matriz[j2f][j2c]=2;
                                }else {
                                    System.out.println("Esa casilla ya esta ocupada");
                                }
                            }else {
                             System.out.println("Esos rangos no son validos, recuerda que debe ser menor positivo y menor que 3");
                            } 
                    }while (j1f==j2f && j1c==j2c);
                }while (j2f>2 || j2c>2);
                //imprimimos la actualizacion del tablero
                System.out.println("El tablero esta asi ahora mismo:");
                for(int x=0; x<3; x++){
                    for(int z=0; z<3; z++){

                        System.out.print("|_"+mi_matriz[x][z]+"_|");
                    }System.out.println("");
                }
                //Segunda tirada del Jugador1:
                do{
                    do{
                        System.out.println("J1 Indique la posicion de la fila");
                        j1f2=scan.nextInt();
                        System.out.println("J1 Indique la posicion de la columna");
                        j1c2=scan.nextInt();
                            if(j1f2<3 && j1c2<3){
                                if(j1f2!=j1f || j1c2!=j1c){
                                   if(j1f2!=j2f || j1c2!=j2c) {
                                mi_matriz[j1f2][j1c2]=1;
                                   }else{System.out.println("Esa casilla ya esta ocupada"); 
                                   }
                                }else {
                                    System.out.println("Esa casilla ya esta ocupada, indique una distinta");
                                }
                            }else {
                             System.out.println("Esos rangos no son validos, recuerda que debe ser menor positivo y menor que 3");
                            } 
                    }while (j1f2==j1f && j1c2==j1c  || j1f2==j2f && j1c2==j2c);
                }while(j1f2>2 && j1c2>2);
                
                //imprimimos la actualizacion del tablero
                System.out.println("El tablero esta asi ahora mismo:");
                for(int x=0; x<3; x++){
                    for(int z=0; z<3; z++){

                        System.out.print("|_"+mi_matriz[x][z]+"_|");
                    }System.out.println("");
                }
                //Segunda tirada del Jugador2:
                do{
                    do{
                        System.out.println("J2 Indique la posicion de la fila");
                        j2f2=scan.nextInt();
                        System.out.println("J2 Indique la posicion de la columna");
                        j2c2=scan.nextInt();
                            if(j2f2<3 && j2c2<3){
                                if(j2f2!=j1f || j2c2!=j1c){
                                   if(j2f2!=j2f || j2c2!=j2c) {
                                       if (j2f2!=j1f2 || j2c2!=j1c2){
                                           mi_matriz[j2f2][j2c2]=2;
                                       }else{System.out.println("Esa casilla ya esta ocupada, indique una distinta"); 
                                        } 

                                   }else{System.out.println("Esa casilla ya esta ocupada, indique una distinta"); 
                                    }
                                }else {
                                    System.out.println("Esa casilla ya esta ocupada, indique una distinta");
                                }
                            }else {
                             System.out.println("Esos rangos no son validos, recuerda que debe ser menor positivo y menor que 3");
                            } 
                    }while (j2f2==j1f && j2c2==j1c  || j2f2==j2f && j2c2==j2c || j2f2==j1f2 && j2c2==j1c2);
                }while(j2f2>2 && j2c2>2);
                //imprimimos la actualizacion del tablero
                System.out.println("El tablero esta asi ahora mismo:");
                for(int j=0; j<3; j++){
                    for(int k=0; k<3; k++){

                        System.out.print("|_"+mi_matriz[j][k]+"_|");
                    }System.out.println("");    
                }
                //Tercer tirada del Jugador1:
                do{
                    System.out.println("J1 Indique la posicion de la fila");
                    j1f3=scan.nextInt();
                    System.out.println("J1 Indique la posicion de la columna");
                    j1c3=scan.nextInt();
                        if(j1f3<3 && j1c3<3){
                            if(j1f3!=j1f || j1c3!=j1c){
                               if(j1f3!=j2f || j1c3!=j2c) {
                                   if (j1f3!=j1f2 || j1c3!=j1c2){
                                       if (j1f3!=j2f2 || j1c3!=j2c2){
                                           mi_matriz[j1f3][j1c3]=1;
                                       }else{System.out.println("Esa casilla ya esta ocupada, indique una distinta"); 
                                        }

                                   }else{System.out.println("Esa casilla ya esta ocupada, indique una distinta"); 
                                    } 

                               }else{System.out.println("Esa casilla ya esta ocupada, indique una distinta"); 
                                }
                            }else {
                                System.out.println("Esa casilla ya esta ocupada, indique una distinta");
                            }
                        }else {
                         System.out.println("Esos rangos no son validos, recuerda que debe ser menor positivo y menor que 3");
                        } 
                }while (j1f3==j1f && j1c3==j1c  || j1f3==j2f && j1c3==j2c || j1f3==j1f2 && j1c3==j1c2 || j1f3==j2f2 && j1c3==j2c2);

                //comprobacion de posible victoria
                if(mi_matriz[0][0]== mi_matriz[0][1] && mi_matriz[0][0]== mi_matriz[0][2] && mi_matriz[0][0]>0){
                    System.out.println("¡¡¡¡¡¡¡¡¡¡¡aEnhorabuena Jugador 1, has ganado !!!!!!!!!!!!");
                    System.out.println("Si quieres volver a jugar pulsa 1, en caso contrario pulsa otro numero culaquiera.");
                    continua=false;
                    nuevapartida=scan.nextInt();}
                if(mi_matriz[1][0]== mi_matriz[1][1] && mi_matriz[1][0]== mi_matriz[1][2] && mi_matriz[1][0]>0){
                    System.out.println("¡¡¡¡¡¡¡¡¡¡¡bEnhorabuena Jugador 1, has ganado !!!!!!!!!!!!");
                    System.out.println("Si quieres volver a jugar pulsa 1, en caso contrario pulsa otro numero culaquiera.");
                    continua=false;
                    nuevapartida=scan.nextInt();}
                if(mi_matriz[2][0]== mi_matriz[2][1] && mi_matriz[2][1]== mi_matriz[2][2] && mi_matriz[2][0]>0){
                    System.out.println("¡¡¡¡¡¡¡¡¡¡¡cEnhorabuena Jugador 1, has ganado !!!!!!!!!!!!");
                    System.out.println("Si quieres volver a jugar pulsa 1, en caso contrario pulsa otro numero culaquiera.");
                    continua=false;
                    nuevapartida=scan.nextInt();}
                if(mi_matriz[0][0]== mi_matriz[1][0] && mi_matriz[0][0]== mi_matriz[2][0] && mi_matriz[0][0]>0){
                    System.out.println("¡¡¡¡¡¡¡¡¡¡¡dEnhorabuena Jugador 1, has ganado !!!!!!!!!!!!");
                    System.out.println("Si quieres volver a jugar pulsa 1, en caso contrario pulsa otro numero culaquiera.");
                    continua=false;
                    nuevapartida=scan.nextInt();}
                if(mi_matriz[0][1]== mi_matriz[1][1] && mi_matriz[0][1]== mi_matriz[2][1] && mi_matriz[0][1]>0){
                    System.out.println("¡¡¡¡¡¡¡¡¡¡¡eEnhorabuena Jugador 1, has ganado !!!!!!!!!!!!");
                    System.out.println("Si quieres volver a jugar pulsa 1, en caso contrario pulsa otro numero culaquiera.");
                    continua=false;
                    nuevapartida=scan.nextInt();}
                if(mi_matriz[0][2]== mi_matriz[1][2] && mi_matriz[0][2]== mi_matriz[2][2] && mi_matriz[0][2]>0){
                    System.out.println("¡¡¡¡¡¡¡¡¡¡¡fEnhorabuena Jugador 1, has ganado !!!!!!!!!!!!");
                    System.out.println("Si quieres volver a jugar pulsa 1, en caso contrario pulsa otro numero culaquiera.");
                    continua=false;
                    nuevapartida=scan.nextInt();}
                if(mi_matriz[0][0]== mi_matriz[1][1] && mi_matriz[0][0]== mi_matriz[2][2] && mi_matriz[0][0]>0){
                    System.out.println("¡¡¡¡¡¡¡¡¡¡¡gEnhorabuena Jugador 1, has ganado !!!!!!!!!!!!");
                    System.out.println("Si quieres volver a jugar pulsa 1, en caso contrario pulsa otro numero culaquiera.");
                    continua=false;
                    nuevapartida=scan.nextInt();}
                if(mi_matriz[0][2]== mi_matriz[1][1] && mi_matriz[0][2]== mi_matriz[2][0] && mi_matriz[0][2]>0){
                    System.out.println("¡¡¡¡¡¡¡¡¡¡¡hEnhorabuena Jugador 1, has ganado !!!!!!!!!!!!");
                    System.out.println("Si quieres volver a jugar pulsa 1, en caso contrario pulsa otro numero culaquiera.");
                    continua=false;
                    nuevapartida=scan.nextInt();
                }
                while(continua==true){
                    do{
                        //imprimimos la actualizacion del tablero
                        System.out.println("El tablero esta asi ahora mismo:");
                        for(int j=0; j<3; j++){
                            for(int k=0; k<3; k++){

                                System.out.print("|_"+mi_matriz[j][k]+"_|");
                            }System.out.println("");    
                        }

                    // Tercera tirada del jugador 2
                    System.out.println("J2 Indique la posicion de la fila");
                    j2f3=scan.nextInt();
                    System.out.println("J2 Indique la posicion de la columna");
                    j2c3=scan.nextInt();
                        if(j2f3<3 && j2c3<3){
                            if(j2f3!=j1f || j2c3!=j1c){
                               if(j2f3!=j2f || j2c3!=j2c) {
                                   if (j2f3!=j1f2 || j2c3!=j1c2){
                                       if (j2f3!=j2f2 || j2c3!=j2c2){
                                           if(j2f3!=j1f3 || j1c3!=j1c3){
                                           mi_matriz[j2f3][j2c3]=2;
                                           }else{System.out.println("Esa casilla ya esta ocupada, indique una distinta"); 
                                            }
                                       }else{System.out.println("Esa casilla ya esta ocupada, indique una distinta"); 
                                        }

                                   }else{System.out.println("Esa casilla ya esta ocupada, indique una distinta"); 
                                    } 

                               }else{System.out.println("Esa casilla ya esta ocupada, indique una distinta"); 
                                }
                            }else {
                                System.out.println("Esa casilla ya esta ocupada, indique una distinta");
                            }
                        }else {
                         System.out.println("Esos rangos no son validos, recuerda que debe ser menor positivo y menor que 3");
                        } 
                    }while (j2f3==j1f && j2c3==j1c  || j2f3==j2f && j2c3==j2c || j2f3==j1f2 && j2c3==j1c2 || j2f3==j2f2 && j2c3==j2c2 || j2f3==j1f3 && j2c3==j1c3);

                    //comprobacion de posible victoria
                    if(mi_matriz[0][0]== mi_matriz[0][1] && mi_matriz[0][0]== mi_matriz[0][2] && mi_matriz[0][0]>0){
                        System.out.println("¡¡¡¡¡¡¡¡¡¡¡aEnhorabuena Jugador 2, has ganado !!!!!!!!!!!!");
                        System.out.println("Si quieres volver a jugar pulsa 1, en caso contrario pulsa otro numero culaquiera.");
                        continua=false;
                        nuevapartida=scan.nextInt();}
                    if(mi_matriz[1][0]== mi_matriz[1][1] && mi_matriz[1][0]== mi_matriz[1][2] && mi_matriz[1][0]>0){
                        System.out.println("¡¡¡¡¡¡¡¡¡¡¡bEnhorabuena Jugador 2, has ganado !!!!!!!!!!!!");
                        System.out.println("Si quieres volver a jugar pulsa 1, en caso contrario pulsa otro numero culaquiera.");
                        continua=false;
                        nuevapartida=scan.nextInt();}
                    if(mi_matriz[2][0]== mi_matriz[2][1] && mi_matriz[2][1]== mi_matriz[2][2] && mi_matriz[2][0]>0){
                        System.out.println("¡¡¡¡¡¡¡¡¡¡¡cEnhorabuena Jugador 2, has ganado !!!!!!!!!!!!");
                        System.out.println("Si quieres volver a jugar pulsa 1, en caso contrario pulsa otro numero culaquiera.");
                        continua=false;
                        nuevapartida=scan.nextInt();}
                    if(mi_matriz[0][0]== mi_matriz[1][0] && mi_matriz[0][0]== mi_matriz[2][0] && mi_matriz[0][0]>0){
                        System.out.println("¡¡¡¡¡¡¡¡¡¡¡dEnhorabuena Jugador 2, has ganado !!!!!!!!!!!!");
                        System.out.println("Si quieres volver a jugar pulsa 1, en caso contrario pulsa otro numero culaquiera.");
                        continua=false;
                        nuevapartida=scan.nextInt();}
                    if(mi_matriz[0][1]== mi_matriz[1][1] && mi_matriz[0][1]== mi_matriz[2][1] && mi_matriz[0][1]>0){
                        System.out.println("¡¡¡¡¡¡¡¡¡¡¡eEnhorabuena Jugador 2, has ganado !!!!!!!!!!!!");
                        System.out.println("Si quieres volver a jugar pulsa 1, en caso contrario pulsa otro numero culaquiera.");
                        continua=false;
                        nuevapartida=scan.nextInt();}
                    if(mi_matriz[0][2]== mi_matriz[1][2] && mi_matriz[0][2]== mi_matriz[2][2] && mi_matriz[0][2]>0){
                        System.out.println("¡¡¡¡¡¡¡¡¡¡¡fEnhorabuena Jugador 2, has ganado !!!!!!!!!!!!");
                        System.out.println("Si quieres volver a jugar pulsa 1, en caso contrario pulsa otro numero culaquiera.");
                        continua=false;
                        nuevapartida=scan.nextInt();}
                    if(mi_matriz[0][0]== mi_matriz[1][1] && mi_matriz[0][0]== mi_matriz[2][2] && mi_matriz[0][0]>0){
                        System.out.println("¡¡¡¡¡¡¡¡¡¡¡gEnhorabuena Jugador 2, has ganado !!!!!!!!!!!!");
                        System.out.println("Si quieres volver a jugar pulsa 1, en caso contrario pulsa otro numero culaquiera.");
                        continua=false;
                        nuevapartida=scan.nextInt();}
                    if(mi_matriz[0][2]== mi_matriz[1][1] && mi_matriz[0][2]== mi_matriz[2][0] && mi_matriz[0][2]>0){
                        System.out.println("¡¡¡¡¡¡¡¡¡¡¡hEnhorabuena Jugador 2, has ganado !!!!!!!!!!!!");
                        System.out.println("Si quieres volver a jugar pulsa 1, en caso contrario pulsa otro numero culaquiera.");
                        continua=false;
                        nuevapartida=scan.nextInt();
                    }

                    while(continua==true){
                        do{
                            //imprimimos la actualizacion del tablero
                            System.out.println("El tablero esta asi ahora mismo:");
                            for(int j=0; j<3; j++){
                                for(int k=0; k<3; k++){

                                    System.out.print("|_"+mi_matriz[j][k]+"_|");
                                }System.out.println("");    
                            }

                        // cuarta tirada del jugador 1
                        System.out.println("J1 Indique la posicion de la fila");
                        j1f4=scan.nextInt();
                        System.out.println("J1 Indique la posicion de la columna");
                        j1c4=scan.nextInt();
                            if(j1f4<3 && j1c4<3){
                                if(j1f4!=j1f || j1c4!=j1c){
                                   if(j1f4!=j2f || j1c4!=j2c) {
                                       if (j1f4!=j1f2 || j1c4!=j1c2){
                                           if (j1f4!=j2f2 || j1c4!=j2c2){
                                               if(j1f4!=j1f3 || j1c4!=j1c3){
                                                   if(j1f4!=j2f3 || j1c4!=j2c3){
                                                    mi_matriz[j1f4][j1c4]=1;
                                                    }else{System.out.println("Esa casilla ya esta ocupada, indique una distinta"); 
                                                    }

                                                }else{System.out.println("Esa casilla ya esta ocupada, indique una distinta"); 
                                                }
                                            }else{System.out.println("Esa casilla ya esta ocupada, indique una distinta"); 
                                            }
                                        }else{System.out.println("Esa casilla ya esta ocupada, indique una distinta"); 
                                        } 
                                    }else{System.out.println("Esa casilla ya esta ocupada, indique una distinta"); 
                                    }
                                }else {System.out.println("Esa casilla ya esta ocupada, indique una distinta");
                                }
                            }else {System.out.println("Esos rangos no son validos, recuerda que debe ser menor positivo y menor que 3");
                            } 
                        }while (j1f4==j1f && j1c4==j1c  || j1f4==j2f && j1c4==j2c || j1f4==j1f2 && j1c4==j1c2 || j1f4==j2f2 && j1c4==j2c2 || j1f4==j1f3 && j1c4==j1c3 || j1f4==j2f3 && j1c4==j2c3);

                        //comprobacion de posible victoria
                        if(mi_matriz[0][0]== mi_matriz[0][1] && mi_matriz[0][0]== mi_matriz[0][2] && mi_matriz[0][0]>0){
                            System.out.println("¡¡¡¡¡¡¡¡¡¡¡aEnhorabuena Jugador 1, has ganado !!!!!!!!!!!!");
                            System.out.println("Si quieres volver a jugar pulsa 1, en caso contrario pulsa otro numero culaquiera.");
                            continua=false;
                            nuevapartida=scan.nextInt();}
                        if(mi_matriz[1][0]== mi_matriz[1][1] && mi_matriz[1][0]== mi_matriz[1][2] && mi_matriz[1][0]>0){
                            System.out.println("¡¡¡¡¡¡¡¡¡¡¡bEnhorabuena Jugador 1, has ganado !!!!!!!!!!!!");
                            System.out.println("Si quieres volver a jugar pulsa 1, en caso contrario pulsa otro numero culaquiera.");
                            continua=false;
                            nuevapartida=scan.nextInt();}
                        if(mi_matriz[2][0]== mi_matriz[2][1] && mi_matriz[2][1]== mi_matriz[2][2] && mi_matriz[2][0]>0){
                            System.out.println("¡¡¡¡¡¡¡¡¡¡¡cEnhorabuena Jugador 1, has ganado !!!!!!!!!!!!");
                            System.out.println("Si quieres volver a jugar pulsa 1, en caso contrario pulsa otro numero culaquiera.");
                            continua=false;
                            nuevapartida=scan.nextInt();}
                        if(mi_matriz[0][0]== mi_matriz[1][0] && mi_matriz[0][0]== mi_matriz[2][0] && mi_matriz[0][0]>0){
                            System.out.println("¡¡¡¡¡¡¡¡¡¡¡dEnhorabuena Jugador 1, has ganado !!!!!!!!!!!!");
                            System.out.println("Si quieres volver a jugar pulsa 1, en caso contrario pulsa otro numero culaquiera.");
                            continua=false;
                            nuevapartida=scan.nextInt();}
                        if(mi_matriz[0][1]== mi_matriz[1][1] && mi_matriz[0][1]== mi_matriz[2][1] && mi_matriz[0][1]>0){
                            System.out.println("¡¡¡¡¡¡¡¡¡¡¡eEnhorabuena Jugador 1, has ganado !!!!!!!!!!!!");
                            System.out.println("Si quieres volver a jugar pulsa 1, en caso contrario pulsa otro numero culaquiera.");
                            continua=false;
                            nuevapartida=scan.nextInt();}
                        if(mi_matriz[0][2]== mi_matriz[1][2] && mi_matriz[0][2]== mi_matriz[2][2] && mi_matriz[0][2]>0){
                            System.out.println("¡¡¡¡¡¡¡¡¡¡¡fEnhorabuena Jugador 1, has ganado !!!!!!!!!!!!");
                            System.out.println("Si quieres volver a jugar pulsa 1, en caso contrario pulsa otro numero culaquiera.");
                            continua=false;
                            nuevapartida=scan.nextInt();}
                        if(mi_matriz[0][0]== mi_matriz[1][1] && mi_matriz[0][0]== mi_matriz[2][2] && mi_matriz[0][0]>0){
                            System.out.println("¡¡¡¡¡¡¡¡¡¡¡gEnhorabuena Jugador 1, has ganado !!!!!!!!!!!!");
                            System.out.println("Si quieres volver a jugar pulsa 1, en caso contrario pulsa otro numero culaquiera.");
                            continua=false;
                            nuevapartida=scan.nextInt();}
                        if(mi_matriz[0][2]== mi_matriz[1][1] && mi_matriz[0][2]== mi_matriz[2][0] && mi_matriz[0][2]>0){
                            System.out.println("¡¡¡¡¡¡¡¡¡¡¡hEnhorabuena Jugador 1, has ganado !!!!!!!!!!!!");
                            System.out.println("Si quieres volver a jugar pulsa 1, en caso contrario pulsa otro numero culaquiera.");
                            continua=false;
                            nuevapartida=scan.nextInt();
                        }
                            while(continua){
                            do{
                                //imprimimos la actualizacion del tablero
                                System.out.println("El tablero esta asi ahora mismo:");
                                for(int j=0; j<3; j++){
                                    for(int k=0; k<3; k++){

                                        System.out.print("|_"+mi_matriz[j][k]+"_|");
                                    }System.out.println("");    
                                }

                            // Cuarta tirada del jugador 2
                            System.out.println("J2 Indique la posicion de la fila");
                            j2f4=scan.nextInt();
                            System.out.println("J2 Indique la posicion de la columna");
                            j2c4=scan.nextInt();
                                if(j2f4<3 && j2c4<3){
                                    if(j2f4!=j1f || j2c4!=j1c){
                                       if(j2f4!=j2f || j2c4!=j2c) {
                                           if (j2f4!=j1f2 || j2c4!=j1c2){
                                               if (j2f4!=j2f2 || j2c4!=j2c2){
                                                   if(j2f4!=j1f3 || j2c4!=j1c3){
                                                       if(j2f4!=j2f3 || j2c4!=j2c3){
                                                           if(j2f4!=j1f4 || j2c4!=j1c4){
                                                            mi_matriz[j2f4][j2c4]=2;
                                                            }else{System.out.println("Esa casilla ya esta ocupada, indique una distinta"); 
                                                            }
                                                        }else{System.out.println("Esa casilla ya esta ocupada, indique una distinta"); 
                                                        }

                                                    }else{System.out.println("Esa casilla ya esta ocupada, indique una distinta"); 
                                                    }
                                                }else{System.out.println("Esa casilla ya esta ocupada, indique una distinta"); 
                                                }
                                            }else{System.out.println("Esa casilla ya esta ocupada, indique una distinta"); 
                                            } 
                                        }else{System.out.println("Esa casilla ya esta ocupada, indique una distinta"); 
                                        }
                                    }else {System.out.println("Esa casilla ya esta ocupada, indique una distinta");
                                    }
                                }else {System.out.println("Esos rangos no son validos, recuerda que debe ser menor positivo y menor que 3");
                                } 
                            }while (j2f4==j1f && j2c4==j1c  || j2f4==j2f && j2c4==j2c || j2f4==j1f2 && j2c4==j1c2 || j2f4==j2f2 && j2c4==j2c2 || j2f4==j1f3 && j2c4==j1c3 || j2f4==j2f3 && j2c4==j2c3 || j2f4==j1f4 && j2c4==j1c4);

                            //comprobacion de posible victoria
                            if(mi_matriz[0][0]== mi_matriz[0][1] && mi_matriz[0][0]== mi_matriz[0][2] && mi_matriz[0][0]>0){
                                System.out.println("¡¡¡¡¡¡¡¡¡¡¡aEnhorabuena Jugador 2, has ganado !!!!!!!!!!!!");
                                System.out.println("Si quieres volver a jugar pulsa 1, en caso contrario pulsa otro numero culaquiera.");
                                continua=false;
                                nuevapartida=scan.nextInt();
                            }
                            continua=false;
                            if(mi_matriz[1][0]== mi_matriz[1][1] && mi_matriz[1][0]== mi_matriz[1][2] && mi_matriz[1][0]>0){
                                System.out.println("¡¡¡¡¡¡¡¡¡¡¡bEnhorabuena Jugador 2, has ganado !!!!!!!!!!!!");
                                System.out.println("Si quieres volver a jugar pulsa 1, en caso contrario pulsa otro numero culaquiera.");
                                continua=false;
                                nuevapartida=scan.nextInt();}
                            if(mi_matriz[2][0]== mi_matriz[2][1] && mi_matriz[2][1]== mi_matriz[2][2] && mi_matriz[2][0]>0){
                                System.out.println("¡¡¡¡¡¡¡¡¡¡¡cEnhorabuena Jugador 2, has ganado !!!!!!!!!!!!");
                                System.out.println("Si quieres volver a jugar pulsa 1, en caso contrario pulsa otro numero culaquiera.");
                                continua=false;
                                nuevapartida=scan.nextInt();}
                            if(mi_matriz[0][0]== mi_matriz[1][0] && mi_matriz[0][0]== mi_matriz[2][0] && mi_matriz[0][0]>0){
                                System.out.println("¡¡¡¡¡¡¡¡¡¡¡dEnhorabuena Jugador 2, has ganado !!!!!!!!!!!!");
                                System.out.println("Si quieres volver a jugar pulsa 1, en caso contrario pulsa otro numero culaquiera.");
                                continua=false;
                                nuevapartida=scan.nextInt();}
                            if(mi_matriz[0][1]== mi_matriz[1][1] && mi_matriz[0][1]== mi_matriz[2][1] && mi_matriz[0][1]>0){
                                System.out.println("¡¡¡¡¡¡¡¡¡¡¡eEnhorabuena Jugador 2, has ganado !!!!!!!!!!!!");
                                System.out.println("Si quieres volver a jugar pulsa 1, en caso contrario pulsa otro numero culaquiera.");
                                continua=false;
                                nuevapartida=scan.nextInt();}
                            if(mi_matriz[0][2]== mi_matriz[1][2] && mi_matriz[0][2]== mi_matriz[2][2] && mi_matriz[0][2]>0){
                                System.out.println("¡¡¡¡¡¡¡¡¡¡¡fEnhorabuena Jugador 2, has ganado !!!!!!!!!!!!");
                                System.out.println("Si quieres volver a jugar pulsa 1, en caso contrario pulsa otro numero culaquiera.");
                                continua=false;
                                nuevapartida=scan.nextInt();}
                            if(mi_matriz[0][0]== mi_matriz[1][1] && mi_matriz[0][0]== mi_matriz[2][2] && mi_matriz[0][0]>0){
                                System.out.println("¡¡¡¡¡¡¡¡¡¡¡gEnhorabuena Jugador 2, has ganado !!!!!!!!!!!!");
                                System.out.println("Si quieres volver a jugar pulsa 1, en caso contrario pulsa otro numero culaquiera.");
                                continua=false;
                                nuevapartida=scan.nextInt();}
                            if(mi_matriz[0][2]== mi_matriz[1][1] && mi_matriz[0][2]== mi_matriz[2][0] && mi_matriz[0][2]>0){
                                System.out.println("¡¡¡¡¡¡¡¡¡¡¡hEnhorabuena Jugador 2, has ganado !!!!!!!!!!!!");
                                System.out.println("Si quieres volver a jugar pulsa 1, en caso contrario pulsa otro numero culaquiera.");
                                continua=false;
                                nuevapartida=scan.nextInt();
                            }

                        }

                    }

                }    

            }while(nuevapartida==1);
        System.out.println("");
        System.out.println("...........Lo sentimos han quedado empate........");
        System.out.println("Si quieres volver a jugar pulsa 1, en caso contrario pulsa otro numero culaquiera.");
        nuevapartida=scan.nextInt();
        }while(nuevapartida==1);
    }
}
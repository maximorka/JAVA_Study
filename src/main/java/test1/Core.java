package test1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.*;
public class Core extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/sample.fxml"));
        primaryStage.setTitle("Constructor");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
        Scanner in = new Scanner(System.in);
        System.out.println("Hello, enter size array:");

         int size = in.nextInt();
         int[] numderArray = new int[size];

        System.out.println("Enter number array:");

        for(int i=0;i<size;i++) {
             numderArray[i] = in.nextInt();
        }
        int max=numderArray[0];
        int five=0;
        for (int i = 0; i<size-1; i++){

            if(max>numderArray[i+1]){
                continue;
            }else {
                max=numderArray[i+1];
            }
        }
        System.out.println("max:"+max);
        for (int i=0;i<size;i++){

            if(numderArray[i]==5){
                five++;
            }
        }
        System.out.println("five:"+five);

        int min=numderArray[0];
        int old=0;
        for(int j = 0; j < size - 1; j++) {
            for (int i = 0; i < size - 1; i++) {
                if (numderArray[i] < numderArray[i + 1]) {
                    continue;
                }else {
                    old=numderArray[i];
                    numderArray[i] = numderArray[i + 1];
                    numderArray[i + 1]=old;
                }

            }
            //numderArray[j]=min;
        }
        System.out.println("size mac"+size);
        for(int i =0; i<size; i++){
            System.out.println(numderArray[i]);
        }

         min=numderArray[0];
        for (int i =0; i<size-1; i++){

            if(min<numderArray[i+1]){
                continue;
            }else {
                numderArray[i]=numderArray[i+1];
                min=numderArray[i+1];
            }
        }
        System.out.println("min:"+min);






//        for(int i=0;i<size;i++) {
//            System.out.println("Number"+i);
//            System.out.println(numderArray[i]);
//        }

    }


    public static void main(String[] args) {
        launch(args);
    }
}

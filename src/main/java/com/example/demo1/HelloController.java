//package com.example.demo1;
//import java.io.IOException;
//import java.net.HttpURLConnection;
//import java.net.URL;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Objects;
//import java.util.Scanner;
//
//import javafx.event.ActionEvent;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Node;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.control.TextField;
//import javafx.stage.Stage;
//import javafx.fxml.FXML;
//import javafx.scene.control.Label;
//
//import static jdk.internal.agent.Agent.getText;
//
//public class HelloController {
//    @FXML
//    private Label welcomeText;
//    @FXML
//    private Stage stage;
//
//    @FXML
//    private TextField latitude;
//
//    @FXML
//    private TextField longitude;
//
////    @FXML
////    private static Button Print;
//
//
//
//    public void Search(ActionEvent event) throws IOException {
//
//
//        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("sojin.fxml")));
//        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//        Scene scene = new Scene(root);
//        stage.setScene(scene);
//        stage.show();
//    }
//
//    public void Print(ActionEvent event) throws IOException {
//        String lat = latitude.getText();
//        String lon = longitude.getText();
//        System.out.println(lat);
//        System.out.println(lon);
//    }
//}
package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class HelloController {

    private static final String API_KEY = "fc3737c9fe8fc115f682541540b8be06";
    private static final String API_ENDPOINT = "http://api.openweathermap.org/data/2.5/weather";
    private static final int MIN_IN_MILLIS = 60000;

    private Stage stage;
    private List<String> weatherHistory = new ArrayList<>();

    @FXML
    private Label welcomeText;

    @FXML
    private TextField latitude;

    @FXML
    private TextField longitude;

    public void Search(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("sojin.fxml")));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
//
//        String Value = Print();
//        System.out.print(Value);
//
//        FXMLLoader loader = new FXMLLoader(getClass().getResource("sojin.fxml"));
//        Parent root = loader.load();
//
//        Sojin sc = loader.getController();
//        sc.set(Value);
//
//        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//        Scene scene = new Scene(root);
//        stage.setScene(scene);
//        stage.show();

    }

//
//        public String Print() {
//            try {
//                double lat = Double.parseDouble(latitude.getText());
//                double lon = Double.parseDouble(longitude.getText());
//
//                String weatherInfo = displayWeather(lat, lon);
////                weatherHistory.add(weatherInfo);
//                return weatherInfo;
////                System.out.println("\nWeather Information:");
////                System.out.println(weatherInfo);
//
//            } catch (NumberFormatException e) {
//                System.err.println("Invalid input. Please enter valid latitude and longitude.");
//            }
//            return "Error";
//        }
//
//
//    private String displayWeather(double latitude, double longitude) {
//        try {
//            String apiUrl = API_ENDPOINT + "?lat=" + latitude + "&lon=" + longitude + "&appid=" + API_KEY;
//
//            HttpURLConnection connection = (HttpURLConnection) new URL(apiUrl).openConnection();
//
//            try (Scanner scanner = new Scanner(connection.getInputStream())) {
//                StringBuilder response = new StringBuilder();
//                while (scanner.hasNextLine()) {
//                    response.append(scanner.nextLine());
//                }
//
//                String weatherInfo = "Weather information: " + response.toString();
//
////                System.out.println(weatherInfo);
////                System.out.println(response);
//
//                return weatherInfo;
//            }
//
//        } catch (IOException e) {
//            String errorMessage = "Error fetching weather information: " + e.getMessage();
//            System.err.println(errorMessage);
//            return errorMessage;
//        }
//    }
//
//    private void sleep(long millis) {
//        try {
//            Thread.sleep(millis);
//        } catch (InterruptedException e) {
//            Thread.currentThread().interrupt();
//            e.printStackTrace();
//        }
    }

package ru.cooper;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import lombok.extern.slf4j.Slf4j;

/**
 * Главный класс проекта (точка входа).
 * <p>
 * Этот класс наследует от {@link Application} и запускает JavaFX приложение.
 * В методе {@link #start(Stage)} создаётся главное окно приложения с загрузкой
 * FXML-файла для представления главного меню.
 *
 * @author duoso
 * @version 1.0
 */
@Slf4j
public class Main extends Application {

    /**
     * Метод, который запускает приложение.
     *
     * @param stage Основная сцена приложения, которая будет отображаться.
     */
    @Override
    public void start(Stage stage) {
        try {
            // Загружаем FXML-файл для главного меню
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/menu_view.fxml"));
            Parent root = loader.load();

            // Устанавливаем заголовок окна
            stage.setTitle("Космический бой");
            // Устанавливаем сцену с загруженным корнем и размерами
            stage.setScene(new Scene(root, 800, 600));
            // Отображаем окно
            stage.show();

        } catch (Exception e) {
            log.error("Ошибка при загрузке FXML", e);
        }
    }

    /**
     * Точка входа в приложение.
     *
     * @param args Аргументы командной строки.
     */
    public static void main(String[] args) {
        log.info("Приложение запущено!");
        launch(args); // запуск приложения
    }
}
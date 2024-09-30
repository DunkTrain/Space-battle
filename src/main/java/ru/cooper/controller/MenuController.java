package ru.cooper.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

/**
 * Класс, описывающий меню игры.
 * <p>
 * Этот класс управляет элементами интерфейса меню, включая кнопки
 * для начала игры, открытия настроек и выхода из игры.
 * </p>
 *
 * @author duoso
 * @version 1.0
 */
public class MenuController {

    /**
     * Кнопка для начала игры.
     */
    @FXML
    private Button startButton;

    /**
     * Кнопка для открытия настроек.
     */
    @FXML
    private Button settingsButton;

    /**
     * Кнопка для выхода из игры.
     */
    @FXML
    private Button exitButton;

    /**
     * Метод, вызываемый при нажатии на кнопку "Начать игру".
     * Выводит сообщение о начале игры в консоль.
     */
    @FXML
    private void startGame() {
        System.out.println("Игра началась!");
    }

    /**
     * Метод, вызываемый при нажатии на кнопку "Настройки".
     * Выводит сообщение о том, что открываются настройки в консоль.
     */
    @FXML
    private void openSettings() {
        System.out.println("Открыть настройки");
    }

    /**
     * Метод, вызываемый при нажатии на кнопку "Выход".
     * Выводит сообщение о выходе из игры в консоль и завершает приложение.
     */
    @FXML
    private void exit() {
        System.out.println("Выход из игры");
        System.exit(0);
    }
}

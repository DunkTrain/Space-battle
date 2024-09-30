package ru.cooper.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Класс описывающий корабли
 * <p>
 * Каждый корабль имеет имя, размер и позицию на игровом поле.
 *
 * @author duoso
 * @version 1.0
 */
@Getter
@Setter
@AllArgsConstructor
public class Ship {

    /**
     * Имя корабля.
     */
    private String name;

    /**
     * Размер корабля, указывающий количество ячеек, занимаемых кораблем на игровом поле.
     */
    private int size;

    /**
     * Позиция корабля на игровом поле, представлена массивом целых чисел.
     * Каждый элемент массива соответствует индексу ячейки, занимаемой кораблем.
     */
    private int[] position;
}



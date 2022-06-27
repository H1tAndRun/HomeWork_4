package Exercise1;
//Продвинутый уровень
//Задача №1
//1. Создать следующую структуру из классов и интерфейсов:
// дерево -> ель (имеет шишки, умеет пахнуть)
// дерево -> сосна (имеет шишки, умеет пахнуть)
// растение -> роза (умеет цвести, умеет пахнуть)
// растение -> папоротник (умеет цвести)
// Создать у каждого класса по объекту, распределить по массивам интерфейсов
// И у каждого массива вызвать характерный метод
//Ожидание:
// сосна : умеет пахнуть
// ель : умееть пахнуть
// роза: умееть пахнуть
// роза: умеет цвести
// папоротник: умеет цвести

import java.util.ArrayList;
import java.util.List;

public class Exercise1 {
    public static void main(String[] args) {
        Spruce spruce = new Spruce(true);
        Pine pine = new Pine(true);
        Rose rose = new Rose();
        Fern fern = new Fern();

        Smell smell []={spruce,pine,rose};
        Blossom blossoms[] ={rose,fern};

        for (Smell smell1 : smell) {
            smell1.smell();
        }

        for (Blossom blossom : blossoms) {
            blossom.blossom();
        }


    }
}

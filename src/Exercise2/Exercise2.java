package Exercise2;
//Задача №2
//2. Создать следующую структуру из классов и интерфейсов
// магазин (обладает работниками)
// работник (обладает часами)
// часы (умеют тикать, если сломаны выкидывают ошибку WatchBrokenError)
// Бренд (обладает массивом магазинов)
// Создать бренд, положить в него два магазина, в каждом магазине будет по работнику,
// у каждого работника по часам. У одного работника часы сломаны, у второго нет.
// После создания бренда, вытащить из него все часы и вызвать у всех часов метод тикать,
// обработать ошибку сломанных часов.
// Ожидание вывода на экран:
// Часы тикают
// Ошибка: Часы сломались.

public class Exercise2 {
    public static void main(String[] args) {
        Shop shop1 = new Shop(new Worker(new Watch(false)));
        Shop shop2 = new Shop(new Worker(new Watch(true)));

        Shop shops[] = {shop1, shop2};
        try {
            Brand brand = new Brand(shops);
            for (int i = 0; i < brand.shop.length; i++) {
                brand.shop[i].worker.watch.tick();
            }
        } catch (WatchBrokenError e) {
            System.out.println("Ошибка : часы сломались");
        }

    }
}

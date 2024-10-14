package com.zeni;

import com.zeni.entity.Category;
import com.zeni.entity.Product;
import com.zeni.service.CategoryService;
import com.zeni.service.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

    private final CategoryService categoryService;
    private final ProductService productService;

    public Application(CategoryService categoryService, ProductService productService) {
        this.categoryService = categoryService;
        this.productService = productService;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Category beverages = new Category("Напої");
        Category tools = new Category("Інструменти");
        Category vehicles = new Category("Транспорт");
        Category toys = new Category("Іграшки");
        Category accessories = new Category("Аксесуари");

        categoryService.saveCategory(beverages);
        categoryService.saveCategory(tools);
        categoryService.saveCategory(vehicles);
        categoryService.saveCategory(toys);
        categoryService.saveCategory(accessories);

        Product coffee = new Product("Кава", 150, "coffee.jpg", beverages);
        Product tea = new Product("Чай", 100, "tea.jpg", beverages);
        Product juice = new Product("Сік", 70, "juice.jpg", beverages);
        Product soda = new Product("Газована вода", 50, "soda.jpg", beverages);
        Product water = new Product("Мінеральна вода", 30, "water.jpg", beverages);
        Product energyDrink = new Product("Енергетичний напій", 90, "energydrink.jpg", beverages);
        Product milkshake = new Product("Молочний коктейль", 120, "milkshake.jpg", beverages);
        Product smoothie = new Product("Смузі", 180, "smoothie.jpg", beverages);
        Product beer = new Product("Пиво", 60, "beer.jpg", beverages);
        Product wine = new Product("Вино", 200, "wine.jpg", beverages);

        Product hammer = new Product("Молоток", 250, "hammer.jpg", tools);
        Product screwdriver = new Product("Викрутка", 120, "screwdriver.jpg", tools);
        Product drill = new Product("Дриль", 1500, "drill.jpg", tools);
        Product wrench = new Product("Гайковий ключ", 300, "wrench.jpg", tools);
        Product saw = new Product("Пила", 700, "saw.jpg", tools);
        Product pliers = new Product("Плоскогубці", 150, "pliers.jpg", tools);
        Product tapeMeasure = new Product("Рулетка", 100, "tapemeasure.jpg", tools);
        Product level = new Product("Рівень", 180, "level.jpg", tools);
        Product toolbox = new Product("Ящик для інструментів", 500, "toolbox.jpg", tools);
        Product ladder = new Product("Драбина", 1000, "ladder.jpg", tools);

        Product car = new Product("Автомобіль", 500000, "car.jpg", vehicles);
        Product motorcycle = new Product("Мотоцикл", 150000, "motorcycle.jpg", vehicles);
        Product scooter = new Product("Самокат", 10000, "scooter.jpg", vehicles);
        Product bicycle = new Product("Велосипед", 25000, "bicycle.jpg", vehicles);
        Product skateboard = new Product("Скейтборд", 5000, "skateboard.jpg", vehicles);
        Product electricScooter = new Product("Електросамокат", 40000, "electricscooter.jpg", vehicles);
        Product rollerSkates = new Product("Роликові ковзани", 7000, "rollerskates.jpg", vehicles);
        Product hoverboard = new Product("Гіроскутер", 15000, "hoverboard.jpg", vehicles);
        Product kayak = new Product("Каяк", 30000, "kayak.jpg", vehicles);
        Product jetSki = new Product("Гідроцикл", 80000, "jetski.jpg", vehicles);

        Product lego = new Product("Конструктор LEGO", 1200, "lego.jpg", toys);
        Product doll = new Product("Лялька", 500, "doll.jpg", toys);
        Product actionFigure = new Product("Фігурка супергероя", 700, "actionfigure.jpg", toys);
        Product puzzle = new Product("Пазли", 300, "puzzle.jpg", toys);
        Product toyCar = new Product("Іграшкова машина", 400, "toycar.jpg", toys);
        Product stuffedAnimal = new Product("М'яка іграшка", 600, "stuffedanimal.jpg", toys);
        Product boardGame = new Product("Настільна гра", 800, "boardgame.jpg", toys);
        Product drone = new Product("Іграшковий дрон", 5000, "drone.jpg", toys);
        Product buildingBlocks = new Product("Кубики", 350, "buildingblocks.jpg", toys);
        Product remoteControlCar = new Product("Машина на радіоуправлінні", 1200, "remotecontrolcar.jpg", toys);

        Product wallet = new Product("Гаманець", 500, "wallet.jpg", accessories);
        Product sunglasses = new Product("Сонцезахисні окуляри", 700, "sunglasses.jpg", accessories);
        Product belt = new Product("Ремінь", 400, "belt.jpg", accessories);
        Product watch = new Product("Годинник", 3000, "watch.jpg", accessories);
        Product bracelet = new Product("Браслет", 800, "bracelet.jpg", accessories);
        Product necklace = new Product("Кольє", 1500, "necklace.jpg", accessories);
        Product earrings = new Product("Сережки", 600, "earrings.jpg", accessories);
        Product ring = new Product("Кільце", 1200, "ring.jpg", accessories);
        Product scarf = new Product("Шарф", 350, "scarf.jpg", accessories);
        Product hat = new Product("Капелюх", 450, "hat.jpg", accessories);

        productService.saveProduct(coffee);
        productService.saveProduct(tea);
        productService.saveProduct(juice);
        productService.saveProduct(soda);
        productService.saveProduct(water);
        productService.saveProduct(energyDrink);
        productService.saveProduct(milkshake);
        productService.saveProduct(smoothie);
        productService.saveProduct(beer);
        productService.saveProduct(wine);

        productService.saveProduct(hammer);
        productService.saveProduct(screwdriver);
        productService.saveProduct(drill);
        productService.saveProduct(wrench);
        productService.saveProduct(saw);
        productService.saveProduct(pliers);
        productService.saveProduct(tapeMeasure);
        productService.saveProduct(level);
        productService.saveProduct(toolbox);
        productService.saveProduct(ladder);

        productService.saveProduct(car);
        productService.saveProduct(motorcycle);
        productService.saveProduct(scooter);
        productService.saveProduct(bicycle);
        productService.saveProduct(skateboard);
        productService.saveProduct(electricScooter);
        productService.saveProduct(rollerSkates);
        productService.saveProduct(hoverboard);
        productService.saveProduct(kayak);
        productService.saveProduct(jetSki);

        productService.saveProduct(lego);
        productService.saveProduct(doll);
        productService.saveProduct(actionFigure);
        productService.saveProduct(puzzle);
        productService.saveProduct(toyCar);
        productService.saveProduct(stuffedAnimal);
        productService.saveProduct(boardGame);
        productService.saveProduct(drone);
        productService.saveProduct(buildingBlocks);
        productService.saveProduct(remoteControlCar);

        productService.saveProduct(wallet);
        productService.saveProduct(sunglasses);
        productService.saveProduct(belt);
        productService.saveProduct(watch);
        productService.saveProduct(bracelet);
        productService.saveProduct(necklace);
        productService.saveProduct(earrings);
        productService.saveProduct(ring);
        productService.saveProduct(scarf);
        productService.saveProduct(hat);
    }
}

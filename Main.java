public class Main {
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();
        HotDrinkVendingMachine hot = new HotDrinkVendingMachine();
        
        vm.addProduct(new Product("Яблоко", 20));
        vm.addProduct(new Product("Груша", 30));
        vm.addProduct(new Drink("Lipton", 40, 0.5, TypesOfDrink.COLDTEA));
        vm.addProduct(new Chocolate("Аленка", 40, 50));
        hot.addProduct(new HotDrink("Кофе", 50, 1.0, 80, TypesOfDrink.HOTDRINKS));
        hot.addProduct(new HotDrink("Какао", 25, 0.35, 60, TypesOfDrink.HOTDRINKS));

        System.out.println(vm);
        System.out.println(hot);

    }
}
public class Main {
    public static void main(String[] args) {
        // Задача №1
        System.out.println("Задача №1:");
        int[] cost = new int[5];
        for (int i = 0; i < cost.length; i++) {
            cost[i] = (int) (Math.random() * 100);
            System.out.print(cost[i] + " ");
        }
        System.out.println();
        int summCost = 0;
        for (int i = 0; i < cost.length; i++) {
            summCost += cost[i];
        }
        System.out.println("Сумма трат за месяц составила: " + summCost + " рублей");
    }
}
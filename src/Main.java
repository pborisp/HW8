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
        System.out.println();

        // Задача №2
        System.out.println("Задача №2:");
        int[] costSecond = new int[5];
        for (int i = 0; i < costSecond.length; i++) {
            costSecond[i] = (int) (Math.random() * 100);
            System.out.print(costSecond[i] + " ");
        }
        System.out.println();
        int minCost = 1000;
        int maxCost = -1;
        for (int i = 0; i < costSecond.length; i++) {
            if (costSecond[i] < minCost) {
                minCost = costSecond[i];
            }
            if (costSecond[i] > maxCost) {
                maxCost = costSecond[i];
            }
        }
        System.out.println("Минимальная сумма трат за месяц составила: " + minCost + " рублей");
        System.out.println("Максимальная сумма трат за месяц составила: " + maxCost + " рублей");
    }
}
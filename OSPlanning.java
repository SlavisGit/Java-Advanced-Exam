package ResolveExam;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class OSPlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> tasks = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt).forEach(tasks::push);
        ArrayDeque<Integer> threads = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).forEach(threads::offer);
        int taskToKill = Integer.parseInt(scanner.nextLine());

        while (tasks.contains(taskToKill)){
            if(taskToKill == tasks.peek()) {
                break;
            }
            if(threads.peek() >= tasks.peek()){
                threads.poll();
                tasks.pop();
            } else {
                threads.poll();
            }
        }
        System.out.printf("Thread with value %d killed task %d%n", threads.peek(), taskToKill);
        StringBuilder builder = new StringBuilder();
        for (Integer thread : threads) {
            builder.append(thread).append(" ");
        }
        System.out.println(builder.toString().trim());
    }
}

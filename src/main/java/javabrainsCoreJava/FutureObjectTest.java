package javabrainsCoreJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.*;

public class FutureObjectTest {

    public static void main(String[] args) throws Exception{
        List<Future<Integer>> futures = new ArrayList<>();
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("\n I can tell you nth prime number");
            int n = sc.nextInt();
            if(n == 0){
                break;
            }
            Callable<Integer> c=  new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    Thread.sleep(10000);
                    return 10;
                }
            };
            Future future = executorService.submit(c);
            futures.add(future);
            Iterator<Future<Integer>> iterator = futures.iterator();
            while (iterator.hasNext()){
                Future<Integer> next = iterator.next();
                if(next.isDone()){
                    System.out.println("result is "+next.get());
                    futures.remove(next);
                }
            }

        }
    }
}

package Practicals;
import java.util.Random;
class SharedData {
    private int data;
    private boolean isEven;
    private boolean dataAvailable = false;

    synchronized void setData(int value) {
        data = value;
        isEven = value % 2 == 0;
        dataAvailable = true;
        notifyAll();
    }

    synchronized DataPair getData() {
        while (!dataAvailable) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        dataAvailable = false; // Reset the flag after retrieving
        return new DataPair(data, isEven);
    }

    class DataPair {
        int value;
        boolean isEven;

        DataPair(int value, boolean isEven) {
            this.value = value;
            this.isEven = isEven;
        }
    }
}
// GeneratorThread remains unchanged
class GeneratorThread extends Thread {
    private SharedData sharedData;
    private Random random;

    GeneratorThread(SharedData sharedData) {
        this.sharedData = sharedData;
        this.random = new Random();
    }

    @Override
    public void run() {
        while (true) {
            int value = random.nextInt(100);
            sharedData.setData(value);
            System.out.println("Generated: " + value);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class SquareThread extends Thread {
    private SharedData sharedData;

    SquareThread(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        while (true) {
            SharedData.DataPair dataPair = sharedData.getData();
            if (dataPair.isEven) {
                int square = dataPair.value * dataPair.value;
                System.out.println("Square: " + square);
            }
        }
    }
}

class CubeThread extends Thread {
    private SharedData sharedData;

    CubeThread(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        while (true) {
            SharedData.DataPair dataPair = sharedData.getData();
            if (!dataPair.isEven) {
                int cube = dataPair.value * dataPair.value * dataPair.value;
                System.out.println("Cube: " + cube);
            }
        }
    }
}

public class MultiThreadApp {
    public static void main(String[] args) {
        SharedData sharedData = new SharedData();
        new GeneratorThread(sharedData).start();
        new SquareThread(sharedData).start();
        new CubeThread(sharedData).start();
    }
}
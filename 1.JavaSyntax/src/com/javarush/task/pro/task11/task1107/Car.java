package com.javarush.task.pro.task11.task1107;

/* 
Двигатель — сердце автомобиля
*/

public class Car {
    Engine engine = new Engine();
    public class Engine {
        private boolean isRunning = true;

        public boolean getRunning() {
            return isRunning;
        }

        public void setRunning(boolean running) {
            isRunning = running;
        }

        public void start() {
            setRunning(true);
        }
        public void stop() {
            setRunning(false);
        }
    }
}


package com.company;

    public class Car extends Vehicle {

        private String color;
        private String name;

        public Car(int handSteering, int changingGears, int speed, String color, String name) {
            super(1, 1, speed);
            this.color = color;
            this.name = name;
        }

        public void titit(){
            System.out.println("Car.titit() called");
        }

        public void drifting(){
            System.out.println("Car.drifting() called");
        }

        @Override
        public void gears(int speed) {
            drifting();
            super.gears(speed);
        }
    }



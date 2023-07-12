package Models;

import Repository.Smartphones;

public class Androids implements Smartphones{
        private String model;
        private double price;

        public Androids(String model, double price) {
            this.model = model;
            this.price = price;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }


        @Override
        public void call() {
            System.out.println("Android calling");

        }

        @Override
        public void sms() {
            System.out.println("Android sms");

        }

        @Override
        public void internet() {
            System.out.println("Android wifi");

        }

        @Override
        public void showOperationSystem() {
            System.out.println("Android 13");

        }

    }
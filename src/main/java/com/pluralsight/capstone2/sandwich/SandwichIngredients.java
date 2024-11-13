package com.pluralsight.capstone2.sandwich;

 class SandwichIngredients
{
    SandwichBuilder sb;

    enum Size {
        SMALL,
        MEDIUM,
        LARGE
}
    public class Bread {
        private String kind;
        private double price;

        public Bread(String kind, double price) {
            this.kind = kind;
            this.price = price;
        }
    }

    public class Meat {
        private String kind;
        private double price;

        public Meat(String kind, double price) {
            this.kind = kind;
            this.price = price;
        }
    }

    public class Cheese {
        private String kind;
        private double price;

        public Cheese(String kind, double price) {
            this.kind = kind;
            this.price = price;
        }
    }

    public class Veggie {
        private String kind;
        private double price;

        public Veggie(String kind, double price) {
            this.kind = kind;
            this.price = price;
        }
    }

}

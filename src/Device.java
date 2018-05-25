class Device {
    String code;
    String producer;
    String type;
    double price;

    Device(String c, String prod, String t) {
        this.code = c;
        this.producer = prod;
        this.type = t;
    }
    Device(String c, String prod, String t, double p) {
        this(c,prod,t);
        this.price = p;
    }
    String getInfo() {
        System.out.println(this.code + " " + this.producer + " " + this.type);
    }

    String getInfo() {
        System.out.println(this.code + " " + this.producer + " " + this.type + " " + this.price);
    }
}


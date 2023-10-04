package B1_DecoratorPattern;

public class MainB1 {
    public static void main(String[] args) {
        BieuThuc bt1 = new Cong(new Nhan(new Cong(new BieuThucDonGian(6), new BieuThucDonGian(9)), new BieuThucDonGian(8)), new BieuThucDonGian(5));
        System.out.println(bt1.bieuThuc() + " = " + bt1.giaTri());

        BieuThuc bt2 = new Tru(new Cong(new Nhan(new Chia(new Cong(new BieuThucDonGian(8), new BieuThucDonGian(6)), new BieuThucDonGian(2)), new BieuThucDonGian(5)), new BieuThucDonGian(8)), new BieuThucDonGian(4));
        System.out.println(bt2.bieuThuc() + " = " + bt2.giaTri());
    }
}


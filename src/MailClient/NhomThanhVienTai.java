package MailClient;

import java.util.*;

public class NhomThanhVienTai implements DiaChiEmailTai {
    private List<DiaChiEmailTai> listEmailTai = new ArrayList<>();

    public void add(DiaChiEmailTai diachiEmailTai) {
        listEmailTai.add(diachiEmailTai);
    }

    public void remove(DiaChiEmailTai diachiEmail) {
        listEmailTai.remove(diachiEmail);
    }

    @Override
    public void sendMail(String message) {
        for (DiaChiEmailTai user : listEmailTai) {
            user.sendMail(message);
        }
    }

    @Override
    public void printInfo() {
        for (DiaChiEmailTai user : listEmailTai) {
            user.printInfo();
        }
    }
}
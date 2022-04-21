package com.contohlatihan.percobaan1.controller;

import com.contohlatihan.percobaan1.model.Mahasiswa;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/mahasiswa")
public class PengaturDaftar {

    //percobaan panggil hai
    @GetMapping("/")
    public String hello(){return "Hai, Selamat Pagi!"; }

    //percobaan panggil data mahasiswa 1
    @GetMapping ("/mahasiswa")
    public Mahasiswa getMahasiswa(){
        Mahasiswa m = new Mahasiswa();
        m.setNama("Abednego");
        m.setAlamat("Malang");
        m.setNoHP("081334178147");
        return m;
    }

    //percobaan panggil data mahasiswas
    @GetMapping("/mahasiswas")
    public List<Mahasiswa> getListMahasiswa(){
        List<Mahasiswa> list = new ArrayList<>();
        Mahasiswa m1 = new Mahasiswa();
        m1.setNama("Abednego");
        m1.setAlamat("Malang");
        m1.setNoHP("081334178147");
        list.add(m1);

        Mahasiswa m2 = new Mahasiswa();
        m2.setNama("Bogi");
        m2.setAlamat("Surabaya");
        m2.setNoHP("087763127572");
        list.add(m2);

        Mahasiswa m3 = new Mahasiswa();
        m3.setNama("Christian");
        m3.setAlamat("Bali");
        m3.setNoHP("0341715717");
        list.add(m3);

        return list;
    }
}

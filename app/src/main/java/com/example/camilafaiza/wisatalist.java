package com.example.camilafaiza;

import java.util.ArrayList;

public class wisatalist {
    private static String[]  wisatanama= {
            "Raja Ampat",
            "Candi BoroBudur",
            "Gunung Bromo",
            "Jam Gadang Bukittinggi",
            "Danau Toba",
            "Rekreasi Ancol",
            "Paralayang Batu,",
            "Taman Mini Indonesia",
            "Tugu Monas",
            "Seminyak Bali",
    };

    private static String[] wisataDetails = {
            "Papua Barat","Jawa Tengah","Jawa Timur","Bukittinggi, Sumatera Barat","Sumatera Utara","Pademangan, Jakarta Utara"
            ,"Kota Batu, Jawa Timur","Kota Jakarta Timur, Daerah Khusus Ibukota Jakarta","Kota Jakarta Pusat, Daerah Khusus Ibukota Jakarta"
            ,"Badung, Kuta"
    };

    private static int[] wisataFoto = {
            R.drawable.rajaampat3,R.drawable.candi,R.drawable.gunungbromo,R.drawable.jamgadang2,
            R.drawable.danautoba, R.drawable.ancol,R.drawable.paralayang2,R.drawable.tamanmini,R.drawable.monas,
            R.drawable.seminyak2
    };
    private static float[] wisataRating ={
            (float) 4.2, (float) 4.4, (float) 4.6, (float) 4.6, (float) 4.6,
            (float) 4 ,(float) 4.7, (float) 4.6, (float) 4.6, (float) 4.6,
    };
    private static String[] wisatadesc={
            "Kepulauan Raja Ampat merupakan rangkaian empat gugusan pulau yang berdekatan dan berlokasi di barat bagian Kepala Burung Pulau Papua. Secara administrasi, gugusan ini berada di bawah Kabupaten Raja Ampat, Alamat Papua Barat. Ada empat pulau utama di sini, yaitu Waigeo, Misool, Salawati dan Batanta",
            "Borobudur adalah sebuah candi Buddha yang terletak di Borobudur, Magelang, Jawa Tengah, Indonesia. Candi ini terletak kurang lebih 100 km di sebelah barat daya Semarang, 86 km di sebelah barat Surakarta, dan 40 km di sebelah barat laut Yogyakarta",
            "Gunung Bromo atau dalam bahasa Tengger dieja \"Brama\", adalah sebuah gunung berapi aktif di Jawa Timur, Indonesia. Gunung ini memiliki ketinggian 2.329 meter di atas permukaan laut dan berada dalam empat wilayah kabupaten, yakni Kabupaten Probolinggo, Kabupaten Pasuruan, Kabupaten Lumajang, dan Kabupaten Malang",
            "Jam Gadang adalah nama untuk menara jam yang terletak di pusat kota Bukittinggi, Sumatra Barat, Indonesia. Menara jam ini memiliki jam dengan ukuran besar di empat sisinya sehingga dinamakan Jam Gadang, sebutan bahasa Minangkabau yang berarti jam besar",
            "Danau Toba adalah danau alami berukuran besar di Indonesia yang berada di kaldera Gunung Supervulkan. Danau ini memiliki panjang 100 kilometer, lebar 30 kilometer, dan kedalaman 1600 meter. Danau ini terletak di tengah pulau Sumatra bagian utara dengan ketinggian permukaan sekitar 900 meter.",
            "Destinasi di tepi laut Ancol memiliki pantai yang populer untuk olahraga air dan kompleks di tepi laut yang dilengkapi rollercoaster serta wahana di Dunia Fantasi dan taman rekreasi air Atlantis Water Adventure. Keluarga juga dapat menikmati akuarium SeaWorld dengan hiu dan kura-kuranya, serta Ocean Dream Samudra yang menampilkan pertunjukan lumba-lumba dan singa laut. Pasar Seni Ancol menampilkan seniman lokal yang baru muncul dan mengadakan pertunjukan tarian di akhir pekan",
            "Paralayang batu merupakan salah satu wisata  terindah di jawa timur. Saat siang, bisa melakukan olahraga paralayang dan saat malam bisa menikmati indahnya kota  ",
            "Taman Mini Indonesia Indah merupakan suatu kawasan taman wisata bertema budaya Indonesia di Jakarta Timur. Area seluas kurang lebih 150 hektare atau 1,5 kilometer persegi ini terletak pada koordinat 6°18′6.8″LS,106°53′47.2″BT",
            "Monumen Nasional atau yang populer disingkat dengan Monas atau Tugu Monas adalah monumen peringatan setinggi 132 meter yang didirikan untuk mengenang perlawanan dan perjuangan rakyat Indonesia untuk merebut kemerdekaan dari pemerintahan kolonial Hindia Belanda",
            "Seminyak adalah kelurahan di kecamatan Kuta, Badung, Bali, Indonesia. Daerah ini terkenal pula sebagai tempat wisata pantai, lengkap dengan berbagai fasilitas seperti hotel, spa, restoran, bar, kafe dan toko. Pantai yang terdapat di Kelurahan Seminyak antara lain Pantai KuDeTa, Pantai Seminyak, dan Pantai Double Six."

    };
    private static String[] alamatdetail={
            "Papua Barat",
            "Jl. Badrawati, Kw. Candi Borobudur, Borobudur, Kec. Borobudur, Magelang, Jawa Tengah",
            "Jawa Timur",
            "Bukittinggi, Sumatera Barat",
            "Sumatera Utara",
            "Pademangan, Jakarta Utara",
            "Jl. Arumdalu No.20, Songgokerto, Kec. Batu, Kota Batu, Jawa Timur 65312",
            "Kota Jakarta Timur, Daerah Khusus Ibukota Jakarta",
            "Gambir, Kecamatan Gambir, Kota Jakarta Pusat, Daerah Khusus Ibukota Jakarta",
            "Badung, Kuta, Bali"
    };
    static ArrayList<wisata> getListData() {
        ArrayList<wisata> list = new ArrayList<>();
        for (int position = 0; position < wisatanama.length; position++) {
            wisata w = new wisata();
            w.setNama(wisatanama[position]);
            w.setDetail(wisataDetails[position]);
            w.setFoto(wisataFoto[position]);
            w.setRating(wisataRating[position]);
            w.setDesc(wisatadesc[position]);
            w.setAlamat(alamatdetail[position]);
            list.add(w);
        }
        return list;
    }
}



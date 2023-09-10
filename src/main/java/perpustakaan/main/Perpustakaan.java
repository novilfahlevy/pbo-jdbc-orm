/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package perpustakaan.main;

import java.util.ArrayList;
import perpustakaan.member.Member;

/**
 *
 * @author novil
 */
public class Perpustakaan {

    public static void main(String[] args) {
        // membuat data member
        Member member = new Member();
        
        member.nama = "Wahyu";
        member.email = "wahyu@gmail.com";
        member.nomorTelepon = "08123456";
        
        if (member.create()) {
            System.out.println("Member berhasil ditambahkan.");
        }
        
        // mengambil data member berdasarkan id
//        Member member = new Member();
//        
//        member.find(24);

//        System.out.println(member.getId());
//        System.out.println(member.nama);
//        System.out.println(member.email);
//        System.out.println(member.nomorTelepon);
        
        // mengupdate data member
//        Member member = new Member();
//        
//        member.find(24);
//        
//        member.nama = "Marcelius";
//        member.email = "marcelius@gmail.com";
//        
//        if (member.update()) {
//            System.out.println("Member berhasil diupdate.");
//        }

        // menghapus data member
//        Member member = new Member();
//        
//        member.find(24);
//        
//        if (member.delete()) {
//            System.out.println("Member berhasil dihapus.");
//        }
        
//        Database db = new Database();
//        
//        db.openConnection();
//        
//        ArrayList<ArrayList> members = db.all("SELECT * FROM member");
//        
//        System.out.println(members);
//        
//        db.closeConnection();
    }
}

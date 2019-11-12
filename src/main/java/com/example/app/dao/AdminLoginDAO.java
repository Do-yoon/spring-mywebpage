package com.example.app.dao;

import com.example.app.vo.AdminVO;

import java.io.*;

public class AdminLoginDAO {
    public boolean loginCheck(AdminVO admin){
        // to do: account encryption
        BufferedReader bufferedReader;
        boolean valid = false;
        try {
            bufferedReader = new BufferedReader(new FileReader(new File("../../../resources/data/admin.txt")));
            String id = bufferedReader.readLine();
            String pw = bufferedReader.readLine();
            if (admin.getId() == id && admin.getPw() == pw)
                valid = true;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return valid;
    }
    public AdminVO viewAdmin(){
        BufferedReader bufferedReader;
        AdminVO adminVO = new AdminVO();
        try {
            bufferedReader = new BufferedReader(new FileReader(new File("../../../resources/data/admin.txt")));
            String id = bufferedReader.readLine();
            adminVO.setId(id);
            String pw = bufferedReader.readLine();
            adminVO.setPw(pw);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return adminVO;
    }
}

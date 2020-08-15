package ir.shiveh.addmarker;

import android.app.Application;

import ir.map.sdk_map.Mapir;

public class AppController extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        //TODO Please add your API_KEY
        Mapir.getInstance(this, "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImp0aSI6IjUyMTdmNWFmNGE5YjViNTY4MzJiMzg5NDgwM2JmOTRiYTgzYmJlZGMxMGJlNTlhNDRmNDQyYzE0N2ZjNTgyOGU4N2NkODRhZTkyN2QyMzg5In0.eyJhdWQiOiI5MTA0IiwianRpIjoiNTIxN2Y1YWY0YTliNWI1NjgzMmIzODk0ODAzYmY5NGJhODNiYmVkYzEwYmU1OWE0NGY0NDJjMTQ3ZmM1ODI4ZTg3Y2Q4NGFlOTI3ZDIzODkiLCJpYXQiOjE1ODg2NzgzMTQsIm5iZiI6MTU4ODY3ODMxNCwiZXhwIjoxNTkxMjcwMzE0LCJzdWIiOiIiLCJzY29wZXMiOlsiYmFzaWMiXX0.Q6MuJkUb32mfxzvAYC1Y76InegswZtUnwpd7pjVwpUuvPegBShsdUw10Ya0LwOFEPEVahXOW0wTfIwrq_Qz-YZJLYmHwPk22kyu5WWoff6VhwvOVzeLabUbfsUoKrAlqydhBo8i41WxnuwWMdRaQvvWN3dzOM6TMkCc-7fCr-Ld_2zawZxRnRmUZ0UEjE92LpsyXA2WjtQ_f5UQJ7vZcteVCNw0A1ZXt4K1nzSH_VKV5_g1j6mPd1B5TJxNblJE2XKIAyxzeB-IV6F4YXN64LIg77j7occj8ayLGa0sybeKlj_txN17mvTnun-u-_vbY4UJCmT4PC_UaTatyUaLwyA");
    }
}

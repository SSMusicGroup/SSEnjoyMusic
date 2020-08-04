package com.example.ssenjoymusicapp.Service;

import com.example.ssenjoymusicapp.Model.Baihat;
import com.example.ssenjoymusicapp.Model.ChuDeVaTheLoai;
import com.example.ssenjoymusicapp.Model.PlaylistToday;
import com.example.ssenjoymusicapp.Model.QuangCao;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

//Class dùng để gửi lên những phương thức tương tác với server, sau khi đã kết nối sẽ nhận dữ liệu về.
public interface DataService {
    //Tương tác với đường link
    @GET("songbanner.php")
    //Nhận dữ liệu
    Call<List<QuangCao>> GetDataQuangcao();

    @GET("playlistforcurrentday.php")
    Call<List<PlaylistToday>> GetDataPlaylistToday();

    @GET("ChuDeVaTheLoaiTrongNgay.php")
    Call<List<ChuDeVaTheLoai>> GetDataChuDeVaTheLoai();

    //Sử dụng phương thức POST để gửi dữ liệu lên server và nhận về
    @FormUrlEncoded
    @POST("DanhSachBaiHat.php")
    Call<List<Baihat>> GetDanhSachBaihatTheoQuangCao(@Field("idQuangCao") String idQuangCao);

}

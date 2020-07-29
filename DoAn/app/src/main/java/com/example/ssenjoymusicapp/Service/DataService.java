package com.example.ssenjoymusicapp.Service;

import com.example.ssenjoymusicapp.Model.PlaylistToday;
import com.example.ssenjoymusicapp.Model.QuangCao;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

//Class dùng để gửi lên những phương thức tương tác với server, sau khi đã kết nối sẽ nhận dữ liệu về.
public interface DataService {
    //Tương tác với đường link
    @GET("songbanner.php")
    //Nhận dữ liệu
    Call<List<QuangCao>> GetDataQuangcao();

    @GET("playlistforcurrentday.php")
    Call<List<PlaylistToday>> GetDataPlaylistToday();
}

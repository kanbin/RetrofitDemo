package com.example.retrofitdemo;

import android.support.annotation.MainThread;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import java.io.IOException;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.Result;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void request(View view) {

        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl("https://apin.bjaiyouyou.com/")
                .baseUrl("http://api2.bjiuu.com/")
                .build();

        AdService adService = retrofit.create(AdService.class);
        Call<ResponseBody> call = adService.getAd(1);
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    Log.d(TAG, "onResponse code: " + response.code());
                    Log.d(TAG, "onResponse body: " + response.body().string());
                } catch (IOException e) {
                    e.printStackTrace();

                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                t.printStackTrace();
            }
        });
    }

    /**
     * 使用Converter，对Call<T>中的T进行转换，以Gson为例
     *
     * @param view
     */
    public void request2_converter(View view) {
        Gson gson = new GsonBuilder()
                //配置你的Gson
                .setDateFormat("yyyy-MM-dd hh:mm:ss")
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api2.bjiuu.com/")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        AdService adService = retrofit.create(AdService.class);
        Call<AdModel> call = adService.getAd2(1);
        call.enqueue(new Callback<AdModel>() {
            @Override
            public void onResponse(Call<AdModel> call, Response<AdModel> response) {
                AdModel model = response.body();
                Log.d(TAG, "onResponse total page: " + model.getTotal());

            }

            @Override
            public void onFailure(Call<AdModel> call, Throwable t) {
                t.printStackTrace();
            }
        });
    }

    /**
     * 使用CallAdapter，对Call<T>中的Call进行转换，以RxJava为例，用Observable代替Call
     *
     * @param view
     */
    public void request2_CallAdapter(View view) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api2.bjiuu.com/")
                .addConverterFactory(GsonConverterFactory.create())
//                .addCallAdapterFactory(RxJavaCallAdapterFactory.create()) // 针对rxjava2.x
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();

        AdService adService = retrofit.create(AdService.class);

        adService.getAd3(1)
//                .subscribeOn(Schedulers.io())
                .subscribeOn(Schedulers.newThread())
                .subscribe(new Observer<AdModel>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(AdModel value) {
                        Log.d(TAG, "onNext: " + value.getTotal());
                        Log.d(TAG, "onNext: " + value.toString());

                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.d(TAG, "onError: ");
                        e.printStackTrace();
                    }

                    @Override
                    public void onComplete() {
                        Log.d(TAG, "onComplete: ");
                    }
                });
    }

    interface AdService {
        @GET("api/v1/task/index2")
        Call<ResponseBody> getAd(@Query("page") int pageNo);

        @GET("api/v1/task/index2")
        Call<AdModel> getAd2(@Query("page") int pageNo);

        @GET("api/v1/task/index2")
        Observable<AdModel> getAd3(@Query("page") int pageNo);
    }

    /**
     * 明白@Query和@Path的区别了
     * @Query
     * "api/v1/task/index2"
     * getAd(@Query("page") int pageNo)
     * 会在URL之后自动添加?page=pageNo
     *
     * @Path 则是个占位
     * ”api/v1/{content}/index2
     * getAd(@Path("content") String title)
     * 传参值会自动填充到URL的{content}
     */

}

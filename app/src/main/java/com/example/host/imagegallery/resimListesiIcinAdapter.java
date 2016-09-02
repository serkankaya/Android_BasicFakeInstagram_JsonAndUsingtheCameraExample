package com.example.host.imagegallery;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Java3 on 8/16/2016.
 */
public class resimListesiIcinAdapter extends BaseAdapter{
    private LayoutInflater inf;
    private List<resim> urls;
    private Activity ac;
    public resimListesiIcinAdapter(Activity ac, List<resim> urls){
        inf=(LayoutInflater)ac.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.urls=urls;
        this.ac=ac;


    }

    @Override
    public int getCount() {
        return urls.size();
    }

    @Override
    public Object getItem(int i) {
        return urls.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    public static int tikla = -1;
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View view1;
        tikla = i;
        view1=inf.inflate(R.layout.resimlistesirow,null);
        TextView urunBasliktxt=(TextView)view1.findViewById(R.id.resimaditxt);
        TextView urunFiyattxt=(TextView)view1.findViewById(R.id.tarihtxt);
        ImageView vresim=(ImageView)view1.findViewById(R.id.resimimageview);
        VideoView myvideos=(VideoView)view1.findViewById(R.id.videoView);
        vresim.setVisibility(View.VISIBLE);
        myvideos.setVisibility(View.GONE);

        resim ul=urls.get(i);
        urunBasliktxt.setText(ul.getBaslik());
        urunFiyattxt.setText(ul.getVidID());
        Picasso.with(ac).load(ul.getResimUrl()).into(vresim);
        Log.d("videoURL : ",ul.getMyvideos());
        if (!ul.getMyvideos().equals("")){
            Log.d("deneme13 : ",ul.getMyvideos());
            vresim.setVisibility(View.GONE);
            myvideos.setVisibility(View.VISIBLE);
            MediaController mc=new MediaController(ac);
            Uri adres = Uri.parse(ul.getMyvideos());
            myvideos.setMediaController(mc);
            myvideos.setVideoURI(adres);
            myvideos.start();
            myvideos.stopPlayback();


        }

        return view1;
    }

}

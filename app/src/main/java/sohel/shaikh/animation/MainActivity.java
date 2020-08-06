package sohel.shaikh.animation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button show_images;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        show_images = findViewById(R.id.show_img_btns);
       // BottomNavigationView navView = findViewById(R.id.navbottom);


        show_images.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent images = new Intent(MainActivity.this,Images_Animation.class);
                startActivity(images);
            }
        });

    }


    public void Show_Color_animation(View view) {
        Intent colors = new Intent(MainActivity.this,Color_Aniamtion.class);
        startActivity(colors);
    }



    public void show_other_anamtion(View view) {
        Intent other = new Intent(MainActivity.this,Other_Aniamtion.class);
        startActivity(other);
    }

}

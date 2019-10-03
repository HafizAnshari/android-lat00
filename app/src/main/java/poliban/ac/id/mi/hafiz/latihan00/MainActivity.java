package poliban.ac.id.mi.hafiz.latihan00;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //menentukan layout yang digunakan oleh Mainactivity
        //ada di folder res/layout
        setContentView(R.layout.activity_main);
        //hubungkan view/komponen yg ada dilayout
        // ke object dari kelas yang sesuai dengan view/komponen tersebut
        Button btFirst = findViewById(R.id.btFirst);
        Button btSecond = findViewById(R.id.btSecond);
        Button btThree = findViewById(R.id.btThree);
        Button btfour = findViewById(R.id.btFour);
        //memasang event listener kepada masing2 object button
        //dengan parameter this (object dari kelas sekarang)

        btFirst.setOnClickListener(this);
        btSecond.setOnClickListener(this);
        btThree.setOnClickListener(this);
        btfour.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btFirst:
                Toast.makeText(this, "Hai anda sudah mengklik First", Toast.LENGTH_SHORT).show();
                break;
                    case R.id.btSecond:
                Toast.makeText(this, "anda sudah mengklik Second", Toast.LENGTH_SHORT).show();
                break;
                    case R.id.btThree:
                Toast.makeText(this, "anda sudah mengklik Three", Toast.LENGTH_SHORT).show();
                break;
                    case R.id.btFour:
                Toast.makeText(this, "Hai anda sudah mengklik Four", Toast.LENGTH_SHORT).show();
                break;


        }
    }
}

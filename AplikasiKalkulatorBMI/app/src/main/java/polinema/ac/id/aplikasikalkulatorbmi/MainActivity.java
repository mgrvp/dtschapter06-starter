package polinema.ac.id.aplikasikalkulatorbmi;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private EditText tinggi;
    private EditText bobot;
    private  EditText umur;
    private RadioGroup rgGender;
    private RadioButton rdGender;

    int tampilBerat;
    int tampilTinggi;
    int tampilUmur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
    }
    

}

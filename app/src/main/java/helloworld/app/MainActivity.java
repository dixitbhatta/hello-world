package helloworld.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {
EditText Input;
   TextView Output;
    Button btnSubmit;
    Button btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Input = (EditText) findViewById(R.id.editTextInput);
        Output = (TextView) findViewById(R.id.textOut);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        btnClear = (Button) findViewById(R.id.btnClear);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String varInput = Input.getText().toString();
                Output.setText(varInput);
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClear();
            }
        });


    }

    private void onClear()
    {
        //Input = (EditText) findViewById(R.id.editTextInput);
        Input.setText("");
        Output.setText("");
    }




}
